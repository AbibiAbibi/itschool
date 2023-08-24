package session6.homework;

public class FrequencyCounter {

    public static void main(String[] args) {
        String input = "hello world";
        int[] frequencyArray = countCharacterFrequency(input);

        for (int index = 0; index < frequencyArray.length; index++) {
            if (frequencyArray[index] > 0) {
                char character = (char) index;
                System.out.println("Character: " + character + ", Frequency: " + frequencyArray[index]);
            }
        }
    }

    public static int[] countCharacterFrequency(String input) {
        int[] frequencyArray = new int[256];

        for (char character : input.toCharArray()) {
            frequencyArray[character]++;
        }

        return frequencyArray;
    }
}