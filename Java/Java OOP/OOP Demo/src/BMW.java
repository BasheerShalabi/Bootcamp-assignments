public class BMW extends GasCar{
    private String model;
    private String year;

    public BMW(int tankCapacity) {
        super("BMW",tankCapacity);
        this.model = "";
        this.year = "";
    }

    public BMW(int tankCapacity,String model,String year) {
        super("BMW",tankCapacity);
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
