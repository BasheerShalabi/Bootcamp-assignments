public class Main{
    public static void main(String[] args){

        CafeKiosk cafeKiosk = new CafeKiosk();

        Item item1 = new Item("mocha", 10.0);
        Item item2 = new Item("latte", 5.0);
        Item item3 = new Item("cappuccino", 15.0);
        Item item4 = new Item("drip coffe", 10.0);

        cafeKiosk.addItem(item1.getName(), item1.getPrice());
        cafeKiosk.addItem(item2.getName(), item2.getPrice());
        cafeKiosk.addItem(item3.getName(), item3.getPrice());
        cafeKiosk.addItem(item4.getName(), item4.getPrice());

        cafeKiosk.newOrder();


    }
}