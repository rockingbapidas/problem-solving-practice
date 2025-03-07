package interview.fbprep;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CycleDetectionTest {
    private CycleDetection cycleDetection;

    @BeforeEach
    void setUp() {
        cycleDetection = new CycleDetection();
    }

    @AfterEach
    void tearDown() {
        cycleDetection = null;
    }

    @Test
    void List_node_has_cycle() {
        CycleDetection.Node listNode = stubSinglyLinkedListNode(new int[]{1,2,3,1});

        int actual = cycleDetection.detectCycle(listNode);

        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void List_node_has_no_cycle() {
        CycleDetection.Node listNode = stubSinglyLinkedListNode(new int[]{1,2,3});

        int actual = cycleDetection.detectCycle(listNode);

        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    private CycleDetection.Node stubSinglyLinkedListNode(int[] arr) {
        CycleDetection.Node head = null;
        int N = 0;
        while (N < arr.length) {
            int element = arr[N];
            head = insert(head, element);
            N++;
        }
        return head;
    }

    private CycleDetection.Node insert(CycleDetection.Node head, int data) {
        CycleDetection.Node newNode = checkAlreadyHas(head, data);
        if (newNode == null) {
            newNode = new CycleDetection.Node(data);
        }
        if (head != null) {
            CycleDetection.Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        } else {
            head = newNode;
        }
        return head;
    }

    private CycleDetection.Node checkAlreadyHas(CycleDetection.Node head, int data) {
        CycleDetection.Node node = null;
        while (head != null) {
            if (head.data == data) {
                node = head;
            }
            head = head.next;
        }
        return node;
    }
}