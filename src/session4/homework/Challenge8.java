package session4.homework;

import java.util.Scanner;

public class Challenge8 {
    // 8. Write a Java program to calculate the factorial of a
    // number using a for loop. Declare an integer variable number
    // and assign a value to it. Then calculate and print the factorial of number.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        float factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + number + " is " + factorial);

        scanner.close();
    }
}