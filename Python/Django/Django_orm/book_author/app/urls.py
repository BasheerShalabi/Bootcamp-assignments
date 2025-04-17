from django.urls import path
from . import views

urlpatterns = [
    path('', views.index),
    path('add_book' , views.add_books),
    path('authors', views.authors_page),
    path('add_author', views.add_author),
    path('books/<int:id>',views.books_detail),
    path('authors/<int:id>',views.author_detail)




    
]

