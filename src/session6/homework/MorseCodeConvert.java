package session6.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MorseCodeConvert {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Convert any letter or digit into binary code (without spaces or special characters): ");
        String input = scanner.nextLine();

        String morseCode = convertToMorseCode(input);
        System.out.println(morseCode);

        scanner.close();
    }

    public static String convertToMorseCode(String input) {
        Map<Character, String> morseMap = createMorseMap();
        StringBuilder morseCode = new StringBuilder();

        for (char character : input.toCharArray()) {
            String morseChar = morseMap.get(Character.toLowerCase(character));
            if (morseChar != null) {
                morseCode.append(morseChar).append(" ");
            }
        }

        return morseCode.toString();
    }

    public static Map<Character, String> createMorseMap() {
        Map<Character, String> morseMap = new HashMap<>();
        morseMap.put('a', ".-");
        morseMap.put('b', "-...");
        morseMap.put('c', "-.-.");
        morseMap.put('d', "-..");
        morseMap.put('e', ".");
        morseMap.put('f', "..-.");
        morseMap.put('g', "--.");
        morseMap.put('h', "....");
        morseMap.put('i', "..");
        morseMap.put('j', ".---");
        morseMap.put('k', "-.-");
        morseMap.put('l', ".-..");
        morseMap.put('m', "--");
        morseMap.put('n', "-.");
        morseMap.put('o', "---");
        morseMap.put('p', ".--.");
        morseMap.put('q', "--.-");
        morseMap.put('r', ".-.");
        morseMap.put('s', "...");
        morseMap.put('t', "-");
        morseMap.put('u', "..-");
        morseMap.put('v', "...-");
        morseMap.put('w', ".--");
        morseMap.put('x', "-..-");
        morseMap.put('y', "-.--");
        morseMap.put('z', "--..");
        morseMap.put('0', "-----");
        morseMap.put('1', ".----");
        morseMap.put('2', "..---");
        morseMap.put('3', "...--");
        morseMap.put('4', "....-");
        morseMap.put('5', ".....");
        morseMap.put('6', "-....");
        morseMap.put('7', "--...");
        morseMap.put('8', "---..");
        morseMap.put('9', "----.");
        return morseMap;
    }
}
