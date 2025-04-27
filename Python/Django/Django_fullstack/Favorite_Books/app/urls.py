from django.urls import path
from . import views

urlpatterns = [
    path('',views.index),
    path('register',views.register),
    path('login',views.login),
    path('logout',views.logout),
    path('books',views.success),
    path('books/<int:book_id>',views.book_info),
    path('books/new',views.new_book),
    path('books/add_favorite',views.add_favorite),
    path('books/delete',views.delete_book),
    path('books/update',views.update_book),
    path('books/unfavorite',views.unfavorite_book),
]