package session8.homework;

import java.util.ArrayList;

public class ArrayListTransfer {

    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<>();
        ArrayList<String> graduateStudentList = new ArrayList<>();

        studentList.add("Student 1, ");
        studentList.add("Student 2, ");
        studentList.add("Student 3, ");
        studentList.add("Student 4, ");
        studentList.add("Student 5, ");
        studentList.add("Student 6, ");
        studentList.add("Student 7, ");
        studentList.add("Student 8, ");
        studentList.add("Student 9, ");
        studentList.add("Student 10.");

        graduateStudentList.addAll(studentList);

        System.out.print("Graduate Student List: ");
        for (String student : graduateStudentList) {
            System.out.print(student);
        }
    }
}