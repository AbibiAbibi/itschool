package session9.homework.fitnesstrackingsystem;

import java.util.ArrayList;
import java.util.List;

public class FitnessTracker {

    private List<Workout> workouts;
    private double weeklyRunningGoal;
    private double weeklyWeightliftingGoal;
    private String username;

    public FitnessTracker(String username) {
        this.username = username;
        this.workouts = new ArrayList<>();
        this.weeklyRunningGoal = 0.0;
        this.weeklyWeightliftingGoal = 0.0;
    }

    public void logWorkout(String type, double duration, double distance, double weightLifted, String date) {
        Workout workout = new Workout(type, duration, distance, weightLifted, date);
        workouts.add(workout);
    }

    public void setWeeklyRunningGoal(double goal) {
        weeklyRunningGoal = goal;
    }

    public void setWeeklyWeightliftingGoal(double goal) {
        weeklyWeightliftingGoal = goal;
    }

    public void generateWeeklySummary() {
        double totalRunningDistance = 0.0;
        double totalWeightLifted = 0.0;

        for (Workout workout : workouts) {
            if (workout.getType().equalsIgnoreCase("running")) {
                totalRunningDistance += workout.getDistance();
            } else if (workout.getType().equalsIgnoreCase("weightlifting")) {
                totalWeightLifted += workout.getWeightLifted();
            }
        }

        System.out.println("Weekly Summary for " + username);
        System.out.println("Running Distance: " + totalRunningDistance + " km");
        System.out.println("Weight Lifted: " + totalWeightLifted + " kg");

        if (totalRunningDistance >= weeklyRunningGoal && totalWeightLifted >= weeklyWeightliftingGoal) {
            System.out.println("Congratulations! You met your weekly fitness goals.");
        } else {
            System.out.println("You did not meet one or more of your weekly fitness goals.");
        }
    }

    public void viewWorkoutHistory(String searchType, String searchDate) {
        System.out.println("Workout History for " + username);

        for (Workout workout : workouts) {
            if ((searchType.isEmpty() || workout.getType().equalsIgnoreCase(searchType))
                    && (searchDate.isEmpty() || workout.getDate().equalsIgnoreCase(searchDate))) {
                System.out.println("Type: " + workout.getType());
                System.out.println("Duration: " + workout.getDuration() + " minutes");
                System.out.println("Distance: " + workout.getDistance() + " km");
                System.out.println("Weight Lifted: " + workout.getWeightLifted() + " kg");
                System.out.println("Date: " + workout.getDate());
                System.out.println("------------------------");
            }
        }
    }
}