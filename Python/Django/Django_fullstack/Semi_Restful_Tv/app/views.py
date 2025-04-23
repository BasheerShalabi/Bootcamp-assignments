from django.shortcuts import render ,redirect
from . import models
from django.contrib import messages
# Create your views here.

def index(request):
    return redirect('/shows')

def shows(request):
    context = {
        'shows': models.get_all_shows()
    }
    return render(request, 'shows.html', context)

def new_show(request):
    if request.method == 'POST':
        errors = models.Show.objects.validate_show(request.POST)
        if errors:
            for key, value in errors.items():
                messages.error(request, value)
            return redirect('/shows/new')
        show_id = models.add_show(request.POST)
        return redirect(f'/shows/{show_id}')
    return render(request, 'new_show.html')

def show_detail(request, show_id):
    context = {
        'show': models.get_show_by_id(show_id)
    }
    return render(request, 'show_details.html', context)

def edit_show(request, show_id):
    if request.method == 'POST':
        errors = models.Show.objects.validate_show(request.POST)
        if errors:
            for key, value in errors.items():
                messages.error(request, value)
            return redirect(f'/shows/{show_id}/edit')
        models.update_show(show_id, request.POST)
        return redirect(f'/shows/{show_id}')
    context = {
        'show': models.get_show_by_id(show_id)
    }
    return render(request, 'edit_show.html', context)

def delete_show(request, show_id):  
    models.delete_show(show_id)
    return redirect('/shows')