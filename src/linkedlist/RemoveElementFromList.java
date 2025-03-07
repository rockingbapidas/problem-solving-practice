package linkedlist;

import linkedlist.data.SingleLinkedList;

public class RemoveElementFromList {
    public SingleLinkedList remove(SingleLinkedList head, int val) {
        if (head == null)
            return null;
        SingleLinkedList last = new SingleLinkedList(69);
        last.next = head;
        SingleLinkedList sudoHead = last;
        while (head != null) {
            if (head.data == val) {
                last.next = head.next;
            } else {
                last = last.next;
            }
            head = head.next;
        }
        return sudoHead.next;
    }
}
