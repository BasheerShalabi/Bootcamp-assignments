var soundButton = document.querySelector("img[alt='sound']");
var audio = new Audio('content/hello.mp3');

soundButton.onclick = function (){
    audio.play();
}

var searchField = document.querySelector("input[type='text']")
var searchIcon = document.querySelector("img[alt='search']");

searchIcon.onclick = function(){
    if(searchField.value == "" || searchField.value == null) return
    alert(searchField.value)
}