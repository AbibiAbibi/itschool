package session3.Homework;

public class Challenge4 {
    //4. Write a Java program that uses both the increment (++) and decrement
    //(--) operators in a loop to count up to 10 and then back down to 1.
    public static void main(String[] args) {

        for(int number = 1;number<=10;number++){
            System.out.print(number + " ");
        }

        for(int number = 9;number>=1;number--) {
            System.out.print(number + " ");
        }
    }
}