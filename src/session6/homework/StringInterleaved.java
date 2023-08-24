package session6.homework;

public class StringInterleaved {

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "123";
        String interleaved = interleaveStrings(str1, str2);
        System.out.println(interleaved);
    }

    public static String interleaveStrings(String str1, String str2) {
        StringBuilder interleaved = new StringBuilder();
        int minLength = Math.min(str1.length(), str2.length());

        for (int i = 0; i < minLength; i++) {
            interleaved.append(str1.charAt(i)).append(str2.charAt(i));
        }

        if (str1.length() > str2.length()) {
            interleaved.append(str1.substring(minLength));
        } else if (str2.length() > str1.length()) {
            interleaved.append(str2.substring(minLength));
        }

        return interleaved.toString();
    }
}