from django.shortcuts import render ,redirect
from django.http import HttpResponse , JsonResponse

def root(request):
    return redirect("/blogs")

def index(request):
    return HttpResponse("placeholder to later display a list of all blogs")

def new(request):
    return HttpResponse("placeholder to later display a new form to create a new blog")

def create(request):
    return redirect("/")

def show(request,number):
    return HttpResponse(f"placeholder to display blog number: {number}")

def edit(request,number):
    return HttpResponse(f"placeholder to edit blog number: {number}")

def destroy(request,number):
    return redirect("/blogs")

def json(request):
    data = {
        "title": "my first blog",
        "content": "Lorem , ipsum dolor sit amet consectetur"
    }
    return JsonResponse(data)