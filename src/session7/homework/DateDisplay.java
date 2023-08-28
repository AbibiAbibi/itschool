package session7.homework;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDisplay {

    public static void main(String[] args) {
        displayTodaysDate();
    }

    public static void displayTodaysDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date currentDate = new Date();
        String formattedDate = dateFormat.format(currentDate);
        System.out.println("Today's date: " + formattedDate);
    }
}