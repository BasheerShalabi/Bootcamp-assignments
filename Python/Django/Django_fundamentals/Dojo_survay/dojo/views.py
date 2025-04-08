from django.http import HttpResponse
from django.shortcuts import render

def index(request):
    return render(request,"index.html")


def result(request):
    data = {
        "user": request.POST["username"],
        "language": request.POST["language"],
        "location" : request.POST["location"],
        "comment": request.POST["comment"],
        "fun": request.POST["fun"],
    }

    if "salary" in request.POST:
        data["salary"] = request.POST["salary"]
        print("im inside")
    else:
        data["salary"] = False
        print("im inside 2")

    
    if "costume" in request.POST:
        data["costume"] = request.POST["costume"]
    else:
        data["costume"] = False

    return render(request,"result.html" ,data )