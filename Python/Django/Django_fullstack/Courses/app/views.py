from django.shortcuts import render,redirect
from . import models
# Create your views here.

def index(request):
    context = {
        'courses': models.get_all_courses(),
    }
    return render(request, 'index.html', context)

def add_course(request):
    if request.method == "POST":
        errors = models.Course.objects.validate(request.POST)
        if len(errors) > 0:
            context = {
                'courses': models.get_all_courses(),
                'errors': errors,
            }
            return render(request, 'index.html', context)
        else:
            models.add_course(request.POST['name'], request.POST['description'])
            return index(request)
    else:
        return index(request)

def add_comment(request, course_id):
    if request.method == "POST":
        models.add_comment_to_course(course_id, request.POST['comment'])
        return redirect(f'/comments/{course_id}')
    else:
        return index(request)

def delete_course(request, course_id):
    if request.method == "POST":
        models.delete_course(course_id)
        return index(request)
    else:
        context = {
            'course': models.Course.objects.get(id=course_id),
        }
        return render(request, 'course_delete_modal.html' , context)

def comments(request, course_id):
    context = {
        'course': models.Course.objects.get(id=course_id),
        'comments': models.get_all_comments_of_course(course_id),
    }
    return render(request, 'comments.html', context)