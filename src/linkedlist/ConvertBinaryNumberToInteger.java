package linkedlist;

import linkedlist.data.SingleLinkedList;

public class ConvertBinaryNumberToInteger {

    public int getDecimalValue(SingleLinkedList head) {
        int result = 0;
        while (head != null) {
            result = result * 2 + head.data;
            head = head.next;
        }
        return result;
    }
}
