package linkedlist;

import org.junit.jupiter.api.Test;

class DoublyLinkedListTest {
    @Test
    void test_double_linked_list() {
        DoublyLinkedList linkedList = new DoublyLinkedList();

        linkedList.build(new int[]{1,2,3,4,5,6});
    }
}