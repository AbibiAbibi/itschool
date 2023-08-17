package session3.homework;

import java.util.Scanner;

public class Challenge10 {
    //10. Write a program that reverses
    //the sign of an entered integer using unary minus operator.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int reversedNumber = -number;

        System.out.println("Original number: " + number);
        System.out.println("Number with reversed sign: " + reversedNumber);

        scanner.close();
    }
}