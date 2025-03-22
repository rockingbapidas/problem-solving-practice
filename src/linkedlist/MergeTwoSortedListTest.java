package linkedlist;

import linkedlist.data.SingleLinkedList;
import linkedlist.wrapper.SingleLinkedListWrapper;
import org.junit.jupiter.api.Test;

class MergeTwoSortedListTest {
    @Test
    void test_merge_two_sorted_list() {
        MergeTwoSortedList mergeTwoSortedList = new MergeTwoSortedList();

        SingleLinkedListWrapper list1 = new SingleLinkedListWrapper();
        list1.build(new int[]{1,2,4});

        SingleLinkedListWrapper list2 = new SingleLinkedListWrapper();
        list2.build(new int[]{1,3,4});

        SingleLinkedList result = mergeTwoSortedList.merge(list1.mNodeHead, list2.mNodeHead);

        result.print();
    }
}