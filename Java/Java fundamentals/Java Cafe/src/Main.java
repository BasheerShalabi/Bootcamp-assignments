import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    /*
      You will need add 1 line to this file to create an instance
      of the CafeUtil class.
      Hint: it will need to correspond with the variable name used below..
    */
        CafeUtil appTest = new CafeUtil();
        /* ============ App Test Cases ============= */

        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n\n", appTest.getStreakGoal());

         System.out.println("----- Order Total Test-----");
         ArrayList<Double> lineItems = new ArrayList<Double>();
         lineItems.add(3.5);
         lineItems.add(4.5);
         lineItems.add(5.5);
         lineItems.add(6.5);
         System.out.printf("Order total: %s \n\n",appTest.getOrderTotal(lineItems));

         System.out.println("----- Display Menu Test-----");

         ArrayList<String> menu = new ArrayList<String>();
         menu.add("drip coffee");
         menu.add("cappuccino");
         menu.add("latte");
         menu.add("mocha");
         appTest.displayMenu(menu);
         appTest.printPriceChart("drip coffee",3.5,5);
         appTest.displayMenu(menu,lineItems);

         System.out.println("\n----- Add Customer Test-----");
         ArrayList<String> customers = new ArrayList<String>();
         // --- Test 4 times ---
         for (int i = 0; i < 4; i++) {
             appTest.addCustomer(customers);
             System.out.println("\n");
         }
    }
}