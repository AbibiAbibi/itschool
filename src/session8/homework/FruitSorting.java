package session8.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FruitSorting {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Strawberry");
        fruits.add("Apple");
        fruits.add("Blueberry");
        fruits.add("Pineapple");

        System.out.println("List of fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        Collections.sort(fruits, new Comparator<String>() {
            @Override
            public int compare(String fruit1, String fruit2) {
                int lengthComparison = Integer.compare(fruit2.length(), fruit1.length());

                if (lengthComparison == 0) {
                    return fruit1.compareTo(fruit2);
                }
                return lengthComparison;
            }
        });

        System.out.println("Sorted List of Fruits (Descending by Length, Alphabetical if Same Length):");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}