package linkedlist;

import linkedlist.data.SingleLinkedList;
import linkedlist.wrapper.SingleLinkedListWrapper;
import org.junit.jupiter.api.Test;

class RemoveDuplicatesFromSortedListTest {
    @Test
    void test_merge_two_sorted_list() {
        RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList = new RemoveDuplicatesFromSortedList();

        SingleLinkedListWrapper list = new SingleLinkedListWrapper();
        list.build(new int[]{1,1,2,3,3});

        SingleLinkedList result = removeDuplicatesFromSortedList.remove(list.mNodeHead);

        result.print();
    }
}