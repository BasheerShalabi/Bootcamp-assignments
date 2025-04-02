from flask import Flask  
app = Flask(__name__)    
@app.route('/')          
def hello_world():
    return 'Hello World!'  
@app.route('/Champion')
def Champion():
    return 'Champion!'
@app.route('/say/<name>')
def say(name):
    return name
@app.route('/repeat/<int:iterations>/<text>')
def repeat(iterations,text):
        return (text+"\n")*iterations
@app.errorhandler(404)
def handle_error(error):
    return "Error\n" + str(error)
if __name__=="__main__":      
    app.run(debug=True)  