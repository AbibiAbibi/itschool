package session6.homework;

public class DuplicateCharacterRemoved {

    public static void main(String[] args) {
        String input = "balloon";
        String result = removeDuplicates(input);
        System.out.println(result);
    }

    public static String removeDuplicates(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean[] visited = new boolean[256];

        for (int index = 0; index < input.length(); index++) {
            char character = input.charAt(index);
            if (!visited[character]) {
                stringBuilder.append(character);
                visited[character] = true;
            }
        }

        return stringBuilder.toString();
    }
}