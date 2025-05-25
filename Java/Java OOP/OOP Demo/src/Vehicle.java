
interface ElectricVehicle {
    void charge();
}

interface GasVehicle {
    void fillUp();
}

public abstract class Vehicle {

    private final String brand;
    private static int numberOfVehicles = 0;
    protected static final int SPEED_LIMIT = 160;

    // Constructor
    public Vehicle(String brand) {
        this.brand = brand;
        numberOfVehicles++;
    }

    public String getBrand() {
        return brand;
    }

    public void vehicleInfo(){
        System.out.println("Vehicle brand: " + brand);
    }

    abstract void start();

    abstract void drive();

    public static void printNumberOfVehicles(){
        System.out.println("Number of vehicles: " + numberOfVehicles);
    }

}

