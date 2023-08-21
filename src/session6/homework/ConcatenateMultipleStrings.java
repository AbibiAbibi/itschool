package session6.homework;

import java.util.ArrayList;
import java.util.List;

public class ConcatenateMultipleStrings {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add(" ");
        stringList.add("world");
        stringList.add("!");

        String concatenatedString = concatenateStrings(stringList);
        System.out.println(concatenatedString);
    }

    public static String concatenateStrings(List<String> strings) {
        StringBuilder stringBuilder = new StringBuilder();

        for (String str : strings) {
            stringBuilder.append(str);
        }

        return stringBuilder.toString();
    }
}