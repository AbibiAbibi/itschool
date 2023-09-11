package session13;

import java.util.Scanner;

public class WeekDayOrWeekend {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String dayOfWeek = scanner.nextLine().toLowerCase();

        switch (dayOfWeek) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println("This is a week day " + dayOfWeek);
                break;
            case "saturday":
            case "sunday":
                System.out.println("This is a weekend day " + dayOfWeek);
                break;
            default:
                System.out.println("Invalid day!");
        }
        scanner.close();
    }
}
