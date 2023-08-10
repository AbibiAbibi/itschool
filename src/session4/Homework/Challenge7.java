package session4.Homework;

import java.util.Scanner;

public class Challenge7 {
    //7. Write a Java program that determines the type of a triangle
    // based on its sides. Declare three variables sideOne, sideTwo and
    // sideThree to represent the sides of the triangle. Use the ternary
    // operator to determine and print whether the triangle is "Equilateral",
    // "Isosceles", or "Scalene".
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of side one: ");
        double sideOne = scanner.nextDouble();

        System.out.print("Enter the length of side two: ");
        double sideTwo = scanner.nextDouble();

        System.out.print("Enter the length of side three: ");
        double sideThree = scanner.nextDouble();

        String triangleType = (sideOne == sideTwo && sideTwo == sideThree)
                ? "Equilateral"
                : (sideOne == sideTwo || sideTwo == sideThree || sideOne == sideThree)
                ? "Isosceles"
                : "Scalene";

        System.out.println("The triangle is " + triangleType);

        scanner.close();
    }
}