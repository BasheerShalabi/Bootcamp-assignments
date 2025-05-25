public class Tesla extends ElectricCar{
    private String model;
    private String year;

    public Tesla(int batteryCapacity) {
        super("Tesla",batteryCapacity);
        this.model = "";
        this.year = "";
    }

    public Tesla(int batteryCapacity,String model,String year) {
        super("Tesla",batteryCapacity);
        this.model = model;
        this.year = year;
    }

    @Override
    public void vehicleInfo() {
        super.vehicleInfo();
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public String getModel() {
        return model;
    }
    public String getYear() {
        return year;
    }

}
