package session7.homework;

import java.time.LocalDate;
import java.util.Scanner;

public class ComparingUserEnteredDates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first date (YYYY-MM-DD): ");
        String firstDateStr = scanner.nextLine();

        System.out.print("Enter the second date (YYYY-MM-DD): ");
        String secondDateStr = scanner.nextLine();

        scanner.close();

        boolean datesEqual = areDatesEqual(firstDateStr, secondDateStr);
        System.out.println("Dates are equal: " + datesEqual);
    }

    public static boolean areDatesEqual(String date1, String date2) {
        LocalDate localDate1 = LocalDate.parse(date1);
        LocalDate localDate2 = LocalDate.parse(date2);

        return localDate1.equals(localDate2);
    }
}