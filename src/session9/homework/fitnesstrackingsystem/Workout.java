package session9.homework.fitnesstrackingsystem;

public class Workout {

    private String type;
    private double duration;
    private double distance;
    private double weightLifted;
    private String date;

    public Workout(String type, double duration, double distance, double weightLifted, String date) {
        this.type = type;
        this.duration = duration;
        this.distance = distance;
        this.weightLifted = weightLifted;
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public double getDuration() {
        return duration;
    }

    public double getDistance() {
        return distance;
    }

    public double getWeightLifted() {
        return weightLifted;
    }

    public String getDate() {
        return date;
    }
}