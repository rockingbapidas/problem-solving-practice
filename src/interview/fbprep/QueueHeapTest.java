package interview.fbprep;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QueueHeapTest {
    private QueueHeap queueHeap;

    @BeforeEach
    void setUp() {
        queueHeap = new QueueHeap();
    }

    @AfterEach
    void tearDown() {
        queueHeap = null;
    }

    @Test
    void Test_q_heap_operation() {
        int[] arr = {1, 1, 3, 2, 3};
        int[] arr1 = {4, 9, 0, 4, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                queueHeap.insert(arr1[i]);
            } else if (arr[i] == 2) {
                queueHeap.delete(arr1[i]);
            } else {
                queueHeap.print();
            }
        }
    }
}