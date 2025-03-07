package linkedlist;

import linkedlist.data.DoubleLinkedList;

public class ReverseDoubleLinkedList {
    public static DoubleLinkedList reverse(DoubleLinkedList head) {
        DoubleLinkedList previous = null;
        DoubleLinkedList current = head;
        while (current != null) {
            DoubleLinkedList temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        return previous;
    }
}
