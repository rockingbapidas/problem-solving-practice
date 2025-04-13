package stack;

import java.util.Stack;

public class BaseBallGame {
    /**
     * This method calculates the final score of a baseball game based on the given operations.
     * The operations can be:
     * - An integer representing a score
     * - "C" to remove the last score
     * - "D" to double the last score
     * - "+" to add the last two scores
     *
     * @param operations an array of strings representing the operations
     * @return the final score after performing all operations
     */
    public int calPoints(String[] operations) {
        Stack<String> stack = new Stack<>();
        for (String operation : operations) {
            switch (operation) {
                case "C" -> {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                }
                case "D" -> {
                    if (!stack.isEmpty()) {
                        int lastScore = Integer.parseInt(stack.peek());
                        stack.push(String.valueOf(lastScore * 2));
                    }
                }
                case "+" -> {
                    if (stack.size() >= 2) {
                        int lastScore = Integer.parseInt(stack.pop());
                        int secondLastScore = Integer.parseInt(stack.peek());
                        stack.push(String.valueOf(lastScore));
                        stack.push(String.valueOf(lastScore + secondLastScore));
                    }
                }
                default -> stack.push(operation);
            }
        }
        int totalScore = 0;
        while (!stack.isEmpty()) {
            totalScore += Integer.parseInt(stack.pop());
        }
        return totalScore;
    }
}
