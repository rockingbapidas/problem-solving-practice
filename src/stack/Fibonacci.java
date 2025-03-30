package stack;

public class Fibonacci {
    public int febonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return febonacci(n - 1) + febonacci(n - 2);
    }
}
