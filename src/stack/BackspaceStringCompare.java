package stack;

import java.util.Stack;

public class BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        Stack<String> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '#') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(String.valueOf(c));
            }
        }
        StringBuilder sb1 = new StringBuilder();
        while (!stack.isEmpty()) {
            sb1.append(stack.pop());
        }
        StringBuilder sb2 = new StringBuilder();
        for (char c : t.toCharArray()) {
            if (c == '#') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(String.valueOf(c));
            }
        }
        while (!stack.isEmpty()) {
            sb2.append(stack.pop());
        }
        return sb1.toString().contentEquals(sb2);
    }
}
