package linkedlist;

import linkedlist.data.DoubleLinkedListWithChild;

public class CopyRandomList {
    public DoubleLinkedListWithChild copy(DoubleLinkedListWithChild head) {
        if (head == null)
            return null;

        DoubleLinkedListWithChild node = head;
        DoubleLinkedListWithChild newHead = new DoubleLinkedListWithChild(0);
        DoubleLinkedListWithChild newNode = newHead;

        while (node != null) {
            newNode.value = node.value;
            newNode.next = node.next;
            node.next = newNode;
            node = newNode.next;
            if (node != null) {
                newNode = new DoubleLinkedListWithChild(0);
            }
        }

        node = head;
        newNode = newHead;
        while (node != null) {
            if (node.child != null) {
                node.next.child = node.child.next;
            }
            node = node.next.next;
        }

        node = head;
        while (node != null) {
            node.next = newNode.next;
            if (newNode.next != null) {
                newNode.next = newNode.next.next;
            }
            node = node.next;
            newNode = newNode.next;
        }

        return newHead;
    }
}
