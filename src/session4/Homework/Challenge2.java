package session4.Homework;

public class Challenge2 {
    // 2.  Write a Java program to declare two integer variables firstNumber and secondNumber
    // with any values. Use an equality operator to compare these two numbers and print the result.
    // Do the same for two String objects firstString and secondString with the same value, but use
    // the equals() method for comparison. Print the result.
    public static void main(String[] args) {
        int firstNumber = 9;
        int secondNumber = 6;

        System.out.println(firstNumber == secondNumber);

        String firstString = "Year";
        String secondString = "Year";

        System.out.println(firstString.equals(secondString));
    }
}