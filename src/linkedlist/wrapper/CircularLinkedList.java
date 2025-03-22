package linkedlist.wrapper;

import linkedlist.data.SingleLinkedList;

public class CircularLinkedList {
    public void build(int[] arr) {
        SingleLinkedListWrapper singleLinkedListWrapper = new SingleLinkedListWrapper();

        int N = arr.length;

        while (N-- > 0) {
            int ele = arr[N];
            singleLinkedListWrapper.addAtHead(ele);
        }

        display(singleLinkedListWrapper.mNodeHead);
    }

    private void display(SingleLinkedList head) {
        SingleLinkedList start = head;
        while (start != null) {
            if (start.next != null) {
                System.out.println("[Current " + start.data + " " + "Next " + start.next.data + "]");
            } else {
                System.out.print("[Current " + start.data + "]");
            }
            start = start.next;
        }
    }
}
