package session9.homework.schoolgradebook;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String studentID;
    private String name;
    private List<Double> grades;

    public Student(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public double calculateAverageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }
}