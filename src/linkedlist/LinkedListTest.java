package linkedlist;

import org.junit.jupiter.api.Test;

class LinkedListTest {
    @Test
    void test_single_linked_list() {
        LinkedList linkedList = new LinkedList();

        linkedList.build(new int[]{1,2,3,4,5,6});
    }
}