package session6.homework;

public class CamelCaseToSnakeCaseConverter {

    public static void main(String[] args) {
        String camelCaseString = "thisIsCamelCase";
        System.out.println("Original: " + camelCaseString);
        String snakeCaseString = convertToSnakeCase(camelCaseString);
        System.out.println("Converted: " + snakeCaseString);
    }

    public static String convertToSnakeCase(String camelCase) {
        StringBuilder snakeCase = new StringBuilder();

        for (char c : camelCase.toCharArray()) {
            if (Character.isUpperCase(c)) {
                snakeCase.append("_").append(Character.toLowerCase(c));
            } else {
                snakeCase.append(c);
            }
        }

        return snakeCase.toString();
    }
}
