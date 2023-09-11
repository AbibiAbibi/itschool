package session9.homework.fitnesstrackingsystem;

import java.util.Scanner;

public class FitnessTrackingSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        FitnessTracker tracker = new FitnessTracker(username);

        while (true) {
            System.out.println("\nFitness Tracking System");
            System.out.println("1. Log Workout");
            System.out.println("2. Set Weekly Running Goal");
            System.out.println("3. Set Weekly Weightlifting Goal");
            System.out.println("4. Generate Weekly Summary");
            System.out.println("5. View Workout History");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter workout type (e.g., running, weightlifting, yoga): ");
                    String type = scanner.nextLine();
                    System.out.print("Enter duration (minutes): ");
                    double duration = scanner.nextDouble();
                    System.out.print("Enter distance (km, 0 for non-running workouts): ");
                    double distance = scanner.nextDouble();
                    System.out.print("Enter weight lifted (kg, 0 for non-weightlifting workouts): ");
                    double weightLifted = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter date (e.g., 2023-09-11): ");
                    String date = scanner.nextLine();
                    tracker.logWorkout(type, duration, distance, weightLifted, date);
                    System.out.println("Workout logged successfully!");
                    break;

                case 2:
                    System.out.print("Enter weekly running goal (km): ");
                    double runningGoal = scanner.nextDouble();
                    tracker.setWeeklyRunningGoal(runningGoal);
                    System.out.println("Weekly running goal set successfully!");
                    break;

                case 3:
                    System.out.print("Enter weekly weightlifting goal (kg): ");
                    double weightliftingGoal = scanner.nextDouble();
                    tracker.setWeeklyWeightliftingGoal(weightliftingGoal);
                    System.out.println("Weekly weightlifting goal set successfully!");
                    break;

                case 4:
                    tracker.generateWeeklySummary();
                    break;

                case 5:
                    System.out.print("Enter workout type to filter (leave blank for all types): ");
                    String searchType = scanner.nextLine();
                    System.out.print("Enter date to filter (leave blank for all dates): ");
                    String searchDate = scanner.nextLine();
                    tracker.viewWorkoutHistory(searchType, searchDate);
                    break;

                case 6:
                    System.out.println("Exiting the Fitness Tracking System. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}