package linkedlist;

import linkedlist.data.SingleLinkedList;
import linkedlist.wrapper.SingleLinkedListWrapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PartitionLinkedListTest {
    @Test
    void test_partition() {
        SingleLinkedListWrapper list = new SingleLinkedListWrapper();
        list.build(new int[]{3, 5, 8, 5, 10, 2, 1});

        PartitionLinkedList partitionLinkedList = new PartitionLinkedList();
        SingleLinkedList partitioned = partitionLinkedList.partition(list.mNodeHead, 5);

        assertEquals(3, partitioned.data);
        assertEquals(2, partitioned.next.data);
        assertEquals(1, partitioned.next.next.data);
        assertEquals(5, partitioned.next.next.next.data);
        assertEquals(8, partitioned.next.next.next.next.data);
        assertEquals(5, partitioned.next.next.next.next.next.data);
        assertEquals(10, partitioned.next.next.next.next.next.next.data);
    }
}