public abstract class ElectricCar extends Vehicle implements ElectricVehicle {
    private int batteryCapacity;
    private final int MAX_BATTERY_CAPACITY;

    public ElectricCar(String brand,int batteryCapacity) {
        super(brand);
        this.batteryCapacity = batteryCapacity;
        this.MAX_BATTERY_CAPACITY = batteryCapacity;
    }
    public void printBatteryCapacity() {
        System.out.println("Battery capacity: " + batteryCapacity);
    }

    @Override
    public void charge() {
        if(batteryCapacity==MAX_BATTERY_CAPACITY) {
            System.out.println("Battery is full...");
            return;
        }
        System.out.println("Charging car...");
        batteryCapacity+=50;
        if(batteryCapacity>MAX_BATTERY_CAPACITY) batteryCapacity=MAX_BATTERY_CAPACITY;
    }
    @Override
    public void start() {
        System.out.println("Starting electric car...");
    }
    @Override
    public void drive() {
        System.out.println("Driving electric car...");
        batteryCapacity-=10;
    }
}
