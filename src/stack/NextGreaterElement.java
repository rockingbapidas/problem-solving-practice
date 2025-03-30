package stack;

import java.util.Stack;

public class NextGreaterElement {
    /**
     * This method finds the next greater element for each element in nums1 from nums2.
     * The next greater element is the first greater element to the right of the current element.
     * If there is no greater element, -1 is returned.
     *
     * @param nums1 an array of integers
     * @param nums2 an array of integers
     * @return an array of integers representing the next greater elements
     */
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[nums1.length];

        // Create a map to store the next greater element for each element in nums2
        int[] nextGreater = new int[10001]; // Assuming the elements are in the range [0, 10000]
        for (int j : nums2) {
            // Pop elements from the stack until we find a greater element
            while (!stack.isEmpty() && j > stack.peek()) {
                nextGreater[stack.pop()] = j;
            }
            stack.push(j);
        }

        // Fill the remaining elements with -1
        while (!stack.isEmpty()) {
            nextGreater[stack.pop()] = -1;
        }

        // Map the next greater elements to the result array based on nums1
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreater[nums1[i]];
        }
        return result;
    }
}
