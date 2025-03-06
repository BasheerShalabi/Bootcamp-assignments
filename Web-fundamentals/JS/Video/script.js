console.log("page loaded...");



function showSettings(element,val){
    element.controls = val
}

function doPlay(element){
    element.play()
}
function doPause(element){
    element.pause()
    element.muted = true
}