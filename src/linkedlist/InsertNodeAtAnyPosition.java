package linkedlist;

public class InsertNodeAtAnyPosition {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public Node insertNodeAtPosition(Node llist, int data, int position) {
        // Write your code here
        Node newNode = new Node(data);
        if (llist == null) return newNode;
        if (position == 0) {
            newNode.next = llist;
            return newNode;
        }
        Node current = llist;
        int i = 0;
        while (++i < position) {
            current = current.next;
        }
        if (current.next != null) {
            newNode.next = current.next;
        }
        current.next = newNode;
        return llist;
    }
}
