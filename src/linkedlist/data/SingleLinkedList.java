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

    @Override
    public String toString() {
        return "SingleLinkedList{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }

    public void print() {
        SingleLinkedList start = this;
        while (start != null) {
            if (start.next != null) {
                System.out.println("[Value " + start.data + " " + "Next " + start.next.data + "]");
            } else {
                System.out.println("[Value " + start.data + "]");
            }
            start = start.next;
        }
    }

    public int[] toArray() {
        int[] array = new int[length()];
        SingleLinkedList current = this;
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
        SingleLinkedList current = this;
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
