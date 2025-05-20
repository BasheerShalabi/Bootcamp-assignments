//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla(100);
        Bat bat = new Bat(100);

        gorilla.displayEnergy();
        gorilla.throwSomthing();
        gorilla.eatBananas();
        gorilla.climb();
        gorilla.displayEnergy();

        bat.displayEnergy();
        bat.fly();
        bat.eatHumans();
        bat.displayEnergy();
    }
}