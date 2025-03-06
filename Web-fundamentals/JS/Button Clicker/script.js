
function rmvElem(element){
    element.remove();
}

function changeText(element){
    if(element.innerText == "Login"){
        element.innerText = "Logout"
    }else{
        element.innerText = "Login"
    }
}

var likes = 0
function onLike(element){
    alert("Ninja was liked")
    likes++;
    element.innerText = likes + " likes"
}

function changeColor(element,color){

    element.style.backgroundColor = color;
}