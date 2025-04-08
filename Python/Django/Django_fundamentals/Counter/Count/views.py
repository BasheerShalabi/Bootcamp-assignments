from django.shortcuts import render,redirect

def index(request):
    if "counter" in request.session:
        request.session["counter"]+=1
    else:
        request.session["counter"] = 0
        request.session["counter"]+=1

    if "actual" in request.session:
        request.session["actual"]+=1
    else:
        request.session["actual"] = 0
        request.session["actual"]+=1

    return render(request ,"index.html")

def destroy(request):
    if "counter" in request.session:
        request.session.clear()
    return redirect("/")

def increment2(request):
    if "counter" in request.session:
        request.session["counter"] += 1
    return redirect("/")

def incrementBy(request):
    if "counter" in request.session:
        request.session["counter"] += int(request.POST["value"])-1
    return redirect("/")

