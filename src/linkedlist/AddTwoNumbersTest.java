package linkedlist;

import linkedlist.data.SingleLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {
    @Test
    void testAdd() {
        SingleLinkedList l1 = new SingleLinkedList(2);
        l1.next = new SingleLinkedList(4);
        l1.next.next = new SingleLinkedList(3);

        SingleLinkedList l2 = new SingleLinkedList(5);
        l2.next = new SingleLinkedList(6);
        l2.next.next = new SingleLinkedList(4);

        SingleLinkedList expected = new SingleLinkedList(7);
        expected.next = new SingleLinkedList(0);
        expected.next.next = new SingleLinkedList(8);

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        SingleLinkedList result = addTwoNumbers.add(l1, l2);

        while (expected != null) {
            assertEquals(expected.data, result.data);
            expected = expected.next;
            result = result.next;
        }
    }
}