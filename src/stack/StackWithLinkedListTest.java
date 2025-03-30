package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackWithLinkedListTest {
    @Test
    void test_stack_with_linked_list() {
        StackWithLinkedList stack = new StackWithLinkedList();
        stack.push(23);
        stack.push(34);
        assertEquals(34, stack.pop());
        assertEquals(23, stack.pop());
        assertEquals(-1, stack.pop());
    }
}