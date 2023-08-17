package session4.homework;

public class Challenge1 {
    // 1. Write a Java program where you create two String objects named stringOne
    // and stringTwo with the same value "OpenAI". Check and print whether they refer to the same object.
    public static void main(String[] args) {
        String stringOne = "OpenAi";
        String stringTwo = "OpenAi";

        System.out.println(stringOne.equals(stringTwo));
    }
}