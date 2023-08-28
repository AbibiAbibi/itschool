package session7.homework;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimeConversionAcrossZones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter date and time (YYYY-MM-DD HH:MM:SS): ");
        String dateTimeStr = scanner.nextLine();

        System.out.print("Enter timezone (e.g., EST, PST): ");
        String timezone = scanner.nextLine();

        scanner.close();

        String convertedTime = convertToTimeZone(dateTimeStr, timezone);
        System.out.println("Converted date and time: " + convertedTime);
    }

    public static String convertToTimeZone(String dateTimeStr, String timezone) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse(dateTimeStr, formatter);

        ZoneId zoneId = ZoneId.of(timezone);
        ZonedDateTime zonedDateTime = localDateTime.atZone(zoneId);

        return zonedDateTime.format(formatter);
    }
}