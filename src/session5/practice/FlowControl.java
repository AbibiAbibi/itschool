package session5.practice;

import java.util.ArrayList;
import java.util.List;

public class FlowControl {

    public static void main(String[] args) {
//        printNumberWithWhile(10);
//        printNumberWithDoWhile(10);
//        printNumberWithFor(10);

        List<String> list = new ArrayList<>();
        list.add("Timisoara");
        list.add("Bucuresti");
        list.add("Cluj");

        printListWithForEach(list);
        printListWithFor(list);
    }

    public static void printNumberWithWhile(int input) {
        int number = 1;
        while (number < input) {
            System.out.print(number + ", ");
            number++;
            if (number == input) {
                System.out.println(number + ".");
            }
        }
    }

    public static void printNumberWithDoWhile(int input) {
        int number = 1;
        do {
            System.out.print(number + ", ");
            number++;
            if (number == input)
                System.out.println(number + ".");
        } while (number < input);
    }

    public static void printNumberWithFor(int input) {
        for (int number = 1; number <= input; number++) {
            if (number < 10) {
                System.out.print(number + ", ");
            } else {
                System.out.println(number + ".");
            }
        }
    }

    public static void printListWithForEach(List<String> list) {
        int listSize = list.size();
        int count = 0;
        for (String listValue : list) {
            count++;
            if (listSize == count) {
                System.out.println(listValue + ".");
            } else {
                System.out.print(listValue + ", ");
            }
        }
    }

    public static void printListWithFor(List<String> list) {
        for (int index = 0; index < list.size(); index++) {
            if (index == list.size() - 1) {
                System.out.println(list.get(index) + ".");
            } else {
                System.out.print(list.get(index) + ", ");
            }
        }
    }
}