package linkedlist.wrapper;

import linkedlist.data.SingleLinkedList;

public class SingleLinkedListWrapper implements LinkedListWrapper<SingleLinkedList> {
    public SingleLinkedList mNodeHead;

    /**
     * Get the value of the index-th node in the linked list. If the index is
     * invalid, return -1.
     */
    @Override
    public SingleLinkedList get(int index) {
        if (!isEmpty()) {
            int i = 0;
            SingleLinkedList current = mNodeHead;
            while (current != null) {
                if (index == i)
                    return current;
                current = current.next;
                i++;
            }
        }
        return null;
    }

    /**
     * Add a node of value val before the first element of the linked list. After
     * the insertion, the new node will be the first node of the linked list.
     */
    @Override
    public void addAtHead(int val) {
        if (!isEmpty()) {
            SingleLinkedList next = mNodeHead;
            mNodeHead = new SingleLinkedList(val, next);
        } else {
            mNodeHead = new SingleLinkedList(val);
        }
    }

    @Override
    public void deleteAtHead() {

    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    @Override
    public void addAtTail(int val) {
        if (!isEmpty()) {
            SingleLinkedList newNode = new SingleLinkedList(val);

            SingleLinkedList current = mNodeHead;
            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        } else {
            mNodeHead = new SingleLinkedList(val);
        }
    }

    @Override
    public void deleteAtTail() {
        if (!isEmpty()) {
            SingleLinkedList current = mNodeHead;
            while (current.next != null) {
                current = current.next;
            }

            current = null;
            mNodeHead = current;
        }
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index
     * equals to the length of linked list, the node will be appended to the end of
     * linked list. If index is greater than the length, the node will not be
     * inserted.
     */
    public void addAtIndex(int index, int val) {
        if (!isEmpty()) {
            int size = length();
            if (index > size)
                return;

            if (index == size) {
                addAtTail(val);
                return;
            }

            if (index == 0) {
                addAtHead(val);
                return;
            }

            int i = 0;
            SingleLinkedList current = mNodeHead;
            SingleLinkedList last = mNodeHead;
            while (i != index) {
                current = last;
                last = current.next;
                i++;
            }
            current.next = new SingleLinkedList(val, last);
        } else {
            mNodeHead = new SingleLinkedList(val);
        }
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    @Override
    public void deleteAtIndex(int index) {
        int size = length() - 1;
        if (isEmpty() || index > size)
            return;

        if (index == 0 && size == 0) {
            mNodeHead = null;
            return;
        }

        if (index == 0) {
            mNodeHead = mNodeHead.next;
            return;
        }

        int i = 0;
        SingleLinkedList current = mNodeHead;
        while (current != null) {
            i++;
            if (index == i)
                break;
            current = current.next;
        }
        if (current != null) {
            if (index == size) {
                current.next = null;
            } else {
                current.next = current.next.next;
            }
        }
    }

    @Override
    public boolean isEmpty() {
        return length() == 0;
    }

    @Override
    public int length() {
        if (mNodeHead != null) {
            int i = 0;
            SingleLinkedList current = mNodeHead;
            while (current != null) {
                current = current.next;
                i++;
            }
            return i;
        }
        return 0;
    }
}
