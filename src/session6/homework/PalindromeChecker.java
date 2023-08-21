package session6.homework;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word to check if it is a palindrome: ");
        String input = scanner.nextLine();
        scanner.close();

        boolean isPalindrome = checkPalindrome(input);
        System.out.println(isPalindrome);
    }

    public static boolean checkPalindrome(String input) {
        StringBuilder reversed = new StringBuilder(input);
        reversed.reverse();
        return input.equals(reversed.toString());
    }
}