package session3.Homework;

import java.util.Scanner;

public class Challenge13 {
    //13. Write a program to calculate the price after discount.
    //Take the original price and discount percentage as input.
    //Use compound assignment operator to perform the calculation.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price: ");
        double originalPrice = scanner.nextDouble();

        System.out.print("Enter the discount percentage: ");
        double discountPercentage = scanner.nextDouble();

        double discountAmount = (originalPrice * discountPercentage) / 100.0;
        double finalPrice = originalPrice - discountAmount;

        System.out.println("Discount amount: " + discountAmount);
        System.out.println("Final price after discount: " + finalPrice);

        scanner.close();
    }
}