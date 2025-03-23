package linkedlist;

import linkedlist.data.SingleLinkedList;

public class RemoveDuplicatesFromSortedListII {

    /**
     * Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.
     * @param head SingleLinkedList
     * @return SingleLinkedList
     *
     * Solution:
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public SingleLinkedList deleteDuplicates(SingleLinkedList head) {
        SingleLinkedList dummy = new SingleLinkedList(0);
        dummy.next = head;
        SingleLinkedList current = dummy;

        while (current.next != null && current.next.next != null) {
            if (current.next.data == current.next.next.data) {
                int duplicateValue = current.next.data;
                while (current.next != null && current.next.data == duplicateValue) {
                    current.next = current.next.next;
                }
            } else {
                current = current.next;
            }
        }

        return dummy.next;
    }
}
