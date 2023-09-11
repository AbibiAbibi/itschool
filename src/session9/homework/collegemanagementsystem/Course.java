package session9.homework.collegemanagementsystem;

public class Course {

    private String name;
    private String schedule;
    private int duration;
    private String description;
    private Professor assignedProfessor;

    public Course(String name, String schedule, int duration, String description) {
        this.name = name;
        this.schedule = schedule;
        this.duration = duration;
        this.description = description;
    }

    public void assignProfessor(Professor professor) {
        this.assignedProfessor = professor;
    }

    public String getName() {
        return name;
    }

    public String getSchedule() {
        return schedule;
    }

    public int getDuration() {
        return duration;
    }


    public String getDescription() {
        return description;
    }

    public Professor getAssignedProfessor() {
        return assignedProfessor;
    }
}