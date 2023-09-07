package session8.homework;

import java.util.ArrayList;

public class ShoppingList {

    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();

        shoppingList.add("Bread, ");
        shoppingList.add("Milk, ");
        shoppingList.add("Eggs, ");
        shoppingList.add("Fruits, ");
        shoppingList.add("Vegetables.");

        System.out.print("Shopping List: ");

        for (String item : shoppingList) {
            System.out.print(item);
        }
    }
}