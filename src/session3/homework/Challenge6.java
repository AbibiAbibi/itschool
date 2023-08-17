package session3.homework;

import java.util.Scanner;

public class Challenge6 {
    //6. Write a Java program that takes two numbers from the user and
    //uses relational operators to display whether the first number
    //is greater than, less than, or equal to the second number.
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        if(number1 > number2){
            System.out.println("The first entered number is greater than the second entered number.");
        } else if (number1 < number2) {
            System.out.println("The first entered number is smaller than the second entered number.");
        }else {
            System.out.println("The numbers are equal.");
        }

        scanner.close();
    }
}
