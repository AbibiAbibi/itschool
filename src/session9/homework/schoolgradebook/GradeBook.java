package session9.homework.schoolgradebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GradeBook {

    private Map<String, List<Student>> classes;

    public GradeBook() {
        this.classes = new HashMap<>();
    }

    public void addStudentToClass(String className, Student student) {
        classes.computeIfAbsent(className, k -> new ArrayList<>()).add(student);
    }

    public void assignGrade(String className, String studentID, double grade) {
        List<Student> students = classes.get(className);
        if (students != null) {
            for (Student student : students) {
                if (student.getStudentID().equals(studentID)) {
                    student.addGrade(grade);
                    break;
                }
            }
        }
    }

    public void viewClassGrades(String className) {
        List<Student> students = classes.get(className);
        if (students != null) {
            System.out.println("Class: " + className);
            for (Student student : students) {
                double averageGrade = student.calculateAverageGrade();
                System.out.println("Student ID: " + student.getStudentID());
                System.out.println("Name: " + student.getName());
                System.out.println("Average Grade: " + averageGrade);
                System.out.println("------------------------");
            }
        }
    }
}