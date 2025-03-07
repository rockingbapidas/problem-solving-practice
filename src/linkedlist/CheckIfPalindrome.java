package linkedlist;

import linkedlist.data.SingleLinkedList;

public class CheckIfPalindrome {
    public boolean isPalindrome(SingleLinkedList head) {
        SingleLinkedList current = head;
        int size = 0;
        while (current != null) {
            size++;
            current = current.next;
        }

        // find the middle node
        int count = 1;
        current = head;
        while (count < size / 2 && current != null) {
            count++;
            current = current.next;
        }

        // reverse right node
        SingleLinkedList rightNode = current;
        SingleLinkedList prev = null;
        SingleLinkedList curr = rightNode;
        while (curr != null) {
            SingleLinkedList nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }

        // compare left node with right node
        SingleLinkedList headRight = prev;
        SingleLinkedList headLeft = head;
        while (headLeft != null && headRight != null) {
            if (!(headLeft.data == headRight.data)) {
                return false;
            } else {
                headLeft = headLeft.next;
                headRight = headRight.next;
            }
        }

        return true;
    }
}
