package session6.homework;

public class EncodeStringsWithRunLengthEncoding {

    public static void main(String[] args) {
        String input = "AAABBBCCDAA";
        String encodedString = encodeRLE(input);
        System.out.println(encodedString);
    }

    public static String encodeRLE(String str) {
        StringBuilder encoded = new StringBuilder();

        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                encoded.append(count).append(str.charAt(i - 1));
                count = 1;
            }
        }

        encoded.append(count).append(str.charAt(str.length() - 1));

        return encoded.toString();
    }
}