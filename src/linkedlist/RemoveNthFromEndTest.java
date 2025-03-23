package linkedlist;

import linkedlist.data.SingleLinkedList;
import linkedlist.wrapper.SingleLinkedListWrapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveNthFromEndTest {

    @Test
    void testRemove() {
        SingleLinkedListWrapper singleLinkedListWrapper =  new SingleLinkedListWrapper();

        singleLinkedListWrapper.build(new int[]{1, 2, 3, 5});

        RemoveNthFromEnd removeNthFromEnd = new RemoveNthFromEnd();
        SingleLinkedList result = removeNthFromEnd.remove(singleLinkedListWrapper.mNodeHead, 2);

        assertEquals(1, result.data);
        assertEquals(2, result.next.data);
        assertEquals(3, result.next.next.data);
        assertEquals(5, result.next.next.next.data);
        assertNull(result.next.next.next.next);
    }
}