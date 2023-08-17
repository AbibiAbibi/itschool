package session5.homework;

import java.util.Scanner;

public class Challenge12 {
    //12.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter 10 numbers!");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number #" + i + ": ");
            int num = scanner.nextInt();

            if (num <= 5) {
                System.out.println("Skipping " + num + " (less than or equal to 5)");
                continue;
            }

            sum += num;
        }

        System.out.println("Sum of numbers greater than 5: " + sum);

        scanner.close();
    }
}