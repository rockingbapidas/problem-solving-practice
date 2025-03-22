package linkedlist;

import linkedlist.data.SingleLinkedList;

public class AddTwoNumbers {

    public SingleLinkedList add(SingleLinkedList l1, SingleLinkedList l2) {
        SingleLinkedList dummy = new SingleLinkedList(0);
        SingleLinkedList current = dummy;
        int carry = 0;
        SingleLinkedList p = l1;
        SingleLinkedList q = l2;

        while (p != null || q != null) {
            int x = p == null ? 0 : p.data;
            int y = q == null ? 0 : q.data;
            int sum = x + y + carry;
            carry = sum / 10;

            current.next = new SingleLinkedList(sum % 10);
            current = current.next;
            if (p != null)
                p = p.next;
            if (q != null)
                q = q.next;
        }

        if (carry > 0) {
            current.next = new SingleLinkedList(carry);
        }

        return dummy.next;
    }
}
