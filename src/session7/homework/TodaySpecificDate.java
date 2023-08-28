package session7.homework;

import java.time.LocalDate;

public class TodaySpecificDate {

    public static void main(String[] args) {
        boolean isSpecificDate = isTodaySpecificDate();
        System.out.println(isSpecificDate);
    }

    public static boolean isTodaySpecificDate() {
        LocalDate currentDate = LocalDate.now();
        LocalDate specificDate = LocalDate.of(2019, 12, 10);

        return currentDate.equals(specificDate);
    }
}