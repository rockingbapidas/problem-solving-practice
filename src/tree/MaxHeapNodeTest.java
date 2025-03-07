package tree;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaxHeapNodeTest {
    private MaxHeapNode maxHeapNode;

    @BeforeEach
    void setUp() {
        maxHeapNode = new MaxHeapNode();
    }

    @AfterEach
    void tearDown() {
        maxHeapNode = null;
    }

    @Test
    void Test_max_heap_operation() {
        maxHeapNode.insert(0,8);
        maxHeapNode.printMax();
        maxHeapNode.insert(1,7);
        maxHeapNode.printMax();
        maxHeapNode.insert(2,5);
        maxHeapNode.printMax();
        maxHeapNode.insert(3,4);
        maxHeapNode.printMax();
        maxHeapNode.insert(4,6);
        maxHeapNode.printMax();
        maxHeapNode.insert(5,3);
        maxHeapNode.printMax();
        maxHeapNode.insert(6,9);
        maxHeapNode.printMax();
    }
}