package interview.fbprep;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class InsertTreeNodeAtAnyPositionTest {
    private InsertNodeAtAnyPosition insertNodeAtAnyPosition;

    @BeforeEach
    void setUp() {
        insertNodeAtAnyPosition = new InsertNodeAtAnyPosition();
    }

    @AfterEach
    void tearDown() {
        insertNodeAtAnyPosition = null;
    }

    @Test
    void Node_should_insert_at_2_pos() {
        InsertNodeAtAnyPosition.Node listNode = stubSinglyLinkedListNode(new int[]{16, 13, 7});
        int insertData = 1;
        int position = 2;

        InsertNodeAtAnyPosition.Node actual = insertNodeAtAnyPosition.insertNodeAtPosition(listNode, insertData, position);

        InsertNodeAtAnyPosition.Node expected = stubSinglyLinkedListNode(new int[]{16, 13, 1, 7});

        String expectedArray = stubOutputSinglyLinkedListNode(expected);
        String actualArray = stubOutputSinglyLinkedListNode(actual);

        Assertions.assertEquals(expectedArray, actualArray);
    }

    @Test
    void Node_should_insert_at_3_pos() {
        InsertNodeAtAnyPosition.Node listNode = stubSinglyLinkedListNode(new int[]{11, 9, 19, 10, 4});
        int insertData = 20;
        int position = 3;

        InsertNodeAtAnyPosition.Node actual = insertNodeAtAnyPosition.insertNodeAtPosition(listNode, insertData, position);

        InsertNodeAtAnyPosition.Node expected = stubSinglyLinkedListNode(new int[]{11, 9, 19, 20, 10, 4});

        String expectedArray = stubOutputSinglyLinkedListNode(expected);
        String actualArray = stubOutputSinglyLinkedListNode(actual);

        Assertions.assertEquals(expectedArray, actualArray);
    }

    private InsertNodeAtAnyPosition.Node stubSinglyLinkedListNode(int[] arr) {
        InsertNodeAtAnyPosition.Node head = null;
        int N = 0;
        while (N < arr.length) {
            int element = arr[N];
            head = insert(head, element);
            N++;
        }
        return head;
    }

    private InsertNodeAtAnyPosition.Node insert(InsertNodeAtAnyPosition.Node head, int data) {
        InsertNodeAtAnyPosition.Node newNode = new InsertNodeAtAnyPosition.Node(data);
        if (head != null) {
            InsertNodeAtAnyPosition.Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        } else {
            head = newNode;
        }
        return head;
    }

    private String stubOutputSinglyLinkedListNode(InsertNodeAtAnyPosition.Node listNode) {
        List<Integer> result = new ArrayList<>();
        while (listNode != null) {
            result.add(listNode.data);
            listNode = listNode.next;
        }
        return result.toString();
    }
}