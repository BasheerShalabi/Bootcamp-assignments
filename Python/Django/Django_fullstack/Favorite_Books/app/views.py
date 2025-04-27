from django.shortcuts import render,redirect
from .models import User
from . import models
from django.contrib import messages
# Create your views here.

def index(request):
    if not 'user' in request.session:
        return render(request, 'index.html')
    else:
        user = request.session['user']
        return render(request, 'success.html', {'user': user})

def register(request):
    if request.method == 'POST':
        errors = User.objects.validate_register(request.POST)
        if len(errors) > 0:
            for key, value in errors.items():
                messages.error(request, value)
            return redirect('/')
        else:
            user = models.register_user(request.POST['first_name'], request.POST['last_name'], request.POST['email'], request.POST['password'])
            request.session['user'] = {
                'id': user.id,
                'first_name': user.first_name,
                'last_name': user.last_name,
                'email': user.email
            }
                
            return redirect('/books')
    else:
        return redirect('/')

def login(request):
    if request.method == 'POST':
        errors = User.objects.validate_login(request.POST)
        if len(errors) > 0:
            for key, value in errors.items():
                messages.error(request, value)
            return redirect('/')
        else:
            user = models.login_user(request.POST['email'], request.POST['password'])
            if user:
                request.session['user'] = {
                    'id': user.id,
                    'first_name': user.first_name,
                    'last_name': user.last_name,
                    'email': user.email,
                }
                return redirect('/books')
            else:
                messages.error(request, "Invalid email or password")
                return redirect('/')
    else:
        return redirect('/')

def logout(request):
    if 'user' in request.session:
        del request.session['user']
    return redirect('/')

def success(request):
    if 'user' in request.session:
        context = {
            'user': request.session['user'],
            'books': models.get_all_books(),
            'favorited_books': models.get_favorites_by_user(request.session['user']['id']),
        }
        return render(request, 'success.html', context)
    else:
        return redirect('/')

def new_book(request):
    if request.method == 'POST':
        errors = models.Book.objects.validate_book(request.POST)
        if len(errors) > 0:
            for key, value in errors.items():
                messages.error(request, value)
            return redirect('/books')
        else:
            book = models.add_book(request.POST, request.session['user']['id'])
            return redirect('/books')
    else:
        return redirect('/books')

def add_favorite(request):
    if request.method == 'POST':
        book = models.add_favorite(request.POST['book_id'], request.session['user']['id'])
        return redirect('/books')
    else:
        return redirect('/books')

def book_info(request, book_id):
    if 'user' in request.session:
        context = {
            'user': request.session['user'],
            'book': models.get_book_by_id(book_id),
            'favorited_by': models.get_favorites_by_book(book_id),
            'favorited_books': models.get_favorites_by_user(request.session['user']['id'])
        }
        if models.get_book_by_id(book_id).uploaded_by.id == request.session['user']['id']:
            return render(request, 'my_book.html', context)
        return render(request, 'other_book.html', context)
    else:
        return redirect('/')
    
def update_book(request):
    if request.method == 'POST':
        errors = models.Book.objects.validate_book(request.POST)
        if len(errors) > 0:
            for key, value in errors.items():
                messages.error(request, value)
            return redirect(f'/books/{request.POST["book_id"]}')
        else:
            book = models.update_book(request.POST)
            return redirect(f'/books/{request.POST["book_id"]}')
    else:
        return redirect('/books')

def delete_book(request):
    if request.method == 'POST':
        models.delete_book(request.POST['book_id'])
        return redirect('/books')
    else:
        return redirect('/books')
    
def unfavorite_book(request):
    if request.method == 'POST':
        book = models.unfavorite_book(request.POST['book_id'], request.session['user']['id'])
        return redirect(f'/books/{request.POST["book_id"]}')
    else:
        return redirect('/books')