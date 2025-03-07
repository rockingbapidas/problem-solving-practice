package interview;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class FacebookInterviewTest {
    private FacebookInterview subject;

    @BeforeEach
    void setUp() {
        subject = new FacebookInterview();
    }

    @AfterEach
    void tearDown() {
        subject = null;
    }

    @Test
    void Test_circular_sorted_node_insert_case_1() {
        FacebookInterview.Node head = buildNodes();

        FacebookInterview.Node actual = subject.insert(head, 1);

        String actualS = stubOutputNode(actual);
        String expected = stubOutputNode(buildNodesOutput1());

        Assertions.assertEquals(expected, actualS);
    }

    @Test
    void Test_circular_sorted_node_insert_case_2() {
        FacebookInterview.Node head = buildNodes();

        FacebookInterview.Node actual = subject.insert(head, 6);

        String actualS = stubOutputNode(actual);
        String expected = stubOutputNode(buildNodesOutput2());

        Assertions.assertEquals(expected, actualS);
    }

    private FacebookInterview.Node buildNodes() {
        FacebookInterview.Node head = new FacebookInterview.Node(2);
        FacebookInterview.Node next1 = new FacebookInterview.Node(3);
        FacebookInterview.Node next2 = new FacebookInterview.Node(4);
        FacebookInterview.Node next3 = new FacebookInterview.Node(5);

        head.next = next1;
        next1.next = next2;
        next2.next = next3;
        next3.next = head;

        return head;
    }

    private FacebookInterview.Node buildNodesOutput1() {
        FacebookInterview.Node head = new FacebookInterview.Node(1);
        FacebookInterview.Node next1 = new FacebookInterview.Node(2);
        FacebookInterview.Node next2 = new FacebookInterview.Node(3);
        FacebookInterview.Node next3 = new FacebookInterview.Node(4);
        FacebookInterview.Node next4 = new FacebookInterview.Node(5);

        head.next = next1;
        next1.next = next2;
        next2.next = next3;
        next3.next = next4;
        next4.next = head;

        return head;
    }

    private FacebookInterview.Node buildNodesOutput2() {
        FacebookInterview.Node head = new FacebookInterview.Node(2);
        FacebookInterview.Node next1 = new FacebookInterview.Node(3);
        FacebookInterview.Node next2 = new FacebookInterview.Node(4);
        FacebookInterview.Node next3 = new FacebookInterview.Node(5);
        FacebookInterview.Node next4 = new FacebookInterview.Node(6);

        head.next = next1;
        next1.next = next2;
        next2.next = next3;
        next3.next = next4;
        next4.next = head;

        return head;
    }

    private String stubOutputNode(FacebookInterview.Node listNode) {
        List<Integer> result = new ArrayList<>();
        while (listNode.data < listNode.next.data) {
            result.add(listNode.data);
            listNode = listNode.next;
        }
        result.add(listNode.data);
        return result.toString();
    }
}