package linkedlist;

import linkedlist.data.SingleLinkedList;
import linkedlist.wrapper.SingleLinkedListWrapper;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesFromSortedListIITest {
    @Test
    void test_remove_duplicate_from_sorted_list_II() {
        SingleLinkedListWrapper singleLinkedListWrapper = new SingleLinkedListWrapper();
        RemoveDuplicatesFromSortedListII removeDuplicatesFromSortedListII = new RemoveDuplicatesFromSortedListII();

        SingleLinkedList head = singleLinkedListWrapper.build(new int[]{1, 2, 3, 3, 4, 4, 5});
        SingleLinkedList result = removeDuplicatesFromSortedListII.deleteDuplicates(head);
        assertEquals(Arrays.toString(result.toArray()), Arrays.toString(new int[]{1, 2, 5}));

        head = singleLinkedListWrapper.build(new int[]{1, 1, 1, 2, 3});
        result = removeDuplicatesFromSortedListII.deleteDuplicates(head);
        assertEquals(Arrays.toString(result.toArray()), Arrays.toString(new int[]{2, 3}));

        head = singleLinkedListWrapper.build(new int[]{1, 1, 1, 2, 3, 3});
        result = removeDuplicatesFromSortedListII.deleteDuplicates(head);
        assertEquals(Arrays.toString(result.toArray()), Arrays.toString(new int[]{2}));

        head = singleLinkedListWrapper.build(new int[]{1, 1, 1, 2, 3, 3, 4, 4, 5});
        result = removeDuplicatesFromSortedListII.deleteDuplicates(head);
        assertEquals(Arrays.toString(result.toArray()), Arrays.toString(new int[]{2, 5}));

        head = singleLinkedListWrapper.build(new int[]{1, 1, 1, 2, 3, 3, 4, 4, 5, 5});
        result = removeDuplicatesFromSortedListII.deleteDuplicates(head);
        assertEquals(Arrays.toString(result.toArray()), Arrays.toString(new int[]{2}));

        head = singleLinkedListWrapper.build(new int[]{1, 1, 1, 2, 3, 3, 4, 4, 5, 5, 5});
        result = removeDuplicatesFromSortedListII.deleteDuplicates(head);
        assertEquals(Arrays.toString(result.toArray()), Arrays.toString(new int[]{2}));

        head = singleLinkedListWrapper.build(new int[]{1, 1, 1, 2, 3, 3, 4, 4, 5, 5, 5, 5});
        result = removeDuplicatesFromSortedListII.deleteDuplicates(head);
        assertEquals(Arrays.toString(result.toArray()), Arrays.toString(new int[]{2}));

        head = singleLinkedListWrapper.build(new int[]{1, 1, 1, 2, 3, 3, 4, 4, 5, 5, 5, 5, 5});
        result = removeDuplicatesFromSortedListII.deleteDuplicates(head);
        assertEquals(Arrays.toString(result.toArray()), Arrays.toString(new int[]{2}));
    }
}