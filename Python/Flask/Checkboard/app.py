from flask import Flask ,render_template
app = Flask(__name__)   

@app.route('/')
def landing(x=8,y=8,color1='white',color2='black'):
    return render_template("index.html",x=x,y=y,color1=color1,color2=color2)

@app.route('/<int:x>')
def Checkboard1(x,y=8,color1='white',color2='black'):
    return  render_template("index.html",x=x,y=y,color1=color1,color2=color2) 

@app.route('/<int:x>/<int:y>')
def Checkboard2(x,y,color1='white',color2='black'):
    return  render_template("index.html",x=x,y=y,color1=color1,color2=color2) 

@app.route('/<int:x>/<int:y>/<string:color1>/<string:color2>')
def Checkboard3(x,y,color1,color2):
    return  render_template("index.html",x=x,y=y,color1=color1,color2=color2) 


@app.errorhandler(404)
def handle_error(error):
    return "Error\n" + str(error)
if __name__=="__main__":      
    app.run(debug=True , port=3000)   






    # {% if x is undefined %}
    # {% set x = 8 %}
    # {% endif %}
    # {% if y is undefined %}
    # {% set y = 8 %}
    # {% endif %}
    # {% if color1 is undefined %}
    # {% set color1 = "white" %}
    # {% endif %}
    # {% if color2 is undefined %}
    # {% set color2 = "black" %}
    # {% endif %}