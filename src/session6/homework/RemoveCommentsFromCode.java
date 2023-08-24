package session6.homework;

public class RemoveCommentsFromCode {

    public static void main(String[] args) {
        String codeWithComments = "/* This is a multi-line comment */\n" +
                "int x = 5; // This is a single-line comment\n" +
                "int y = 10; /* Another multi-line comment */";
        System.out.println("Original: " + codeWithComments);

        String codeWithoutComments = removeComments(codeWithComments);
        System.out.println("Clean: " + codeWithoutComments);
    }

    public static String removeComments(String code) {
        StringBuilder cleanCode = new StringBuilder();
        boolean inSingleLineComment = false;
        boolean inMultiLineComment = false;

        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);

            if (inSingleLineComment) {
                if (c == '\n') {
                    inSingleLineComment = false;
                    cleanCode.append(c);
                }
            } else if (inMultiLineComment) {
                if (c == '*' && i < code.length() - 1 && code.charAt(i + 1) == '/') {
                    inMultiLineComment = false;
                    i++;
                }
            } else {
                if (c == '/' && i < code.length() - 1) {
                    char nextChar = code.charAt(i + 1);
                    if (nextChar == '/') {
                        inSingleLineComment = true;
                        i++;
                    } else if (nextChar == '*') {
                        inMultiLineComment = true;
                        i++;
                    } else {
                        cleanCode.append(c);
                    }
                } else {
                    cleanCode.append(c);
                }
            }
        }

        return cleanCode.toString();
    }
}