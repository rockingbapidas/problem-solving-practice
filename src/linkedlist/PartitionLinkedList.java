package linkedlist;

import linkedlist.data.SingleLinkedList;

public class PartitionLinkedList {
    /**
     * Partition a linked list around a value x, such that all nodes less than x come before all nodes greater than or equal to x.
     * @param head of the linked list
     * @param x value to partition around
     * @return partitioned linked list
     * Solution: Create two linked lists, one for elements less than x and one for elements greater than or equal to x.
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public SingleLinkedList partition(SingleLinkedList head, int x) {
        SingleLinkedList beforeStart = null;
        SingleLinkedList beforeEnd = null;
        SingleLinkedList afterStart = null;
        SingleLinkedList afterEnd = null;

        while (head != null) {
            SingleLinkedList next = head.next;
            head.next = null;

            if (head.data < x) {
                if (beforeStart == null) {
                    beforeStart = head;
                    beforeEnd = beforeStart;
                } else {
                    beforeEnd.next = head;
                    beforeEnd = head;
                }
            } else {
                if (afterStart == null) {
                    afterStart = head;
                    afterEnd = afterStart;
                } else {
                    afterEnd.next = head;
                    afterEnd = head;
                }
            }

            head = next;
        }

        if (beforeStart == null) {
            return afterStart;
        }

        beforeEnd.next = afterStart;
        return beforeStart;
    }
}
