package linkedlist;

import linkedlist.data.SingleLinkedList;

public class RemoveElementFromList {

    /**
     * Remove all elements from a linked list of integers that have value val.
     *
     * @param head The head of the linked list.
     * @param val The value to remove from the linked list.
     * @return The head of the linked list after removing all occurrences of val.
     */
    public SingleLinkedList remove(SingleLinkedList head, int val) {
        if (head == null)
            return null;
        // Create a sudo head to handle the case when the first element is the element to be removed.
        SingleLinkedList last = new SingleLinkedList(69);
        // Point the next of sudo head to the head of the linked list.
        last.next = head;
        // Point the head to the sudo head.
        SingleLinkedList sudoHead = last;
        // Traverse the linked list.
        while (head != null) {
            // If the current element is the element to be removed, point the next of the last element to the next of the current element.
            if (head.data == val) {
                last.next = head.next;
            } else {
                last = last.next;
            }
            // Move the head to the next element.
            head = head.next;
        }
        return sudoHead.next;
    }
}
