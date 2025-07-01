
import Ninja from './Ninja.js';

class Sensei extends Ninja{
    constructor(name, wisdom = 10) {
        super(name, 200, 10, 10);
        this.wisdom = wisdom;
    }
    speakWisdom() {
        this.drinkSake()
        console.log("A wise saying from the Sensei.");
    }
}

const sensi = new Sensei("Master Splinter");
sensi.sayName();
sensi.showStats();
sensi.speakWisdom(); 
