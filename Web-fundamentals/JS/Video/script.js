console.log("page loaded...");

var video = document.querySelector("figure video")

function showSettings(element,val){
    element.controls = val
}



function doPlay(element){
    element.play()
    element.muted = false
    element.autoplay = true
}
function doPause(element){
    element.pause()
    element.muted = true
}

video.onmouseover = function(){
    showSettings(video,true)
    doPlay(video);
}

video.onmouseleave = function(){
    showSettings(video,false);
    doPause(video)
}