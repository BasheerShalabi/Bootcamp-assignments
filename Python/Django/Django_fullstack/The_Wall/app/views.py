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
                
            return redirect('/success')
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
                    'email': user.email
                }
                return redirect('/success')
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
            'posts': models.get_messages(),
            'comments': models.get_comments()
        }
        return render(request, 'success.html' , context)
    else:
        return redirect('/')

def add_message(request):
    if request.method == 'POST':
        models.add_message(request.session['user']['id'], request.POST['message'])
        return redirect('/success')
    else:
        return redirect('/')

def add_comment(request, message_id):
    if request.method == 'POST':
        models.add_comment(request.session['user']['id'], message_id, request.POST['comment'])
        return redirect('/success')
    else:
        return redirect('/')

def delete_message(request, message_id):
    if request.method == 'POST':
        can_delete=models.delete_message(message_id)
        if can_delete:
            messages.success(request, "")
        else:
            messages.error(request, "message cannot be deleted")
        return redirect('/success')
    else:
        return redirect('/')