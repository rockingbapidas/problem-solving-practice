package stack;

import java.util.Stack;

public class RemoveOutermostParentheses {
    public String removeOuterParentheses(String s) {
        Stack<String> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (count > 0) {
                    result.append(c);
                }
                stack.push(String.valueOf(c));
                count++;
            } else {
                count--;
                if (count > 0) {
                    result.append(c);
                }
                stack.pop();
            }
        }
        // The stack should be empty if the parentheses are balanced
        if (!stack.isEmpty()) {
            throw new IllegalArgumentException("Unbalanced parentheses");
        }
        return result.toString();
    }
}
