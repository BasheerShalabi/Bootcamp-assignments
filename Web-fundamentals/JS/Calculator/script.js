
var expression =""
var display=document.getElementById("display")
var isInOp=false
var font =40

function press(num){
   
     if(num=='.' && !display.innerText.includes('.')){
         display.innerText=`${display.innerText}${num}`
     }else if(isInOp){
        display.innerText=`${num}`
        isInOp=false
     }
    else if(display.innerText=="0" || display.innerText=="NaN" || display.innerText=="undifined" || display.innerText=="Infinity"){
        display.innerText=`${num}`
    }else if(num!='.'){
        display.innerText=`${display.innerText}${num}`
    }

console.log(isInOp)
}

function clr(){
    display.innerText="0"
    expression="0"
    
}

function setOP(op){
    expression = `${display.innerText}${op}`
    isInOp=true
    
}

function calculate(){
    
    if(!(expression.includes('+') || expression.includes('-') || expression.includes('*') || expression.includes('/'))) return
    expression=`${expression}${display.innerText}`
   display.innerText=eval(expression).toFixed(4).replace(/\.?0+$/, '')
   console.log(expression)
   
   expression=""
}
var container = document.getElementById("expretion")
