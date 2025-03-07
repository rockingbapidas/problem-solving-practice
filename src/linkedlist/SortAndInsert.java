package linkedlist;

import linkedlist.data.DoubleLinkedList;

public class SortAndInsert {
    public DoubleLinkedList sortedInsert(DoubleLinkedList head, int data) {
        if (!isEmptyDoublyLinkedList(head)) {
            DoubleLinkedList newNode = new DoubleLinkedList(data);

            DoubleLinkedList current = head;

            int i = 0;
            while (current.data < data) {
                i++;
                if (current.next == null) {
                    newNode.prev = current;
                    current.next = newNode;
                    return head;
                }
                current = current.next;
            }

            if (i == 0) {
                head.prev = newNode;
                newNode.next = head;
                head = newNode;
                return head;
            }

            DoubleLinkedList previous = current.prev;
            DoubleLinkedList last = current;

            last.prev = newNode;
            newNode.next = last;

            newNode.prev = previous;
            previous.next = newNode;
        } else {
            head = new DoubleLinkedList(data);
        }
        return head;
    }

    private boolean isEmptyDoublyLinkedList(DoubleLinkedList head) {
        return lengthDoublyLinkedList(head) == 0;
    }

    public int lengthDoublyLinkedList(DoubleLinkedList head) {
        if (head != null) {
            int i = 0;
            DoubleLinkedList current = head;
            while (current != null) {
                current = current.next;
                i++;
            }
            return i;
        }
        return 0;
    }
}
