package linkedlist;

import linkedlist.data.KeyValue;
import linkedlist.data.SingleLinkedListWithKeyValue;

public class MyHashMap {
    public SingleLinkedListWithKeyValue mNodeHead;

    public MyHashMap() {

    }

    public void put(int key, int value) {
        if (get(key) != -1) {
            SingleLinkedListWithKeyValue current = mNodeHead;
            while (current != null) {
                if (current.data.key == key) {
                    current.data.value = value;
                    break;
                }
                current = current.next;
            }
        } else {
            if (mNodeHead != null && !mNodeHead.isEmpty()) {
                SingleLinkedListWithKeyValue newNode = new SingleLinkedListWithKeyValue(new KeyValue(key, value));

                SingleLinkedListWithKeyValue current = mNodeHead;
                while (current.next != null) {
                    current = current.next;
                }

                current.next = newNode;
            } else {
                mNodeHead = new SingleLinkedListWithKeyValue(new KeyValue(key, value));
            }
        }
    }

    public int get(int key) {
        SingleLinkedListWithKeyValue current = mNodeHead;
        while (current != null) {
            if (current.data.key == key) {
                return current.data.value;
            }
            current = current.next;
        }
        return -1;
    }

    public void remove(int key) {
        if (get(key) != -1) {
            SingleLinkedListWithKeyValue current = mNodeHead;
            SingleLinkedListWithKeyValue previous = null;
            while (current != null) {
                if (current.data.key == key) {
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
}
