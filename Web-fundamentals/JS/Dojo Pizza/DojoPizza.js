function pizzaOven(crust,sauce,cheese,toppings){
    var pizza = {
        "crust": (crust== undefined ? randomToppings(["crust1","crust2"],true) : crust),
        "sauce": (sauce== undefined ? randomToppings(["sauce1","sauce2"],true) : sauce),
        "cheese": (cheese== undefined ? randomToppings(["cheese1","cheese2","cheese3"]) : cheese),
        "toppings": (toppings== undefined ? randomToppings(["topping1","topping2","topping3","topping4","topping5"]) : toppings),
        "print": function(){
            console.log(`${this.crust} , ${this.sauce} , [${this.cheese}] , [${this.toppings}]`)
        }
    }
    return pizza
}

function randomToppings(arr,cantBeZero){
    var newArr=[]
    if(newArr.length==0 && (cantBeZero == undefined ? false : cantBeZero)){
        var random = Math.floor(Math.random()*arr.length)
        newArr.push(arr[random])
    }else{
    for(var i =0;i<arr.length;i++){
        var random = Math.round(Math.random())
        if(random){
          newArr.push(arr[i])
        }
    }
}
    if(newArr[0]==undefined) return "None"
    if(newArr.length<2) return newArr[0]
    return newArr
}

pizzaOven().print()
pizzaOven().print()
pizzaOven("deep dish","traditional").print()
pizzaOven("hand tossed","marinara").print()
pizzaOven("deep dish","traditional",["mozzarella"]).print()
pizzaOven("hand tossed","marinara",["mozzarella","feta"],).print()