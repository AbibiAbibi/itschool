package session5.homework;

import java.util.Scanner;

public class Challenge11 {
    //11. Write a program that prompts the user to enter numbers.
    //Calculate the average of these numbers. If the user enters 0,
    //break out of the input loop and then print the average of the numbers entered so far.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int count = 0;
        double sum = 0;

        System.out.println("Enter a number for the average (0 to calculate):");
        number = scanner.nextInt();
        while (number != 0) {
            sum += number;
            count++;
            number = scanner.nextInt();
        }
        System.out.println("The average of the entered numbers is: " + (sum / count));
    }
}