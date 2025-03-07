package interview;

public class FacebookInterview {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    Node insert(Node head, int value) {
        Node current = head;
        Node newNode = new Node(value);

        if (current == null) {
            newNode.next = newNode;
            head = newNode;
            return head;
        }

        if (current.data >= newNode.data) {
            while (current.next != head)
                current = current.next;
            current.next = newNode;
            newNode.next = head;
            head = newNode;
        } else {
            while (current.next != head && current.next.data < newNode.data)
                current = current.next;
            newNode.next = current.next;
            current.next = newNode;
        }
        return head;
    }
}
