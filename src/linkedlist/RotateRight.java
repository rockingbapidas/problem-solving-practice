package linkedlist;

import linkedlist.data.SingleLinkedList;

public class RotateRight {
    public SingleLinkedList rotate(SingleLinkedList head, int k) {
        if (head == null) return null;

        SingleLinkedList dummy = new SingleLinkedList(0);
        dummy.next = head;

        //getting length
        int length = 1;
        while (head.next != null) {
            head = head.next;
            length++;
        }

        head.next = dummy.next;
        dummy = head;

        while ((k % length) != 0) {
            k++;
            dummy = dummy.next;
        }

        head = dummy.next;
        dummy.next = null;
        return head;
    }
}
