package session5.homework;

import java.util.Scanner;

public class Challenge10 {
    //10. Create a menu-driven program where the user is presented with options:
    //Print "Hello World"
    //Print the user's name.
    //Exit.
    //Based on the user's input, perform the necessary action.
    //Once an action is completed, show the menu again, unless the
    //user chooses the Exit option. Use jump statements to control the flow of the program.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Menu:");
        System.out.println("1. Print \"Hello World\"");
        System.out.println("2. Print your name");
        System.out.println("3. Exit");

        do {
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Hello World");
                    break;
                case 2:
                    System.out.print("Enter your name: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    System.out.println("Your name is: " + name);
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 3);

        scanner.close();
    }
}