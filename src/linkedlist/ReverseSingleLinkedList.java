package linkedlist;

import linkedlist.data.SingleLinkedList;

public class ReverseSingleLinkedList {

    /**
     * Reverse a singly linked list.
     *
     * @param head The head of the linked list.
     * @return The head of the reversed linked list.
     */
    public SingleLinkedList iteration(SingleLinkedList head) {
        SingleLinkedList previous = null;
        SingleLinkedList current = head;
        while (current != null) {
            SingleLinkedList temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        return previous;
    }

    /**
     * Reverse a singly linked list.
     *
     * @param head The head of the linked list.
     * @return The head of the reversed linked list.
     */
    public SingleLinkedList recursion(SingleLinkedList head) {
        if (head == null || head.next == null)
            return head;
        SingleLinkedList p = recursion(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}
