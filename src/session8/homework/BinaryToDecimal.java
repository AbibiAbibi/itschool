package session8.homework;

import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();

        try {
            int decimalNumber = Integer.parseInt(binaryString, 2);

            System.out.println("Decimal representation of '" + binaryString + "' is: " + decimalNumber);
        } catch (NumberFormatException e) {
            System.out.println("Invalid binary input. Please enter a valid binary number.");
        }

        scanner.close();
    }
}