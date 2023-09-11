package session9.homework.collegemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class CollegeManagementSystem {

    public static void main(String[] args) {
        Student student1 = new Student("John", "Doe", "Male", 20, "01/01/2000", "1234567890", "Address1");
        Student student2 = new Student("Jane", "Smith", "Female", 21, "02/02/1999", "0987654321", "Address2");

        Professor professor1 = new Professor("Prof", "One", "Male", 40, "03/03/1980", "1111111111", "Address3");
        Professor professor2 = new Professor("Prof", "Two", "Male", 35, "04/04/1985", "2222222222", "Address4");

        Course mathCourse = new Course("Mathematics", "Monday, Wednesday, Friday", 16, "Advanced mathematics course");
        Course csCourse = new Course("Computer Science", "March-June", 18, "Java programming course");

        mathCourse.assignProfessor(professor1);
        csCourse.assignProfessor(professor2);

        List<Course> courses = new ArrayList<>();
        courses.add(mathCourse);
        courses.add(csCourse);

        for (Course course : courses) {
            System.out.println("Course Name: " + course.getName());
            System.out.println("Schedule: " + course.getSchedule());
            System.out.println("Duration: " + course.getDuration() + " weeks");
            System.out.println("Description: " + course.getDescription());
            System.out.println("Assigned Professor: " + course.getAssignedProfessor().getFirstName() + " " + course.getAssignedProfessor().getLastName());
            System.out.println("------------------------------------");
        }
    }
}