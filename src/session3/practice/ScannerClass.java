package session3.practice;

import java.util.Scanner;

public class ScannerClass {
    //psvm - shortcut
    public static void main(String[] args) {
        //sout - shortcut
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide some text: ");
        String userInput = scanner.nextLine();
        System.out.println("Yout input is: " + userInput);

        scanner.close();
    }
}
