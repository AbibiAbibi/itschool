package session7.homework;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class DurationSince {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a prior time (HH:MM:SS): ");
        String priorTimeStr = scanner.nextLine();

        scanner.close();

        String elapsedTime = elapsedTimeSince(priorTimeStr);
        System.out.println("Time duration since " + priorTimeStr + ": " + elapsedTime);
    }

    public static String elapsedTimeSince(String priorTimeStr) {
        LocalTime priorTime = LocalTime.parse(priorTimeStr);
        LocalTime currentTime = LocalTime.now();

        Duration duration = Duration.between(priorTime, currentTime);
        long hours = duration.toHours();
        long minutes = duration.toMinutesPart();
        long seconds = duration.toSecondsPart();

        return hours + " hours, " + minutes + " minutes, " + seconds + " seconds";
    }
}