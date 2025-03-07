package interview.fbprep;

import interview.FacebookInterview;

import java.util.HashSet;
import java.util.Set;

public class CycleDetection {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public int detectCycle(Node head) {
        if (head == null || head.next == null)
            return 0;

        Node slowPointer = head;
        Node fastPointer = head.next;

        while (slowPointer != fastPointer) {
            if (fastPointer == null || fastPointer.next == null) {
                return 0;
            }
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return 1;
    }

    boolean hasCycle(Node head) {
        if (head == null) {
            return false;
        }
        Set<Node> nodeTrackingList = new HashSet<>();
        while (head != null) {
            if (nodeTrackingList.contains(head)) {
                return true;
            }
            nodeTrackingList.add(head);
            head = head.next;
        }
        return false;
    }
}
