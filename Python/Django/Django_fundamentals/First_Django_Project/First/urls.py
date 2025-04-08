
from django.urls import path
from . import views
urlpatterns = [
    path('', views.root ,name ='root'),
    path('blogs', views.index ,name ='index'),
    path('blogs/new', views.new ,name ='new'),
    path('blogs/create', views.create ,name ='create'),
    path('blogs/<int:number>', views.show,name ='showw'),
    path('blogs/<int:number>/edit', views.edit ,name ='edit'),
    path('blogs/<int:number>/delete', views.destroy ,name ='delete'),
    path('blogs/json', views.json ,name ='json'),
]