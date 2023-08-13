package session5.homework;

import java.util.Scanner;

public class Challenge1 {
    //1. Write a Java program that takes an integer as input.
    //If the number is even, print "Even". If it's odd, print "Odd".
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        evenOrOddCheckerWithIf(number);

        scanner.close();
    }

    public static void evenOrOddCheckerWithIf(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}