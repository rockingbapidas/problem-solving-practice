package linkedlist;

import linkedlist.data.SingleLinkedList;

public class OddEvenLinkedList {
    public SingleLinkedList oddEvenList(SingleLinkedList head) {
        if (head == null)
            return null;
        SingleLinkedList odd = head, even = head.next, evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
