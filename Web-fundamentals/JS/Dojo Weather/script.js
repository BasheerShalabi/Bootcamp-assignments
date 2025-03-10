function throwAlert(){
    alert("Loading Weather info ........")
}


function changeDegree(element){
    var spans = document.querySelectorAll("p span")
    for(var i=0;i<spans.length;i++){
        if(element.value=="F"){
            spans[i].innerText = Math.round(eval(`(${spans[i].innerText}*(9/5))+32`))
        }else{
            spans[i].innerText = Math.round(eval(`((${spans[i].innerText}-32)*5)/9`))
        }
    }
}

function hide(){
    var cookie = document.querySelector("body > div")
    cookie.remove()
}