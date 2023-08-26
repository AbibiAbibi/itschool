package session9.onlinecheckoutsystem;

public class OnlineStore {

    public static void main(String[] args) {
        Item item1 = new Item("Laptop", 3550.99);
        Item item2 = new Item("Monitor", 759.49);

        ShoppingCart cart = new ShoppingCart();
        cart.addItem(item1);
        cart.addItem(item2);

        System.out.println("Items in Cart:");
        for (Item item : cart.getItems()) {
            System.out.println(item.getUniqueIdentifier() + ". " + item.getName() + " " + item.getPrice() + " lei");
        }

        double totalCost = cart.calculateTotalCost();
        System.out.println("Total Cost: " + totalCost + " lei");
    }
}