package stack;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {
    public String removeDuplicates(String s) {
        Stack<String> stack = new Stack<>();
        // Iterate through each character in the string
        for (char c : s.toCharArray()) {
            // Convert the character to a string
            String currentChar = String.valueOf(c);
            // If the stack is not empty and the top of the stack is equal to the current character,
            if (!stack.isEmpty() && stack.peek().equals(currentChar)) {
                stack.pop();
            } else {
                stack.push(currentChar);
            }
        }

        // Build the result string from the stack
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }
        return result.toString();
    }
}
