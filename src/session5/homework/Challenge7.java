package session5.homework;

import java.util.Scanner;

public class Challenge7 {
    //7. Create a program where the user is prompted to guess a predefined number.
    //After each guess, the program should inform the user if the guess is too high
    //or too low. The program should keep prompting the user until they guess correctly.
    // Using a do-while loop, ensure the user is always asked at least once.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 6;
        int numberToGuess = 0;

        System.out.println("Try your luck and guess the number:");

        do {
            numberToGuess = scanner.nextInt();
            if (numberToGuess > number) {
                System.out.println("Enter a lower number!");
            } else if (numberToGuess < number) {
                System.out.println("Enter a highest number!");
            } else {
                System.out.println("You win!!!");
            }
        } while (number != numberToGuess);

        scanner.close();
    }
}