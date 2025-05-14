import java.util.ArrayList;
import java.util.Scanner;

public class CafeUtil {
    int numWeeks = 10;

    public int getStreakGoal(){
        int sum=0;
        for(int i = 1; i <= numWeeks; i++){
            sum+=i;
        }
        return sum;
    }
    public double getOrderTotal(ArrayList<Double> prices){
        double total = 0;
        for(double price : prices){
            total+=price;
        }
        return total;
    }
    public void displayMenu(ArrayList<String> menuItems){
        for(int i =0; i<menuItems.size(); i++){
            System.out.println(i + menuItems.get(i));
        }
    }
    public void addCustomer(ArrayList<String> customers){
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        System.out.println("Hello , "+ username);
        System.out.println(String.format("There are %d people in front of you", customers.size()));
        customers.add(username);
        for(String customer : customers){
            System.out.println(customer);
        }
    }
    public void printPriceChart(String product,double price,int maxQuantity){
        System.out.println(product);
        for(int i = 1; i<=maxQuantity; i++){
            System.out.println(String.format("%d - $%.2f",i,(price*i)-((i-1)*0.50)));
        }
    }
    public boolean displayMenu(ArrayList<String> menuItems,ArrayList<Double> prices){
        if(menuItems.size() != prices.size()){
            return false;
        }
        for(int i =0; i<menuItems.size(); i++){
            System.out.println(i+ " " + menuItems.get(i) + " -- $" + prices.get(i));
        }
        return true;

    }

}
