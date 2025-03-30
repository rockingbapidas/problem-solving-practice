package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    @Test
    void Test_fibonacci_case_1() {
        int actual = new Fibonacci().febonacci(5);

        assertEquals(5, actual);
    }
}