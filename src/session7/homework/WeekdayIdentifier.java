package session7.homework;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class WeekdayIdentifier {

    public static void main(String[] args) {
        String inputDate = "2023-08-24";
        String dayOfWeek = findDayOfWeek(inputDate);
        System.out.println("Day of the week: " + dayOfWeek);
    }

    public static String findDayOfWeek(String date) {
        LocalDate localDate = LocalDate.parse(date);
        return localDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());
    }
}