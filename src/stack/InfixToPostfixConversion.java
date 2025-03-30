package stack;

import java.util.Stack;

public class InfixToPostfixConversion {

    private static int precedence(char op) {
        return switch (op) {
            case '^' -> 3;
            case '*', '/' -> 2;
            case '+', '-' -> 1;
            default -> -1;
        };
    }

    public String infixToPostfix(String infix) {
        Stack<Character> stack = new Stack<>();
        StringBuilder postFix = new StringBuilder();

        for (char c : infix.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                postFix.append(c);
            } else if (c == '(') {
                stack.push(c); // Push '(' onto the stack
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postFix.append(stack.pop());
                }
                stack.pop(); // Pop the '('
            } else {
                // Operator
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    postFix.append(stack.pop());
                }
                stack.push(c); // Push the operator
            }
        }

        while (!stack.isEmpty()) {
            postFix.append(stack.pop());
        }

        return postFix.toString();
    }
}
