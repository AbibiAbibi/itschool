package session11.homework;

public class TestParentClass {

    public static void main(String[] args) {
        Parent firstObj = new FirstSubclass();
        Parent secondObj = new SecondSubclass();

        firstObj.message();
        secondObj.message();
    }
}