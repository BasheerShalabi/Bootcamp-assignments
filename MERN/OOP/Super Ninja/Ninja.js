export default class Ninja{
    constructor(name , health , speed = 3 , strength = 3 ){
        this.name = name;
        this.health = health;
        this.speed = speed;
        this.strength = strength;
    }

    sayName(){
        console.log("My ninja name is" + this.name);
    }

    showStats(){
        console.log(`Name: ${this.name}, Health: ${this.health}, Speed: ${this.speed}, Strength: ${this.strength}`);
    }

    drinkSake(){
        this.health += 10;
        console.log(`${this.name} drinks sake and gains 10 health!`);
    }

}