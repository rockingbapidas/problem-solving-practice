package linkedlist;

import linkedlist.data.SingleLinkedList;

public class RemoveNthFromEnd {

    /**
     * Remove the nth node from the end of the list and return its head.
     *
     * @param head the head of the linked list
     * @param n the nth node from the end of the list
     * @return the head of the linked list
     * Solution: Two pointers
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public SingleLinkedList remove(SingleLinkedList head, int n) {
        if (head == null || head.next == null)
            return null;

        int length = head.length();
        int index = length - n;

        if (index == 0) {
            head = head.next;
            return head;
        }

        SingleLinkedList current = head;
        int count = 0;
        while (current != null) {
            count++;
            if (index == count)
                break;
            current = current.next;
        }

        if (current != null) {
            if (index == length) {
                current.next = null;
            } else {
                current.next = current.next.next;
            }
        }

        return head;
    }
}
