import java.util.ArrayList;

public class Order{
    private String name;
    private boolean ready;
    private ArrayList<Item> items;

    public Order(){
        this.name="Guest";
        this.ready=false;
        this.items=new ArrayList();
    }
    public Order(String name){
        this.name=name;
        this.ready=false;
        this.items=new ArrayList();
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public boolean isReady(){
        return this.ready;
    }
    public void setReady(boolean ready){
        this.ready=ready;
    }
    public double getTotal(){
        double total=0;
        for(Item item:this.items){
            total +=item.getPrice();
        }
        return total;
    }
    public void addItem(Item item){
        this.items.add(item);
    }
    public void setReady(){
        this.ready=true;
    }

    public void getStatus(){
        if(this.ready){
            System.out.println("Your Order is ready!");
        }else{
            System.out.println("Thank you for you patience , Order will be ready soon");
        }
    }
    public void display(){
        System.out.printf("Name: %s\n", this.name);
        for(Item item:this.items){
            System.out.printf("%s - $%f\n", item.getName(), item.getPrice());
        }
        System.out.printf("Total: $%f\n", this.getTotal());
    }
}