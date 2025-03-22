package linkedlist;

import linkedlist.data.SingleLinkedList;

public class FindIntersectionNode {
    /**
     * Find the intersection node of two linked lists
     * @param headA head of the first linked list
     * @param headB head of the second linked list
     * @return the intersection node
     */
    public SingleLinkedList getNode(SingleLinkedList headA, SingleLinkedList headB) {
        if (headA == null || headB == null)
            return null;

        SingleLinkedList firstNode = headA;
        SingleLinkedList secondNode = headB;

        int firstListLength = firstNode.length();
        int secondListLength = secondNode.length();

        if (firstListLength > secondListLength) {
            int diff = firstListLength - secondListLength;
            for (int i = 0; i < diff; i++) {
                firstNode = firstNode.next;
            }
        } else {
            int diff = secondListLength - firstListLength;
            for (int i = 0; i < diff; i++) {
                secondNode = secondNode.next;
            }
        }

        while (firstNode != secondNode) {
            firstNode = firstNode.next;
            secondNode = secondNode.next;
        }

        return firstNode;
    }
}
