package session6.homework;

public class wordCapitalization {

    public static void main(String[] args) {
        String input = "write a program that capitalizes the first letter of every word.";
        String result = capitalizeWords(input);
        System.out.println(result);
    }

    public static String capitalizeWords(String sentence) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean capitalizeNext = true;

        for (char c : sentence.toCharArray()) {
            if (Character.isWhitespace(c)) {
                capitalizeNext = true;
            } else if (capitalizeNext) {
                c = Character.toUpperCase(c);
                capitalizeNext = false;
            }

            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }
}