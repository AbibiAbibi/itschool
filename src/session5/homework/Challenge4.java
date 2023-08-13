package session5.homework;

import java.util.Scanner;

public class Challenge4 {
    //4. Ask the user to enter a string. Print the reversed version of this string.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        reverseString(inputString);

        scanner.close();
    }

    public static void reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        System.out.print("The reversed string is: " + reversed);
    }
}