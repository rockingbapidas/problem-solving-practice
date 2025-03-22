package linkedlist;

import linkedlist.data.SingleLinkedList;
import linkedlist.wrapper.SingleLinkedListWrapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HasCycleTest {
    @Test
    void test_linked_list_has_cycle() {
        HasCycle hasCycle = new HasCycle();

        SingleLinkedListWrapper list = new SingleLinkedListWrapper();
        list.build(new int[]{3,2,0,-4});
        SingleLinkedList posList = list.get(1);
        list.addAtTail(posList);

        boolean result = hasCycle.hasCycle(list.mNodeHead);

        Assertions.assertTrue(result);
    }

    @Test
    void test_linked_list_has_no_cycle() {
        HasCycle hasCycle = new HasCycle();

        SingleLinkedListWrapper list = new SingleLinkedListWrapper();
        list.build(new int[]{3,2,0,-4});

        boolean result = hasCycle.hasCycle(list.mNodeHead);

        Assertions.assertFalse(result);
    }
}