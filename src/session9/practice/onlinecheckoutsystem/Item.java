package session9.practice.onlinecheckoutsystem;

public class Item {

    private String name;
    private double price;
    private int uniqueIdentifier;
    private static int nextIdentifier = 1;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
        this.uniqueIdentifier = nextIdentifier;
        nextIdentifier++;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getUniqueIdentifier() {
        return uniqueIdentifier;
    }
}