package session4.homework;

import java.util.ArrayList;

public class Challenge10 {
    // 10. Write a Java program that creates two distinct
    // ArrayList objects, listOne and listTwo. Add some
    // elements to listOne and assign listOne to listTwo.
    // Now modify listOne by adding a new element.
    // Print both lists and observe the output.
    public static void main(String[] args) {
        ArrayList<Integer> listOne = new ArrayList<>();
        ArrayList<Integer> listTwo = new ArrayList<>();

        listOne.add(10);
        listOne.add(20);
        listOne.add(30);

        listTwo = listOne;

        listOne.add(40);

        System.out.println("listOne: " + listOne);
        System.out.println("listTwo: " + listTwo);
    }
}