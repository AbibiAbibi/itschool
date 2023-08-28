package session7.homework;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class IntervalBetweenDates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first date (YYYY-MM-DD): ");
        String firstDateStr = scanner.nextLine();

        System.out.print("Enter the second date (YYYY-MM-DD): ");
        String secondDateStr = scanner.nextLine();

        scanner.close();

        long daysDifference = daysBetween(firstDateStr, secondDateStr);
        System.out.println("Difference in days: " + daysDifference);
    }

    public static long daysBetween(String date1, String date2) {
        LocalDate localDate1 = LocalDate.parse(date1);
        LocalDate localDate2 = LocalDate.parse(date2);

        return ChronoUnit.DAYS.between(localDate1, localDate2);
    }
}