package linkedlist;

import linkedlist.data.DoubleLinkedListWithChild;

public class FlattenList {
    public DoubleLinkedListWithChild flatten(DoubleLinkedListWithChild head) {
        if (head == null)
            return null;

        DoubleLinkedListWithChild current = head;
        DoubleLinkedListWithChild tail;
        while (current != null) {
            if (current.child != null) {
                tail = current.child;

                while (tail.next != null)
                    tail = tail.next;

                tail.next = current.next;

                if (current.next != null)
                    current.next.prev = tail;

                current.next = current.child;
                current.child.prev = current;
                current.child = null;
            }
            current = current.next;
        }
        return head;
    }
}
