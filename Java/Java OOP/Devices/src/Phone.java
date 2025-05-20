public class Phone extends Device {

    public Phone(){};

    private void checkBattery(){
        if(this.battery <= 10) System.out.println("Battery is critically low!");
    }

    public void makeCall(){
        if (this.battery <= 0) {
            System.out.println("Battery is empty!");
            return;
        }
        this.battery -= 5;
        if (this.battery <= 0) this.battery = 0;
        System.out.println("Calling...");
        checkBattery();
    }
    public void playGame(){
        if (this.battery <= 25) {
            System.out.println("Battery is low!");
            return;
        }
        this.battery -= 20;
        System.out.println("Playing game...");
    }

    public void charge(){
        this.battery +=50;
        if(this.battery > 100) this.battery = 100;
        System.out.println("Phone is charging...");
    }
}
