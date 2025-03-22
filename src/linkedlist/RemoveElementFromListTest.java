package linkedlist;

import linkedlist.data.SingleLinkedList;
import linkedlist.wrapper.SingleLinkedListWrapper;
import org.junit.jupiter.api.Test;

class RemoveElementFromListTest {
    @Test
    void test_remove_elements_from_the_list() {
        RemoveElementFromList removeElementFromList = new RemoveElementFromList();

        SingleLinkedListWrapper list = new SingleLinkedListWrapper();
        list.build(new int[]{1, 2, 6, 3, 4, 5, 6});

        SingleLinkedList result = removeElementFromList.remove(list.mNodeHead, 6);

        result.print();
    }
}