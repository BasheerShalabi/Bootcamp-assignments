from django.urls import path
from . import views

urlpatterns = [
    path('', views.index),
    path('add_course', views.add_course),
    path('add_comment/<int:course_id>', views.add_comment),
    path('delete_course/<int:course_id>', views.delete_course),
    path('comments/<int:course_id>', views.comments),
]