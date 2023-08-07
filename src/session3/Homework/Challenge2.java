package session3.Homework;

import java.util.Scanner;

public class Challenge2 {
    //2. Create a Java program where you increment and decrement the same variable.
    //Display the value of the variable after each operation.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int count = scanner.nextInt();

        count++;
        System.out.println("After increment: " + count);
        count--;
        System.out.println("After decrement: " + count);

        scanner.close();
    }
}
