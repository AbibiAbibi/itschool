package session6.homework;

public class PatternRecognition {
    public static void main(String[] args) {
        String input = "ababab";
        boolean hasPattern = checkPattern(input);

        if (hasPattern) {
            System.out.println("The string contains a repeating pattern.");
        } else {
            System.out.println("The string does not contain a repeating pattern.");
        }
    }

    public static boolean checkPattern(String str) {
        int length = str.length();

        for (int patternLength = 1; patternLength <= length / 2; patternLength++) {
            if (length % patternLength == 0) {
                String pattern = str.substring(0, patternLength);
                StringBuilder repeatedPattern = new StringBuilder();

                for (int i = 0; i < length / patternLength; i++) {
                    repeatedPattern.append(pattern);
                }

                if (repeatedPattern.toString().equals(str)) {
                    return true;
                }
            }
        }

        return false;
    }
}