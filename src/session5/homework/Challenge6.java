package session5.homework;

import java.util.Scanner;

public class Challenge6 {
    //6. Write a program that asks the user to enter numbers.
    //The program should continue prompting the user until they
    //enter -1. After they enter -1, print the sum of all numbers
    //entered (excluding -1).
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        int sum = 0;
        System.out.println("Enter a number for addition (enter -1 to display the result):");
        while (number != -1) {
            sum += number;
            number = scanner.nextInt();
        }
        System.out.print("The sum of the entered numbers is: " + sum);

        scanner.close();
    }
}
