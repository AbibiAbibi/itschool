package session3.Homework;

import java.util.Scanner;

public class Challenge11 {
    //11. Write a Java program that takes two boolean inputs from a user.
    //Apply the logical negation operator (!) to each and print the result.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first boolean (true/false): ");
        boolean bool1 = scanner.nextBoolean();

        System.out.print("Enter the second boolean (true/false): ");
        boolean bool2 = scanner.nextBoolean();

        boolean result1 = !bool1;
        boolean result2 = !bool2;

        System.out.println("Negation of the first boolean: " + result1);
        System.out.println("Negation of the second boolean: " + result2);

        scanner.close();
    }
}