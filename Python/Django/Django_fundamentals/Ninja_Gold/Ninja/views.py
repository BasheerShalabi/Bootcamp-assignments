from django.shortcuts import render , redirect
from time import gmtime, strftime
import random


def index(request):
    if not 'activites' in request.session:
        request.session['activites'] = ''
    if not 'gold' in request.session:
        request.session['gold'] = 0

    return render(request,"index.html")
# Create your views here.

def process_money(request,location):
    if request.method == "POST":
        time = strftime("%Y-%m-%d %H:%M %p", gmtime())
        gold = random.randint(int(request.POST['min']),int(request.POST['max']))
        chance = 1
        
        if location == "Quest":
            chance = random.randint(0,1)
        
        if chance:
            request.session['gold'] += gold
            request.session['activites'] =f"<p class='green'> You entered a {location} and earned {gold} gold. ({time}) </p>" + request.session['activites']
        else:
            request.session['gold'] -= gold
            request.session['activites'] =f"<p class='red'> You entered a {location} and lost {gold} gold. ({time}) </p>" + request.session['activites']
        
        
        return redirect('/')

def delete(request):
    request.session.clear()
    return redirect('/')