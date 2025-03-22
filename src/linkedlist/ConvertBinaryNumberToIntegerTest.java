package linkedlist;

import linkedlist.data.SingleLinkedList;
import linkedlist.wrapper.SingleLinkedListWrapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertBinaryNumberToIntegerTest {
    @Test
    void testGetDecimalValue() {
        SingleLinkedListWrapper singleLinkedListWrapper = new SingleLinkedListWrapper();
        singleLinkedListWrapper.build(new int[]{1, 0, 1});
        ConvertBinaryNumberToInteger convertBinaryNumberToInteger = new ConvertBinaryNumberToInteger();
        assertEquals(5, convertBinaryNumberToInteger.getDecimalValue(singleLinkedListWrapper.mNodeHead));
    }
}