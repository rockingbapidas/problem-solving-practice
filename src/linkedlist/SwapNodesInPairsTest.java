package linkedlist;

import linkedlist.data.SingleLinkedList;
import linkedlist.wrapper.SingleLinkedListWrapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapNodesInPairsTest {
    @Test
    void testSwapPairs() {
        SingleLinkedListWrapper list = new SingleLinkedListWrapper();
        list.build(new int[]{1, 2, 3, 4});

        SingleLinkedListWrapper expected = new SingleLinkedListWrapper();
        expected.build(new int[]{2, 1, 4, 3});

        SwapNodesInPairs swapNodesInPairs = new SwapNodesInPairs();
        SingleLinkedList actual = swapNodesInPairs.swapPairs(list.mNodeHead);

        assertEquals(expected.mNodeHead.toString(), actual.toString());
    }
}