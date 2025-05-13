//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            // APP VARIABLES
            // Lines of text that will appear in the app.
            String generalGreeting = "Welcome to Cafe Java, ";
            String pendingMessage = ", your order will be ready shortly";
            String readyMessage = ", your order is ready";
            String displayTotalMessage = "Your total is $";

            // Menu variables (add yours below)
            double mochaPrice = 3.5;
            double dripCoffee = 2.5;
            double latte = 5;
            double cappuccino = 5.5;

            // Customer name variables (add yours below)
            String customer1 = "Shatha";
            String customer2 = "Ahmad";
            String customer3 = "Sali";
            String customer4 = "Adam";

            // Order completions (add yours below)
            boolean isReadyOrder1 = false;
            boolean isReadyOrder2 = true;
            boolean isReadyOrder3 = true;
            boolean isReadyOrder4 = true;

            // APP INTERACTION SIMULATION (Add your code for the challenges below)
            // Example:
        if (isReadyOrder3){
            System.out.println(readyMessage +"  "+ customer3);
            System.out.println(displayTotalMessage + dripCoffee);
        }
        if (isReadyOrder2){
            System.out.println(readyMessage +"  "+ customer2);
            System.out.println(displayTotalMessage + cappuccino);
        }
        if (isReadyOrder3){
            System.out.println(readyMessage +"  "+ customer3);
            System.out.println(displayTotalMessage + latte*2);
            isReadyOrder3 = false;
        }
        if (isReadyOrder4){
            System.out.println(readyMessage +"  "+ customer4);
            System.out.println(displayTotalMessage + (dripCoffee-latte));
            isReadyOrder4 = false;
        }
            System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Shatha"
            // ** Your customer interaction print statements will go here ** //

    }
}