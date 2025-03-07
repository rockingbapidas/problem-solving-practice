package linkedlist;

import linkedlist.data.SingleLinkedList;

public class MergeTwoList {
    public SingleLinkedList merge(SingleLinkedList l1, SingleLinkedList l2) {
        if (l1 == null && l2 == null)
            return null;

        SingleLinkedList dummy = new SingleLinkedList(0);
        SingleLinkedList tail = dummy;

        while (true) {
            // l1 node reaches to its end assign tail next to l2 and return
            if (l1 == null) {
                tail.next = l2;
                break;
            }

            // l2 node reaches to its end assign tail next to l1 and return
            if (l2 == null) {
                tail.next = l1;
                break;
            }

            // check and compare l1 and l2 values for sort and merge
            if (l1.data <= l2.data) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }

            // advance the tail node
            tail = tail.next;
        }

        return dummy.next;
    }
}
