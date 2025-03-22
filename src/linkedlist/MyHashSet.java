package linkedlist;

import linkedlist.data.SingleLinkedList;

public class MyHashSet {
    public SingleLinkedList mNodeHead;

    public MyHashSet() {

    }

    public void add(int key) {
        if (contains(key)) return;

        if (mNodeHead != null && !mNodeHead.isEmpty()) {
            SingleLinkedList newNode = new SingleLinkedList(key);

            SingleLinkedList current = mNodeHead;
            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        } else {
            mNodeHead = new SingleLinkedList(key);
        }
    }

    public void remove(int key) {
        if (contains(key)) {
            SingleLinkedList current = mNodeHead;
            SingleLinkedList previous = null;
            while (current != null) {
                if (current.data == key) {
                    if (previous != null) {
                        previous.next = current.next;
                    } else {
                        mNodeHead = current.next;
                    }
                    break;
                }
                previous = current;
                current = current.next;
            }
        }
    }

    public boolean contains(int key) {
        SingleLinkedList current = mNodeHead;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
