from flask import Flask ,render_template,session,redirect,request
app = Flask(__name__)   
app.secret_key = 'bruh'
@app.route('/')
def landing():
    if "counter" in session:
        session["counter"]+=1
    else:
        session["counter"] = 0
        session["counter"]+=1

    if "actual" in session:
        session["actual"]+=1
    else:
        session["actual"] = 0
        session["actual"]+=1

    return render_template("index.html",counter=session["counter"],actual=session["actual"])

@app.route('/destroy_session')
def destroy():
    if "counter" in session:
        session.clear()
    return redirect("/")

@app.route('/increment2')
def increment2():
    if "counter" in session:
        session["counter"] += 1
    return redirect("/")

@app.route('/reset')
def reset():
    if "counter" in session:
        session["counter"] = 0
    return redirect("/")

@app.route('/increment_by',methods=["POST"])
def incrementBy():
    if "counter" in session:
        session["counter"] += int(request.form["value"])-1
    return redirect("/")

@app.errorhandler(404)
def handle_error(error):
    return "Error\n" + str(error)
if __name__=="__main__":      
    app.run(debug=True , port=3000)   

