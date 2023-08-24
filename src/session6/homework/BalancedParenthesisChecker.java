package session6.homework;

import java.util.Stack;

public class BalancedParenthesisChecker {

    public static void main(String[] args) {
        String input = "({[()]})";
        boolean isBalanced = checkBalancedParentheses(input);

        if (isBalanced) {
            System.out.println("The parentheses are balanced.");
        } else {
            System.out.println("The parentheses are not balanced.");
        }
    }

    public static boolean checkBalancedParentheses(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == ']' && top != '[') ||
                        (c == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}