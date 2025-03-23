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

    @Override
    public String toString() {
        return "DoubleLinkedList{" +
                "data=" + data +
                ", next=" + next +
                ", prev=" + prev +
                '}';
    }

    public void print() {
        DoubleLinkedList start = this;
        while (start != null) {
            if (start.next != null && start.prev != null) {
                System.out.println("[Value " + start.data + " " + "Next " + start.next.data + " " + "Prev " + start.prev.data + "]");
            } else if (start.next == null && start.prev != null) {
                System.out.println("[Value " + start.data + " " + "Prev " + start.prev.data + "]");
            } else if (start.next != null) {
                System.out.println("[Value " + start.data + " " + "Next " + start.next.data + "]");
            } else {
                System.out.println("[Value " + start.data + "]");
            }
            start = start.next;
        }
    }

    public int[] toArray() {
        int[] array = new int[length()];
        DoubleLinkedList current = this;
        int i = 0;
        while (current != null) {
            array[i] = current.data;
            current = current.next;
            i++;
        }
        return array;
    }

    public int length() {
        int i = 0;
        DoubleLinkedList current = this;
        while (current != null) {
            current = current.next;
            i++;
        }
        return i;
    }

    public boolean isEmpty() {
        return length() == 0;
    }
}
