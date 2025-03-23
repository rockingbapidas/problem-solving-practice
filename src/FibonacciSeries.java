import java.util.HashMap;
import java.util.Map;

public class FibonacciSeries {
    public int febonacci(int n) {
        Map<Integer, Integer> fibonacciResults = new HashMap<>();
        return fibonacci(n - 1, fibonacciResults);
    }

    private int fibonacci(int n, Map<Integer, Integer> fibonacciResults) {
        if (fibonacciResults.get(n) != null) {
            return fibonacciResults.get(n);
        }

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int number = fibonacci(n - 1, fibonacciResults) + fibonacci(n - 2, fibonacciResults);
            fibonacciResults.put(n, number);
            return number;
        }
    }
}
