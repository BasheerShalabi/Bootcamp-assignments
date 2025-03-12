function getSecondsSinceStartOfDay() {
  return new Date().getSeconds() + 
    new Date().getMinutes() * 60 + 
    new Date().getHours() * 3600;
}
    var seconds = document.getElementById("seconds")
    var minutes = document.getElementById("minutes")
    var hours = document.getElementById("hour")

setInterval( function() {
    var time = getSecondsSinceStartOfDay();
    console.log(time);
    // your code here

    var getMinutes = time/60
    var getHours = getMinutes/60

    var handHours=  (360*((getHours)%12/12)) -180
    var handMinutes= (360*((getMinutes%60)/60)) -180
    var handSeconds=   (360*((time%60)/60)) -180

    console.log((getMinutes%60)/60)

    seconds.style.transform = `rotate(${handSeconds}deg)`
    minutes.style.transform = `rotate(${handMinutes}deg)`
    hours.style.transform = `rotate(${handHours}deg)`

}, 1000);