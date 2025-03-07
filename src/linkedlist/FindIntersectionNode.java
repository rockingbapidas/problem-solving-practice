package linkedlist;

import linkedlist.data.SingleLinkedList;

public class FindIntersectionNode {
    public SingleLinkedList getNode(SingleLinkedList headA, SingleLinkedList headB) {
        if (headA == null || headB == null)
            return null;

        SingleLinkedList firstNode = headA;
        SingleLinkedList secondNode = headB;

        int firstListLength = 0;
        int secondListLength = 0;

        while (firstNode != null) {
            firstListLength++;
            firstNode = firstNode.next;
        }

        while (secondNode != null) {
            secondListLength++;
            secondNode = secondNode.next;
        }

        firstNode = headA;
        secondNode = headB;

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
