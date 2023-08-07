package session3.Homework;

import java.util.Scanner;

public class Challenge9 {
    //9. Write a program that calculates the area of
    //a rectangle. Take the length and breadth as inputs.
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        System.out.print("Enter the lenght: ");
        int lenght = scanner.nextInt();
        System.out.print("Enter the width: ");
        int width = scanner.nextInt();

        int area = lenght * width;

        System.out.println("The area of rectangle is: " + area);

        scanner.close();
    }
}