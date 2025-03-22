package linkedlist;

import linkedlist.wrapper.SingleLinkedListWrapper;
import org.junit.jupiter.api.Test;

class SingleLinkedListTest {

    @Test
    void test_single_linked_list() {
        SingleLinkedListWrapper linkedList = new SingleLinkedListWrapper();

        linkedList.build(new int[]{1,2,3,4,5,6});

        linkedList.mNodeHead.print();

        System.out.println("==========Add at head==========");

        linkedList.addAtHead(0);

        linkedList.mNodeHead.print();

        System.out.println("=========Delete at head=========");

        linkedList.deleteAtHead();

        linkedList.mNodeHead.print();

        System.out.println("==============Add at tail=============");

        linkedList.addAtTail(7);

        linkedList.mNodeHead.print();

        System.out.println("==============Delete at tail==========");

        linkedList.deleteAtTail();

        linkedList.mNodeHead.print();

        System.out.println("==========Add at index=========");

        linkedList.addAtIndex(2, 10);

        linkedList.mNodeHead.print();

        System.out.println("Delete at index");

        linkedList.deleteAtIndex(2);

        linkedList.mNodeHead.print();
    }
}