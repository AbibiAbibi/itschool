package session8.homework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class StudentList {

    public static void main(String[] args) {
        LinkedList<String> studentList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        studentList.add("John");
        studentList.add("Alice");
        studentList.add("Bob");
        studentList.add("Eva");
        studentList.add("Michael");

        System.out.println("List of students: ");
        for (String student : studentList) {
            System.out.println(student);
        }

        System.out.print("Enter the name of the student to remove: ");
        String studentName = scanner.nextLine();

        Iterator<String> iterator = studentList.iterator();
        boolean found = false;

        while (iterator.hasNext()) {
            String student = iterator.next();
            if (student.equals(studentName)) {
                iterator.remove();
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(studentName + " has been removed from the list.");
        } else {
            System.out.println(studentName + " was not found in the list.");
        }

        System.out.println("Updated list of students: ");
        for (String student : studentList) {
            System.out.println(student);
        }
    }
}