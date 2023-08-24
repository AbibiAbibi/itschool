package session7.practice;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {
        printUserInfo();
    }

    public static void printUserInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String username = scanner.next();

        System.out.print("Please enter your age: ");
        int userAge = scanner.nextInt();

        System.out.println("Are you a student? (true/false)");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("User " + username + ", age " + userAge + ", student " + isStudent + "!");
    }
}