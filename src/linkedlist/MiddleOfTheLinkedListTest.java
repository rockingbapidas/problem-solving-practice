package linkedlist;

import linkedlist.data.SingleLinkedList;
import linkedlist.wrapper.SingleLinkedListWrapper;
import org.junit.jupiter.api.Test;

class MiddleOfTheLinkedListTest {
    @Test
    void test_find_middle_of_the_node() {
        MiddleOfTheLinkedList middleOfTheLinkedList = new MiddleOfTheLinkedList();
        SingleLinkedListWrapper singleLinkedListWrapper = new SingleLinkedListWrapper();
        singleLinkedListWrapper.build(new int[]{1, 2, 3, 4, 5});

        SingleLinkedList middleNode = middleOfTheLinkedList.middleNode(singleLinkedListWrapper.mNodeHead);

        middleNode.print();
    }
}