from django.urls import path
from . import views
urlpatterns = [
    path('', views.index ,name ='index'),
    path('increment2',views.increment2),
    path('increment_by',views.incrementBy),
    path('destroy_session',views.destroy),

]