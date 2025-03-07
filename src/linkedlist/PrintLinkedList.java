package linkedlist;

import linkedlist.data.DoubleLinkedList;
import linkedlist.data.DoubleLinkedListWithChild;
import linkedlist.data.SingleLinkedList;

public class PrintLinkedList {
    public void printRandomLinkedList(DoubleLinkedListWithChild node, String sep) {
        System.out.println();
        while (node != null) {
            System.out.print(node.value);
            if (node.child != null) {
                System.out.print(sep + node.child.value);
            }
            node = node.next;
            if (node != null) {
                System.out.print(sep);
            }
        }
    }

    public void printDoubleLinkedList(DoubleLinkedList node, String sep) {
        System.out.println();
        while (node != null) {
            System.out.print(node.data);
            node = node.next;
            if (node != null) {
                System.out.print(sep);
            }
        }
    }

    public void printSingleLinkedList(SingleLinkedList node, String sep) {
        System.out.println();
        while (node != null) {
            System.out.print(String.valueOf(node.data));
            node = node.next;
            if (node != null) {
                System.out.print(sep);
            }
        }
    }

    public void printDoubleChildLinkedList(DoubleLinkedListWithChild node, String sep) {
        System.out.println();
        while (node != null) {
            System.out.print(node.value);
            if (node.child != null) {
                while (node.child != null) {
                    System.out.print(sep + String.valueOf(node.child.value));
                    node.child = node.child.next;
                    if (node.child != null) {
                        System.out.print(sep);
                    }
                }
            }
            node = node.next;
            if (node != null) {
                System.out.print(sep);
            }
        }
    }
}
