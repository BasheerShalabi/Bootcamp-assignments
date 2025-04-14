from django.shortcuts import render , redirect
from . import models
def index(request):
    context={
        "users": models.get_all()
    }
    return render(request,"index.html",context)
# Create your views here.

def add_user(request):
    if request.method == "POST":
        models.create(request.POST)
        return redirect('/')
    else:
        return redirect('/')