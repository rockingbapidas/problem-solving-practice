package linkedlist;

import linkedlist.data.SingleLinkedList;
import linkedlist.wrapper.SingleLinkedListWrapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseSingleLinkedListTest {
    @Test
    void test_reverse_single_list_with_iteration(){
        ReverseSingleLinkedList reverseSingleLinkedList = new ReverseSingleLinkedList();
        SingleLinkedListWrapper singleLinkedListWrapper = new SingleLinkedListWrapper();
        singleLinkedListWrapper.build(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});

        SingleLinkedList result = reverseSingleLinkedList.iteration(singleLinkedListWrapper.mNodeHead);
        assertEquals(10, result.data);
        assertEquals(9, result.next.data);
        assertEquals(8, result.next.next.data);
        assertEquals(7, result.next.next.next.data);
        assertEquals(6, result.next.next.next.next.data);
        assertEquals(5, result.next.next.next.next.next.data);
        assertEquals(4, result.next.next.next.next.next.next.data);
        assertEquals(3, result.next.next.next.next.next.next.next.data);
        assertEquals(2, result.next.next.next.next.next.next.next.next.data);
        assertEquals(1, result.next.next.next.next.next.next.next.next.next.data);
    }

    @Test
    void test_reverse_single_list_with_recursion() {
        ReverseSingleLinkedList reverseSingleLinkedList = new ReverseSingleLinkedList();
        SingleLinkedListWrapper singleLinkedListWrapper = new SingleLinkedListWrapper();
        singleLinkedListWrapper.build(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});

        SingleLinkedList result = reverseSingleLinkedList.recursion(singleLinkedListWrapper.mNodeHead);
        assertEquals(10, result.data);
        assertEquals(9, result.next.data);
        assertEquals(8, result.next.next.data);
        assertEquals(7, result.next.next.next.data);
        assertEquals(6, result.next.next.next.next.data);
        assertEquals(5, result.next.next.next.next.next.data);
        assertEquals(4, result.next.next.next.next.next.next.data);
        assertEquals(3, result.next.next.next.next.next.next.next.data);
        assertEquals(2, result.next.next.next.next.next.next.next.next.data);
        assertEquals(1, result.next.next.next.next.next.next.next.next.next.data);
    }
}