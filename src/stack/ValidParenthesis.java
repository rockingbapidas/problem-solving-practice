package stack;

import java.util.Stack;

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
 */
public class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            String bracket = String.valueOf(s.charAt(i));

            if (bracket.equals("(") || bracket.equals("[") || bracket.equals("{")) {
                stack.push(bracket);
            } else {
                String open = stack.isEmpty() ? "" : stack.peek();
                if (bracket.equals(")") && open.equals("(")) {
                    stack.pop();
                } else if (bracket.equals("]") && open.equals("[")) {
                    stack.pop();
                } else if (bracket.equals("}") && open.equals("{")) {
                    stack.pop();
                } else {
                    return false;
                }
            }

        }

        return stack.isEmpty();
    }
}
