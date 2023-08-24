package session6.homework;

public class EncodeAndDecodeUsingCaesarCipher {

    public static void main(String[] args) {
        String originalMessage = "Hello, World!";
        System.out.println("Original: " + originalMessage);
        int shift = 3;

        String encryptedMessage = encode(originalMessage, shift);
        System.out.println("Encoded: " + encryptedMessage);

        String decryptedMessage = decode(encryptedMessage, shift);
        System.out.println("Decoded: " + decryptedMessage);
    }

    public static String encode(String message, int shift) {
        StringBuilder encoded = new StringBuilder();

        for (char c : message.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                char shifted = (char) (base + (c - base + shift) % 26);
                encoded.append(shifted);
            } else {
                encoded.append(c);
            }
        }

        return encoded.toString();
    }

    public static String decode(String encodedMessage, int shift) {
        return encode(encodedMessage, 26 - shift);
    }
}