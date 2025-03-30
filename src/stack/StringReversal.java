package stack;

import java.util.Stack;

public class StringReversal {
    public String reverse(String input) {
        if (input == null) {
            throw new IllegalArgumentException();
        }

        StringBuilder reversed = new StringBuilder();

        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }
}
