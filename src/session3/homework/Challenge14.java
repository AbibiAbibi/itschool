package session3.homework;

import java.util.Scanner;

public class Challenge14 {
    //14. Create a program that checks if a user entered number is within a
    //specific range (e.g., 1-100). Use relational operators for the checks.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number >= 70 && number <= 540) {
            System.out.println("The number is within the range of 70 to 540.");
        } else {
            System.out.println("The number is not within the range of 70 to 540.");
        }

        scanner.close();
    }
}
