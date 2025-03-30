package stack;

import linkedlist.wrapper.SingleLinkedListWrapper;

public class StackWithLinkedList implements CustomStack<Integer> {
    private SingleLinkedListWrapper list;

    @Override
    public void push(Integer value) {
        if (list == null) {
            list = new SingleLinkedListWrapper();
            list.addAtHead(value);
        } else {
            list.addAtHead(value);
        }
    }

    @Override
    public Integer pop() {
        if (list.mNodeHead == null) {
            return -1;
        }
        int value = list.mNodeHead.data;
        list.deleteAtHead();
        return value;
    }

    @Override
    public Integer top() {
        if (list.mNodeHead == null) {
            return -1;
        }
        return list.mNodeHead.data;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return list.mNodeHead == null;
    }

    @Override
    public Integer peek() {
        if (list.mNodeHead == null) {
            return -1;
        }
        return list.mNodeHead.data;
    }
}
