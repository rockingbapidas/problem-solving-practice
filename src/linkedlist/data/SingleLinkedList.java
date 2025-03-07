package linkedlist.data;

public class SingleLinkedList {
    public int data;
    public SingleLinkedList next;

    public SingleLinkedList(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }

    public SingleLinkedList(int nodeData, SingleLinkedList next) {
        this.data = nodeData;
        this.next = next;
    }
}
