package session3.homework;

import java.util.Scanner;

public class Challenge3 {
    //3. Write a program to check if a number
    //is positive or negative using logical complement operator.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int var = scanner.nextInt();

        boolean isPositive = !(var < 0);

        if (isPositive) {
            System.out.println(var + " is a positive number.");
        } else {
            System.out.println(var + " is a negative number.");
        }

        scanner.close();
    }
}
