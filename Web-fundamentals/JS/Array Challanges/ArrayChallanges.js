// 1111111111111111111111111111111111111111111111
function alwaysHungary(arr){
    var count = 0
    for(i=0; i<arr.length; i++){
        if(arr[i]=="food"){
            count++
            console.log("yummy")
        }
    }
    if (count == 0)
    console.log("i'm hungry")
}
// var x=[3.14,"food", "pie", true, "food"]
// alwaysHungary(x)
// 2222222222222222222222222222222222222222222222222
function highPass(arr , cutoff){
    for(i=0; i<arr.length; i++){
        if(cutoff>=arr[i]){
            arr.splice(i,1)
        i--
        }
    }
    console.log(arr)
}
// highPass([11,10,2,3,7,5],5)
// 33333333333333333333333333333333333333333333333333
function betterThanAverage(arr){
    var sum = 0
    var avg = 0
    var count = 0
    for(i=0; i<arr.length; i++){
        sum +=arr[i]
    }
    avg=sum/arr.length
    for(i=0; i<arr.length;i++){
        if(arr[i]>avg){
            count++
        }
    }
    return count
}
// console.log(betterThanAverage([6, 8, 3, 10, -2, 5, 9]))
// 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444
 
function reverse(arr){
    for(var i=arr.length-2;i>=0;i--){
        arr.push(   arr.splice(i,1)[0]  )
    }
    console.log(arr)
}
 
// reverse([1,2,3,4,5])
// 555555555555555555555555555555555555555555555555555555555555555555555555
function fibonacciArray(n){
    var arr= [0,1]
    for(i=1;i<n-1;i++){
        arr.push(arr[i]+arr[i-1])
    }
console.log(arr)
}
//fibonacciArray(10)