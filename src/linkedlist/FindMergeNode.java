package linkedlist;

import linkedlist.data.SingleLinkedList;

public class FindMergeNode {
    public int findMergeNode(SingleLinkedList head1, SingleLinkedList head2) {
        if (head1 == null || head2 == null)
            return -1;

        int firstNodeLength = 0;
        SingleLinkedList firstNode = head1;
        while (firstNode != null) {
            firstNodeLength++;
            firstNode = firstNode.next;
        }

        int secondNodeLength = 0;
        SingleLinkedList secondNode = head2;
        while (secondNode != null) {
            secondNodeLength++;
            secondNode = secondNode.next;
        }

        SingleLinkedList first = head1;
        SingleLinkedList second = head2;

        if (firstNodeLength > secondNodeLength) {
            int diff = firstNodeLength - secondNodeLength;
            for (int i = 0; i < diff; i++) {
                first = first.next;
            }
        } else {
            int diff = secondNodeLength - firstNodeLength;
            for (int i = 0; i < diff; i++) {
                second = second.next;
            }
        }

        while (first != second) {
            first = first.next;
            second = second.next;
        }

        return first.data;
    }
}
