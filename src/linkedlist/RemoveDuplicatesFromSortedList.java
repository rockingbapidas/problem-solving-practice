package linkedlist;

import linkedlist.data.SingleLinkedList;

public class RemoveDuplicatesFromSortedList {

    /**
     * Given a sorted linked list, delete all duplicates such that each element appear only once.
     * @param head SingleLinkedList
     * @return SingleLinkedList
     */
    public SingleLinkedList remove(SingleLinkedList head) {
        if (head == null || head.next == null) {
            return head;
        }
        if (head.data == head.next.data) {
            head.next = head.next.next;
            remove(head);
        } else {
            remove(head.next);
        }
        return head;
    }
}
