package session3.Homework;

import java.util.Scanner;

public class Challenge5 {
    //5. Create a Java program that demonstrates the
    //use of each compound assignment operator with integers.
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        number1+=number2;
        System.out.println("+=: " + number1);

        number1 -= number2;
        System.out.println("-=: " + number1);

        number1 *= number2;
        System.out.println("*=: " + number1);

        number1 /= number2;
        System.out.println("/=: " + number1);

        number1 %= number2;
        System.out.println("%=: " + number1);

        scanner.close();
    }
}
