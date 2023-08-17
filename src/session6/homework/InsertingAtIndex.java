package session6.homework;

public class InsertingAtIndex {

    public static void main(String[] args) {
        String originalString = "Hello, word!";
        String stringToInsert = "beautiful ";
        int insertionIndex = 7;

        System.out.println("String after insert: " + originalString);
        System.out.println("String before insert: " + insertStringAtIndex(originalString, stringToInsert, insertionIndex));
    }

    public static String insertStringAtIndex(String original, String toInsert, int index) {
        StringBuilder stringBuilder = new StringBuilder(original);
        stringBuilder.insert(index, toInsert);

        return stringBuilder.toString();
    }
}