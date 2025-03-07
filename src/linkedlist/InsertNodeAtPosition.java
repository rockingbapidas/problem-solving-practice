package linkedlist;

import linkedlist.data.SingleLinkedList;

public class InsertNodeAtPosition {
    public SingleLinkedList insertNodeAtPosition(SingleLinkedList head, int data, int position) {
        if (!isEmptySinglyLinkedList(head)) {
            int size = lengthSinglyLinkedList(head);
            SingleLinkedList newNode = new SingleLinkedList(data);

            if (position > size)
                return null;

            if (position == size) {
                SingleLinkedList current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
                return head;
            }

            if (position == 0) {
                newNode.next = head;
                head = newNode;
                return head;
            }

            int i = 0;
            SingleLinkedList current = head;
            SingleLinkedList last = head;
            while (i != position) {
                current = last;
                last = current.next;
                i++;
            }
            newNode.next = last;
            current.next = newNode;
        } else {
            head = new SingleLinkedList(data);
        }
        return head;
    }

    private boolean isEmptySinglyLinkedList(SingleLinkedList head) {
        return lengthSinglyLinkedList(head) == 0;
    }

    private int lengthSinglyLinkedList(SingleLinkedList head) {
        if (head != null) {
            int i = 0;
            SingleLinkedList current = head;
            while (current != null) {
                current = current.next;
                i++;
            }
            return i;
        }
        return 0;
    }
}
