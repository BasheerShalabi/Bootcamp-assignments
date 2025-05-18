import java.util.ArrayList;

public class Order{
    public String name;
    public double total;
    public boolean ready;
    private ArrayList<Item> items;

    public Order(String name){
        this.name=name;
        this.total=0;
        this.ready=false;
        this.items=new ArrayList();
    }
    public void addItem(Item item){
        this.items.add(item);
        this.total+=item.price;
    }
    public void setReady(){
        this.ready=true;
    }
}