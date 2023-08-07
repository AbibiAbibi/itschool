package session4.Practice;

public class JavaStatements {

    public static void main(String[] args) {
        int currentYear = 2023;
        int birthYear = 1990;
        int age = currentYear - birthYear;
        System.out.println("Age is: " + age);

        if (age >= 50){
            System.out.println("Eligible to vote.");
        } else {
            System.out.println("Not eligible to vote.");
        }

        int number = 15;
        if (number > 0){
            System.out.println("Number is positive.");
        } else if (number < 0) {
            System.out.println("Number is negative.");
        } else {
            System.out.println("Number is zero.");
        }

        printName();
        printDistinction();
    }

    public static void printName(){
        String name = "Ioana";
        String city = "Cluj";
        String sex = "f";
        int age = 20;

        if (city.equals("Cluj")){
            if (sex.equals("f")){
                if (age == 20){
                    System.out.println(name);
                }
            }
        }

        if (city.equals("Cluj") && sex.equals("f") && age == 20){
            System.out.println(name);
        }
    }

    public static void printDistinction(){
        int mark = 70;

        if (mark >= 85) {
            System.out.println("Distinction.");
        } else if (mark >= 40) {
            System.out.println("Pass.");
        } else {
            System.out.println("Lost.");
        }
    }
}
