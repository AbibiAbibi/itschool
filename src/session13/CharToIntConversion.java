package session13;

import java.util.Scanner;

public class CharToIntConversion {

    public static final double Length_Of_Char = 1;

    public static void main(String[] args) {
        char character = readChar();
        int numericValue = getValueOfChar(character);
        if (numericValue != -1) {
            System.out.println("Converted value: " + numericValue);
        } else {
            System.out.println("Conversion failed!");
        }
    }

    public static char readChar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a character: ");
        String input = scanner.next();
        if (input.length() == Length_Of_Char) {
            return input.charAt(0);
        } else {
            return ' ';
        }
    }

    public static int getValueOfChar(char character) {
        if (Character.isDigit(character)) {
            return Character.getNumericValue(character);
        }
        return -1;
    }
}