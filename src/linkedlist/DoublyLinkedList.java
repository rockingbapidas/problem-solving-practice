package linkedlist;

import linkedlist.data.DoubleLinkedList;
import linkedlist.wrapper.DoubleLinkedListWrapper;

public class DoublyLinkedList {
    public void build(int[] arr) {
        DoubleLinkedListWrapper doubleLinkedListWrapper = new DoubleLinkedListWrapper();

        int N = arr.length;

        while (N-- > 0) {
            int ele = arr[N];
            doubleLinkedListWrapper.addAtHead(ele);
        }

        printNode(doubleLinkedListWrapper.mNodeHead);
    }

    public void printNode(DoubleLinkedList node) {
        while (node != null) {
            if (node.prev != null && node.next != null) {
                System.out.println("[" + "Prev " + node.prev.data + " " + "Current " + node.data + " " + "Next " + node.next.data + "] ");
            } else if (node.prev != null)  {
                System.out.println("[" + "Prev " + node.prev.data + " " + "Current " + node.data + "] ");
            } else if (node.next != null) {
                System.out.println("[" + "Current " + node.data + " " + "Next " + node.next.data + "] ");
            } else {
                System.out.println("[" + "Current " + node.data + "] ");
            }
            node = node.next;
        }
    }
}
