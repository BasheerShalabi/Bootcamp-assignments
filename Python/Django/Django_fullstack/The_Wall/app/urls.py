from django.urls import path
from . import views

urlpatterns = [
    path('',views.index),
    path('register',views.register),
    path('login',views.login),
    path('logout',views.logout),
    path('success',views.success),
    path('add_message',views.add_message),
    path('add_comment/<int:message_id>',views.add_comment),
    path('delete/<int:message_id>',views.delete_message),
]