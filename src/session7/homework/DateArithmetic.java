package session7.homework;

import java.time.LocalDate;

public class DateArithmetic {

    public static void main(String[] args) {
        int weeksToAdd = 4;
        LocalDate newDate = addWeeksToToday(weeksToAdd);
        System.out.println("New date: " + newDate);
    }

    public static LocalDate addWeeksToToday(int weeks) {
        LocalDate currentDate = LocalDate.now();
        return currentDate.plusWeeks(weeks);
    }
}