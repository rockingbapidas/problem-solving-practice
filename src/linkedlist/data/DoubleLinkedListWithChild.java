package linkedlist.data;

public class DoubleLinkedListWithChild {
    public int value;
    public DoubleLinkedListWithChild prev;
    public DoubleLinkedListWithChild next;
    public DoubleLinkedListWithChild child;

    public DoubleLinkedListWithChild(int value) {
        this.value = value;
        this.prev = null;
        this.next = null;
        this.child = null;
    }

    public DoubleLinkedListWithChild(int value, DoubleLinkedListWithChild prev, DoubleLinkedListWithChild next, DoubleLinkedListWithChild child) {
        this.value = value;
        this.prev = prev;
        this.next = next;
        this.child = child;
    }
}
