package session7.homework;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class DateAuthenticator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a date (YYYY-MM-DD): ");
        String dateStr = scanner.nextLine();

        scanner.close();

        boolean isValid = isValidDate(dateStr);
        System.out.println("Is valid date: " + isValid);
    }

    public static boolean isValidDate(String dateStr) {
        try {
            LocalDate localDate = LocalDate.parse(dateStr);
            return dateStr.matches("\\d{4}-\\d{2}-\\d{2}") &&
                    localDate.equals(LocalDate.parse(dateStr));
        } catch (DateTimeException e) {
            return false;
        }
    }
}