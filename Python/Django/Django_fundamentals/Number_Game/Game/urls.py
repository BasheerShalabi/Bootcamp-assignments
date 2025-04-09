from django.urls import path
from . import views

urlpatterns =[
    path('',views.index),
    path('handle_guess',views.handle_guess),
    path('play_again',views.play_again),
    path('leaderboard',views.leaderboard)
]