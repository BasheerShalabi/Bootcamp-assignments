public class Gorilla extends Mammal {

    public Gorilla(int energy) {
        super(energy);
    }

    public void throwSomthing(){
        if(this.energy == 0)return;
        this.energy -= 5;
        if(this.energy <= 0)this.energy=0;

        System.out.println("Gorilla has thrown something...");
    }

    public void eatBananas(){
        this.energy += 10;
        if(this.energy >= 100)this.energy=100;
        System.out.println("Gorilla has eaten bananas and is very happy");
    }

    public void climb(){
        if(this.energy == 0)return;
        this.energy -= 10;
        if(this.energy <= 0)this.energy=0;
        System.out.println("Gorilla has climbed a tree");
    }

}
