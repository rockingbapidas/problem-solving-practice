package linkedlist.wrapper;

import linkedlist.data.DoubleLinkedList;

public class DoubleLinkedListWrapper implements LinkedListWrapper<DoubleLinkedList> {
    public DoubleLinkedList mNodeHead;

    /**
     * Get the value of the index-th node in the linked list. If the index is
     * invalid, return -1.
     */
    @Override
    public DoubleLinkedList get(int index) {
        if (!isEmpty()) {
            int i = 0;
            DoubleLinkedList current = mNodeHead;
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
            DoubleLinkedList newNode = new DoubleLinkedList(val);
            newNode.next = mNodeHead;

            mNodeHead.prev = newNode;
            mNodeHead = newNode;
        } else {
            mNodeHead = new DoubleLinkedList(val);
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
            DoubleLinkedList newNode = new DoubleLinkedList(val);

            DoubleLinkedList current = mNodeHead;
            while (current.next != null) {
                current = current.next;
            }

            newNode.prev = current;
            current.next = newNode;
        } else {
            mNodeHead = new DoubleLinkedList(val);
        }
    }

    @Override
    public void deleteAtTail() {

    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index
     * equals to the length of linked list, the node will be appended to the end of
     * linked list. If index is greater than the length, the node will not be
     * inserted.
     */
    @Override
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
            DoubleLinkedList current = mNodeHead;
            DoubleLinkedList last = mNodeHead;
            while (i != index) {
                current = last;
                last = current.next;
                i++;
            }
            DoubleLinkedList newNode = new DoubleLinkedList(val, current, last);
            current.next = newNode;
            last.prev = newNode;
        } else {
            mNodeHead = new DoubleLinkedList(val);
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
            mNodeHead.prev = null;
            return;
        }

        int i = 0;
        DoubleLinkedList current = mNodeHead;
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
                current.next.next.prev = current;
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
            DoubleLinkedList current = mNodeHead;
            while (current != null) {
                current = current.next;
                i++;
            }
            return i;
        }
        return 0;
    }
}
