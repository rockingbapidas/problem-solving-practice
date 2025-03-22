package linkedlist;

import linkedlist.data.SingleLinkedList;

public class CheckIfPalindrome {

    /**
     * Check if a linked list is a palindrome.
     *
     * @param head The head of the linked list.
     * @return True if the linked list is a palindrome, false otherwise.
     */
    public boolean isPalindrome(SingleLinkedList head) {
        SingleLinkedList current = head;
        int size = current.length();

        // find the middle node
        int count = 1;
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
