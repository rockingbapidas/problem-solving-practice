package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    @Test
    void Test_factorial() {
        Factorial factorial = new Factorial();
        int actual = factorial.factorial(5);
        assertEquals(120, actual);
    }
}