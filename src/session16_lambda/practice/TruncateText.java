package session16_lambda.practice;

@FunctionalInterface
public interface TruncateText {

    String truncate(String input, int maxLength);
}