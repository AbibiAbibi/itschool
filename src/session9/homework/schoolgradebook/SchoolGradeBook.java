package session9.homework.schoolgradebook;

public class SchoolGradeBook {

    public static void main(String[] args) {
        GradeBook gradebook = new GradeBook();

        gradebook.addStudentToClass("Math", new Student("S1", "John Smith"));
        gradebook.addStudentToClass("Math", new Student("S2", "Jane Doe"));
        gradebook.addStudentToClass("Science", new Student("S3", "Bob Johnson"));

        gradebook.assignGrade("Math", "S1", 85.0);
        gradebook.assignGrade("Math", "S2", 92.5);
        gradebook.assignGrade("Science", "S3", 78.3);

        gradebook.viewClassGrades("Math");
        gradebook.viewClassGrades("Science");
    }
}