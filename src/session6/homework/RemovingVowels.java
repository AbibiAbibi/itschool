package session6.homework;

public class RemovingVowels {

    public static void main(String[] args) {
        String input = "This is a test string with vowels.";
        String result = removeVowels(input);
        System.out.println(result);
    }

    public static String removeVowels(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char vowel : input.toCharArray()) {
            if (!isVowel(vowel)) {
                stringBuilder.append(vowel);
            }
        }
        return stringBuilder.toString();
    }

    public static boolean isVowel(char vowel) {
        vowel = Character.toLowerCase(vowel);
        return vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u';
    }
}
