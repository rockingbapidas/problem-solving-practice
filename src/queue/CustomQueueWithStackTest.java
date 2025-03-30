package queue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CustomQueueWithStackTest {
    private CustomQueueWithStack myCustomQueue;

    @BeforeEach
    void setUp() {
        myCustomQueue = new CustomQueueWithStack();
    }

    @AfterEach
    void tearDown() {
        myCustomQueue = null;
    }

    @Test
    void Should_Print_14_14() {
        int[] query = new int[]{1, 2, 1, 3, 1, 3, 1, 1, 2, 2};
        int[] items = new int[]{42, 0, 14, 0, 28, 0, 60, 78, 0, 0};

        List<Integer> actual = new ArrayList<>();
        for (int i = 0; i < query.length; i++) {
            if (query[i] == 1) {
                myCustomQueue.addToQueue(items[i]);
            } else if (query[i] == 3) {
                actual.add(myCustomQueue.getElementAtFront());
            } else {
                myCustomQueue.dequeue();
            }
        }

        List<Integer> expected = new ArrayList<>(Arrays.asList(14,14));

        Assertions.assertEquals(expected.toString(), actual.toString());
    }

    @Test
    void test_queue_with_stack() {
        myCustomQueue.addToQueue(1); // queue is: [1]
        myCustomQueue.addToQueue(2); // queue is: [1, 2] (leftmost is front of the queue)
        Assertions.assertEquals(1, myCustomQueue.getElementAtFront()); // return 1
        Assertions.assertEquals(1, myCustomQueue.dequeue()); // return 1, queue is [2]
        Assertions.assertEquals(false, myCustomQueue.empty()); // return false
    }
}