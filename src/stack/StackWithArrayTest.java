package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackWithArrayTest {
    @Test
    void test_stack_with_array() {
        StackWithArray stack = new StackWithArray(5);
        stack.push(23);
        stack.push(35);
        stack.push(40);
        assertEquals(40, stack.pop());
        assertEquals(35, stack.pop());
        assertEquals(23, stack.pop());
        assertEquals(-1, stack.pop());
    }
}