import java.util.*;

public class Cart {
    public String name;

    public Cart(String name){
        this.name = name;
    }

    public ArrayList<Item> itemLisst = new ArrayList<>();

    public void addItem(Item item){
        itemLisst.add(item);
    }

    public void printCart(){
        System.out.println("Cart name: " + name);
        for(int i=0; i<itemLisst.size(); i++){
            System.out.println("Item name : " + itemLisst.get(i).name);
            System.out.println("Item price: " + itemLisst.get(i).price);
            System.out.println("Thanks for shopping from us.");
        }
    }
}
