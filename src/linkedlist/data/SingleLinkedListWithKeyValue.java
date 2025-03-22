package linkedlist.data;

public class SingleLinkedListWithKeyValue {
    public KeyValue data;
    public SingleLinkedListWithKeyValue next;

    public SingleLinkedListWithKeyValue(KeyValue nodeData) {
        this.data = nodeData;
        this.next = null;
    }

    public SingleLinkedListWithKeyValue(KeyValue nodeData, SingleLinkedListWithKeyValue next) {
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
        SingleLinkedListWithKeyValue start = this;
        while (start != null) {
            if (start.next != null) {
                System.out.println("[Value " + start.data + " " + "Next " + start.next.data + "]");
            } else {
                System.out.println("[Value " + start.data + "]");
            }
            start = start.next;
        }
    }

    public int length() {
        int i = 0;
        SingleLinkedListWithKeyValue current = this;
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
