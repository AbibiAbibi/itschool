package session7.homework;

import java.time.LocalDate;

public class DateDecomposition {

    public static void main(String[] args) {
        displayDateComponents(LocalDate.now());
    }

    public static void displayDateComponents(LocalDate date) {
        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();

        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
    }
}