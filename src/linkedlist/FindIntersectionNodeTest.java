package linkedlist;

import linkedlist.data.SingleLinkedList;
import linkedlist.wrapper.SingleLinkedListWrapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindIntersectionNodeTest {
    @Test
    void test_find_intersection_list() {
        FindIntersectionNode findIntersectionNode = new FindIntersectionNode();

        SingleLinkedListWrapper list1 = new SingleLinkedListWrapper();
        list1.build(new int[]{4,1,8,4,5});

        SingleLinkedListWrapper list2 = new SingleLinkedListWrapper();
        list2.build(new int[]{5,6,1});

        list2.addAtTail(list1.get(2));

        SingleLinkedList result = findIntersectionNode.getNode(list1.mNodeHead, list2.mNodeHead);

        assertEquals(8, result.data);
    }
}