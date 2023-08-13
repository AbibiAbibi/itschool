package session5.homework;

import java.util.Scanner;

public class Challenge5 {
    //5. Write a program that generates and prints
    //the first n numbers of the Fibonacci series, where n is provided by the user.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        print(n);

        scanner.close();
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void print(int n) {
        System.out.print("Fibonacci series of " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}