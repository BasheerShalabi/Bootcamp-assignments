function addLike(element){
    element = element.parentNode
   var num=  element.querySelector("span").innerText
   if(!num) element.querySelector("span").innerText = 1
   else element.querySelector("span").innerText = ++num
}

