package session8.homework;

import java.util.ArrayList;

public class ChristmasWishlist {

    public static void main(String[] args) {
        ArrayList<String> christmasWishlist = new ArrayList<>();

        // Add items to the wishlist
        christmasWishlist.add("Smartphone, ");
        christmasWishlist.add("Laptop, ");
        christmasWishlist.add("Books, ");
        christmasWishlist.add("Video games, ");
        christmasWishlist.add("Gift cards.");

        System.out.print("Christmas Wishlist: ");

        for (String item : christmasWishlist) {
            System.out.print(item);
        }
    }
}