import java.util.ArrayList;
import java.util.Scanner;

public class CafeKiosk {
    ArrayList<Item> items;
    ArrayList<Order> orders;

    public CafeKiosk(){
        this.items=new ArrayList<>();
        this.orders=new ArrayList<>();
    }

    public void addItem(String name,double price){
        items.add(new Item(name,price));
    }

    public void displayMenu(){
        for(Item item:items){
            System.out.println(items.indexOf(item)+" "+item.getName()+" ---- $"+item.getPrice());
        }
    }

    public void newOrder(){
        // Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        // Your code:
        // Create a new order with the given input string
        // Show the user the menu, so they can choose items to add.
        Order newOrder = new Order(name);

        // Prompts the user to enter an item number
        String itemNumber = "";
        this.displayMenu();
        // Write a while loop to collect all user's order items
        while(true) {
            System.out.println("Please enter a menu item index or q to quit:");
            itemNumber = scanner.nextLine();
            if(itemNumber.equals("q")) break;
            try{
                if(Integer.parseInt(itemNumber)<items.size()){
                    newOrder.addItem(items.get(Integer.parseInt(itemNumber)));
                }else{
                    System.out.println("Invalid item number");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid item number");
            }
            // Get the item object from the menu, and add the item to the order
            // Ask them to enter a new item index or q again, and take their input
        }

        newOrder.display();
        orders.add(newOrder);
        // After you have collected their order, print the order details
    }
}

