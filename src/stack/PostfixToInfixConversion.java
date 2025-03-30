package stack;

import java.util.Stack;

public class PostfixToInfixConversion {

    static boolean isOperand(char x) {
        return (x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z');
    }

    public String postFixToInfix(String postFix) {
        Stack<String> stack = new Stack<>();

        for (char c : postFix.toCharArray()) {
            if (isOperand(c)) {
                stack.push(c + ""); // Push operand to stack
            } else {
                // Operator
                String op1 = stack.pop();
                String op2 = stack.pop();

                // Create a new infix expression
                String newInfix = "(" + op2 + c + op1 + ")";

                // Push the new infix expression back to the stack
                stack.push(newInfix); // Only push the first character for simplicity
            }
        }

        // The final infix expression is at the top of the stack
        return stack.peek();
    }
}
