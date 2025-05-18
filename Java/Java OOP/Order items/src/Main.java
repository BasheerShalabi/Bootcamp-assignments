public class Main{
    public static void main(String[] args){
        // Menu items
            
                // Order variables -- order1, order2 etc.
        Item item1 = new Item("mocha", 10.0);
        Item item2 = new Item("latte", 5.0);
        Item item3 = new Item("cappuccino", 15.0);
        Item item4 = new Item("drip coffe", 10.0);

        Order order1 = new Order("Basheer");
        Order order2 = new Order("Salhi");
        Order order3 = new Order("Hussaini");
        Order order4 = new Order("Atout");
        // Application Simulations
        // Use this example code to test various orders' updates


        order2.addItem(item1);
        order3.addItem(item3);
        order4.addItem(item2);
        order1.setReady();
        order4.addItem(item2);
        order2.setReady();

        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);
        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);
        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
    }
}