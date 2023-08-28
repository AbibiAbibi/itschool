package session7.homework;

import java.time.LocalDate;

public class SpecificDate {

    public static void main(String[] args) {
        LocalDate specificDate = createSpecificDate();
        System.out.println("A date object for " + specificDate);
    }

    public static LocalDate createSpecificDate() {
        return LocalDate.of(2025, 8, 19);
    }
}