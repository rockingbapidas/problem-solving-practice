package linkedlist;

import linkedlist.data.SingleLinkedList;

public class RemoveNthFromEnd {
    public SingleLinkedList remove(SingleLinkedList head, int n) {
        if (head == null || head.next == null)
            return null;

        int length = 0;
        int index = 0;
        SingleLinkedList headA = head;
        SingleLinkedList headB = head;

        while (headA != null) {
            length++;
            headA = headA.next;
        }

        index = length - n;

        if (index == 0) {
            head = head.next;
            return head;
        }

        int count = 0;
        while (headB != null) {
            count++;
            if (index == count)
                break;
            headB = headB.next;
        }

        if (headB != null) {
            if (index == length) {
                headB.next = null;
            } else {
                headB.next = headB.next.next;
            }
        }

        return head;
    }
}
