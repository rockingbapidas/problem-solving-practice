package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextGreaterElementTest {
    @Test
    void test_nextGreaterElement() {
        NextGreaterElement nextGreaterElement = new NextGreaterElement();
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        int[] expected = {-1, 3, -1};
        assertArrayEquals(expected, nextGreaterElement.nextGreaterElement(nums1, nums2));
    }
}