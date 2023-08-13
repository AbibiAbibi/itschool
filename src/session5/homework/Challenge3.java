package session5.homework;

import java.util.Scanner;

public class Challenge3 {
    //3. Given an array of integers, write a program
    //to count and print the number of negative integers in the array.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        countNegativeIntegers(numbers);

        scanner.close();
    }

    public static void countNegativeIntegers(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                count++;
            }
        }
        System.out.println("Total of negative numbers is: " + count);
    }
}