public class Main{
    public static void main(String[] args){

        Item item1 = new Item("mocha", 10.0);
        Item item2 = new Item("latte", 5.0);
        Item item3 = new Item("cappuccino", 15.0);
        Item item4 = new Item("drip coffe", 10.0);

        Order order1 = new Order("Basheer");
        Order order2 = new Order("Salhi");
        Order order5 = new Order("Atout");
        Order order6 = new Order("Hussaini");
        Order order3 = new Order();
        Order order4 = new Order();

        order1.addItem(item1);
        order1.addItem(item2);
        order1.addItem(item3);
        order1.addItem(item4);
        order1.setReady();
        order2.addItem(item1);
        order2.addItem(item2);
        order2.addItem(item3);
        order2.setReady();
        order3.addItem(item2);
        order3.addItem(item2);
        order4.addItem(item4);
        order1.getStatus();
        order2.getStatus();
        order3.getStatus();
        order4.getStatus();
        System.out.println(order1.getTotal());
        System.out.println(order2.getTotal());
        System.out.println(order3.getTotal());
        System.out.println(order4.getTotal());

        order1.display();
        order2.display();
        order3.display();
        order4.display();



    }
}