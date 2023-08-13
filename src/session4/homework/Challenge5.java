package session4.homework;

public class Challenge5 {
    // 5. Write a Java program to print the numbers from 1 to 10
    // using a for loop. As a next step, modify your program to print
    // only the even numbers from 1 to 10.
    public static void main(String[] args) {
        System.out.print("The numbers from 1 to 10 is: ");

        for (int number = 1; number<=10;number++){
            System.out.print(number + " ");
        }

        System.out.println();

        System.out.print("The even numbers from 1 to 10 are: ");

        for (int number = 1; number<=10;number++){
            if(number%2==0){
                System.out.print(number + " ");
            }
        }
    }
}