package session9.homework.collegemanagementsystem;

public class Person {

    private String firstName;
    private String lastName;
    private String sex;
    private int age;
    private String dateOfBirth;
    private String cnp;
    private String address;

    public Person(String firstName, String lastName, String sex, int age, String dateOfBirth, String cnp, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.cnp = cnp;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}