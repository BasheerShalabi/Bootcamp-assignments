from django.shortcuts import render,redirect
from .models import User, register_user, login_user
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
            user = register_user(request.POST['first_name'], request.POST['last_name'], request.POST['email'], request.POST['password'])
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
            user = login_user(request.POST['email'], request.POST['password'])
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
        return render(request, 'success.html')
    else:
        return redirect('/')