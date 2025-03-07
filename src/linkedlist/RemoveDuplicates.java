package linkedlist;

import linkedlist.data.SingleLinkedList;

public class RemoveDuplicates {

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
