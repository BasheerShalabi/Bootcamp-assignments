
var cardName = document.querySelector(".user-info h2")

function changeName(){
   cardName.innerText = "Mahmoud Atout"

}
var card1= document.getElementById("list-item1")
var card2= document.getElementById("list-item2")
var card3= document.getElementById("list-item3")

function List1(doRemove){
    var cardTop = document.getElementById("connections")
    var cardBottom = document.getElementById("ur-connections")
    if(!doRemove){
       ++cardBottom.innerText
    }
    --cardTop.innerText
    card1.remove()
}
function List2(doRemove){
    var cardTop = document.getElementById("connections")
    var cardBottom = document.getElementById("ur-connections")
    if(!doRemove){
       ++cardBottom.innerText
    }
    --cardTop.innerText
    card2.remove()
 }
 function List3(doRemove){
    var cardTop = document.getElementById("connections")
    var cardBottom = document.getElementById("ur-connections")
    if(!doRemove){
       ++cardBottom.innerText
    }
    --cardTop.innerText
    card3.remove()
 }
