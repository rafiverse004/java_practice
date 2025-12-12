import java.util.ArrayList;

// Item class with encapsulation
class Item {
    private String name;
    private int quantity;
    private double price;

    // Constructor
    public Item(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return name + " | Quantity: " + quantity + " | Price: $" + price;
    }
}

// Inventory class managing items
class Inventory {
    private ArrayList<Item> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(String name) {
        items.removeIf(item -> item.getName().equalsIgnoreCase(name));
    }

    public void displayInventory() {
        if (items.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }
        System.out.println("Inventory:");
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public Item findItem(String name) {
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }
}

// Main class
public class InventorySystem {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Add items
        inventory.addItem(new Item("Laptop", 5, 1200.50));
        inventory.addItem(new Item("Mouse", 50, 15.75));
        inventory.addItem(new Item("Keyboard", 20, 35.99));

        inventory.displayInventory();

        // Find an item
        Item search = inventory.findItem("Mouse");
        if (search != null) {
            System.out.println("Found: " + search);
        }

        // Remove an item
        inventory.removeItem("Keyboard");
        System.out.println("After removing Keyboard:");
        inventory.displayInventory();
    }
}
