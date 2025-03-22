package linkedlist;

import linkedlist.data.SingleLinkedList;

public class HasCycle {
    /**
     * Given a linked list, determine if it has a cycle in it.
     * To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where the tail connects to.
     * If pos is -1, then there is no cycle in the linked list.
     * @param head SingleLinkedList
     * @return boolean
     */
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
}
