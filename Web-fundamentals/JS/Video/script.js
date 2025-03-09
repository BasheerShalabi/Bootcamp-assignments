console.log("page loaded...");



function showSettings(element,val){
    element.controls = val
}

function doPlay(element){
    element.play()
    element.muted = false
}
function doPause(element){
    element.pause()
    element.muted = true
}