package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackWithQueueTest {
    @Test
    void test_stackWithQueue() {
        StackWithQueue myStack = new StackWithQueue();
        myStack.push(1);
        myStack.push(2);
        assertEquals(2, myStack.top()); // return 2
        assertEquals(2,myStack.pop()); // return 2
        assertEquals(false, myStack.isEmpty()); // return False
    }
}