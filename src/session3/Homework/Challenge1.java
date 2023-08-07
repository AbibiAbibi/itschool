package session3.Homework;

import java.util.Scanner;

public class Challenge1 {
    //1. Write a Java program to take two numbers as input and display
    // the result of addition, subtraction, multiplication, division, and modulus.
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.println("Addition: " + (number1 + number2));
        System.out.println("Subtraction: " + (number1 - number2));
        System.out.println("Multiplication: " + (number1 * number2));
        System.out.println("Division: " + (number1 / number2));
        System.out.println("Modulus: " + (number1 % number2));

        scanner.close();
    }
}