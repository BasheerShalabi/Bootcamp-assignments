from django.shortcuts import render,redirect

import random

def index(request):
    if not 'number' in request.session:
        request.session['number'] = random.randint(1,100)
    if not 'result' in request.session:
        request.session['result'] = 0
    if not 'attempts' in request.session:
        request.session['attempts'] = 0
    if not 'chances' in request.session:
        request.session['chances'] = 50  # should be 5
    return render(request,"index.html")

def handle_guess(request):
    if request.POST["guess"] == '':
        guess = 0
    else:
        guess = int(request.POST["guess"])

    if guess == request.session['number']:
        request.session['result'] = 3
        request.session['attempts'] +=1
    elif request.session['chances'] == 0:
        request.session['result'] = 4
    elif guess <= request.session['number']:
        request.session['result'] = 1
        request.session['attempts'] +=1
        request.session['chances'] -= 1
    elif guess >= request.session['number']:
        request.session['result'] = 2
        request.session['attempts'] +=1
        request.session['chances'] -= 1
    

    return redirect("/")

def play_again(request):
    del request.session['number']
    del request.session['result']
    del request.session['attempts']
    del request.session['chances']

    return redirect('/')

def leaderboard(request):
    request.session['username'] = request.POST['username']
    return render(request,'leaderboard.html')