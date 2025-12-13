public class Tester {
    public static void main(String[] args) {

        // Create a shopping cart
        Cart c1 = new Cart("Rafik");

        // Create items
        Item i1 = new Item("Laptop", 80000);
        Item i2 = new Item("Mouse", 1500);
        Item i3 = new Item("Keyboard", 2500);

        // Add items to the cart
        c1.addItem(i1);
        c1.addItem(i2);
        c1.addItem(i3);

        // Display cart details
        c1.printCart();
    }
}
