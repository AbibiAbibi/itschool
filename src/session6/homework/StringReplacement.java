package session6.homework;

public class StringReplacement {

    public static void main(String[] args) {
        String originalString = "The cat sat on the mat.";
        String targetSubstring = "cat";
        String replacementSubstring = "dog";

        String replacedString = replaceSubstring(originalString, targetSubstring, replacementSubstring);
        System.out.println(replacedString);
    }

    public static String replaceSubstring(String original, String target, String replacement) {
        StringBuilder stringBuilder = new StringBuilder(original);
        int index = stringBuilder.indexOf(target);

        while (index != -1) {
            stringBuilder.replace(index, index + target.length(), replacement);
            index = stringBuilder.indexOf(target, index + replacement.length());
        }

        return stringBuilder.toString();
    }
}