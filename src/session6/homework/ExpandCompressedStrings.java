package session6.homework;

public class ExpandCompressedStrings {

    public static void main(String[] args) {
        String compressedString = "a3b2c4";
        System.out.println("Original: " + compressedString);
        String expandedString = expandCompressedString(compressedString);
        System.out.println("Expanded: " + expandedString);
    }

    public static String expandCompressedString(String compressed) {
        StringBuilder expanded = new StringBuilder();

        int i = 0;
        while (i < compressed.length()) {
            char currentChar = compressed.charAt(i);
            i++;
            int count = 0;
            while (i < compressed.length() && Character.isDigit(compressed.charAt(i))) {
                count = count * 10 + (compressed.charAt(i) - '0');
                i++;
            }
            for (int j = 0; j < count; j++) {
                expanded.append(currentChar);
            }
        }

        return expanded.toString();
    }
}