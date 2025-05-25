//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        int max = Vehicle.SPEED_LIMIT;
        BMW car1 = new BMW(120,"M3","2020");
        Tesla car2 = new Tesla(100,"Model S","2021");

        BMW car3 = new BMW(120);
        Tesla car4 = new Tesla(100);

        car1.vehicleInfo();
        System.out.println("------------------------");
        car2.vehicleInfo();
        System.out.println("------------------------");
//        car3.vehicleInfo();
//        System.out.println("------------------------");
//        car4.vehicleInfo();
//        System.out.println("------------------------");
        car3.setModel("M4");
        car3.setYear("2022");
        car4.setModel("Model 3");
        car4.setYear("2023");

        car3.vehicleInfo();
        System.out.println("------------------------");
        car4.vehicleInfo();
        System.out.println("------------------------");

        car1.start();
        car2.start();
        car1.fillUp();
        car2.charge();
        System.out.println("------------------------");
        car1.drive();
        car1.drive();
        car1.drive();
        car2.drive();
        car2.drive();
        System.out.println("------------------------");
        car1.printTankCapacity();
        car2.printBatteryCapacity();
        System.out.println("------------------------");
        car1.fillUp();
        car2.charge();
        System.out.println("------------------------");
        car1.printTankCapacity();
        car2.printBatteryCapacity();

    }
}