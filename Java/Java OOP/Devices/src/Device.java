public class Device {
    protected int battery = 100;

    public Device(){};

    public void status(){
        System.out.println("Battery level: " + battery);
    }
}
