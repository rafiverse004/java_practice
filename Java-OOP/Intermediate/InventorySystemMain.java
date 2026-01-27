/*
PROBLEM 9:
Implement a basic Inventory system:
- Encapsulation with private list of items
- Add and remove items
*/

// WHAT YOU ARE LEARNING:
// Encapsulation, ArrayList, Method Logic, Object Management

import java.util.ArrayList;
import java.util.List;

class Inventory {

    // Private list → items cannot be accessed directly
    private List<String> items;

    // Constructor → initializes empty inventory
    public Inventory() {
        items = new ArrayList<>();
    }

    // Add an item
    public void addItem(String item) {
        items.add(item);
        System.out.println(item + " added to inventory.");
    }

    // Remove an item
    public void removeItem(String item) {
        if (items.remove(item)) {
            System.out.println(item + " removed from inventory.");
        } else {
            System.out.println(item + " not found in inventory.");
        }
    }

    // View all items
    public void listItems() {
        System.out.println("Inventory items: " + items);
    }
}

// Main class comes last
public class InventorySystemMain {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        inventory.addItem("Keyboard");
        inventory.addItem("Mouse");

        inventory.listItems();

        inventory.removeItem("Mouse");
        inventory.removeItem("Monitor"); // not found

        inventory.listItems();
    }
}
