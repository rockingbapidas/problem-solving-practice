package stack;

import java.util.Stack;

public class FinalPricesWithASpecialDiscount {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int n = prices.length;
        int[] result = new int[n];
        System.arraycopy(prices, 0, result, 0, n);
        for (int i = 0; i < n; i++) {
            // While the stack is not empty and the current price is less than or equal to the price at the index stored in the stack
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                int index = stack.pop();
                result[index] -= prices[i];
            }
            stack.push(i);
        }
        return result;
    }
}
