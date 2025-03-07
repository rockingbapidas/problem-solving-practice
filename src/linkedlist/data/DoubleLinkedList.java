package linkedlist.data;

public class DoubleLinkedList {
    public int data;
    public DoubleLinkedList next;
    public DoubleLinkedList prev;

    public DoubleLinkedList(int nodeData) {
        this.data = nodeData;
        this.next = null;
        this.prev = null;
    }

    public DoubleLinkedList(int nodeData, DoubleLinkedList next) {
        this.data = nodeData;
        this.next = next;
        this.prev = null;
    }

    public DoubleLinkedList(int nodeData, DoubleLinkedList next, DoubleLinkedList prev) {
        this.data = nodeData;
        this.next = next;
        this.prev = prev;
    }
}
