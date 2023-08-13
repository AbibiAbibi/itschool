package session3.homework;

import java.util.Scanner;

public class Challenge12 {
    //12. Create a program that takes an integer as input and then
    //increments and decrements it by 1, displaying the output at each stage.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        System.out.println("Original number: " + number);

        number++;
        System.out.println("After increment: " + number);

        number--;
        System.out.println("After decrement: " + number);

        scanner.close();
    }
}
