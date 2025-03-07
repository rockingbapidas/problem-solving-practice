package linkedlist;

import linkedlist.data.SingleLinkedList;

public class HasCycle {
    public boolean hasCycle(SingleLinkedList head) {
        if (head == null || head.next == null)
            return false;

        SingleLinkedList slowPointer = head;
        SingleLinkedList fastPointer = head.next;

        while (slowPointer != fastPointer) {
            if (fastPointer == null || fastPointer.next == null)
                return false;

            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return true;
    }

    public SingleLinkedList detect(SingleLinkedList head) {
        if (head == null || head.next == null)
            return null;

        SingleLinkedList slowPointer = head.next;
        SingleLinkedList fastPointer = head.next.next;

        while (slowPointer != fastPointer) {
            if (slowPointer == null || fastPointer == null)
                return null;

            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;

            if (fastPointer != null) {
                fastPointer = fastPointer.next;
            } else {
                return null;
            }
        }

        fastPointer = head;
        while (slowPointer != fastPointer) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;
        }

        return slowPointer;
    }
}
