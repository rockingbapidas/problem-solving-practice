package interview.fbprep;

import java.util.Stack;

public class BalancedBrackets {
    public String validBrackets(String s) {
        // Write your code here
        if (s == null || s.isEmpty()) return "NO";

        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            String bracket = String.valueOf(s.charAt(i));
            if (bracket.equals("(") || bracket.equals("{") || bracket.equals("[")) {
                stack.push(bracket);
            } else {
                if (stack.isEmpty()) return "NO";
                String open = stack.pop();
                if (bracket.equals(")") && !open.equals("(") ||
                        bracket.equals("]") && !open.equals("[") ||
                        bracket.equals("}") && !open.equals("{")) {
                    return "NO";
                }
            }
        }
        if (stack.isEmpty()) return "YES";
        else return "NO";
    }

    public boolean isBalanced(String s) {
        // Write your code here
        if (s == null || s.isEmpty()) return false;

        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            String bracket = String.valueOf(s.charAt(i));
            if (bracket.equals("(") || bracket.equals("{") || bracket.equals("[")) {
                stack.push(bracket);
            } else {
                if (stack.isEmpty()) return false;
                String open = stack.pop();
                if (bracket.equals(")") && !open.equals("(") ||
                        bracket.equals("]") && !open.equals("[") ||
                        bracket.equals("}") && !open.equals("{")) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
