public abstract class GasCar extends Vehicle implements GasVehicle{
    private int fuelCapacity;
    private final int MAX_FUEL_CAPACITY;
    public GasCar(String brand,int tankCapacity) {
        super(brand);
        this.fuelCapacity = tankCapacity;
        this.MAX_FUEL_CAPACITY = tankCapacity;
    }
    public void printTankCapacity() {
        System.out.println("Tank capacity: " + fuelCapacity);
    }
    @Override
    public void fillUp() {
        if(fuelCapacity==MAX_FUEL_CAPACITY) {
            System.out.println("Tank is full...");
            return;
        }
        System.out.println("Filling up car...");
        fuelCapacity+=40;
        if(fuelCapacity>MAX_FUEL_CAPACITY) fuelCapacity=MAX_FUEL_CAPACITY;
    }
    @Override
    public void start() {
        System.out.println("Starting gas car...");
    }

    @Override
    public void drive() {
        System.out.println("Driving gas car...");
        fuelCapacity-=15;
    }
}
