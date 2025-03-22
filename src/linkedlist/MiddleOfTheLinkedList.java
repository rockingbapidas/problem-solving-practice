package linkedlist;

import linkedlist.data.SingleLinkedList;

public class MiddleOfTheLinkedList {

    /**
     * Given a non-empty, singly linked list with head node head, return a middle node of linked list.
     * If there are two middle nodes, return the second middle node.
     *
     * @param head
     * @return SingleLinkedList
     */
    public SingleLinkedList middleNode(SingleLinkedList head) {
        SingleLinkedList slow = head;
        SingleLinkedList fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
