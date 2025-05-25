import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
        for (int i = 0; i < myList.size(); i++) {
            try {
                Integer castedValue = (Integer) myList.get(i);
                System.out.println("Successfully casted: " + castedValue);
                System.out.println("-----------------------------");
            } catch (ClassCastException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("At index: " + i);
                System.out.println("Value causing error: " + myList.get(i));
                System.out.println("-----------------------------");
            }
        }
        }
    }
