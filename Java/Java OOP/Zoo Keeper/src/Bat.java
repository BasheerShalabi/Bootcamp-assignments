public class Bat extends Mammal{

    public Bat(int energy) {
        super(energy);
    }

    public void fly(){
        if(this.energy < 50)return;
        this.energy -= 50;
        System.out.println("Bat has flew");
    }

    public void eatHumans(){
        this.energy += 25;
        if(this.energy >= 100)this.energy=100;
        System.out.println("Bat has eaten humans and is very happy");
    }

    public void attackTown(){
        if(this.energy < 100)return;
        this.energy -= 100;
        System.out.println("Bat has attacked the town");
    }
}
