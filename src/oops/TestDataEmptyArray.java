package oops;

import array.MinimumIndex;

public class TestDataEmptyArray {

    public void test() {
        try {
            int[] seq = get_array();
            int result = new MinimumIndex().minimum_index(seq);
        } catch (IllegalArgumentException e) {
            return;
        }
        throw new AssertionError("Exception wasn't thrown as expected");
    }

    public int[] get_array() {
        // complete this function
        return new int[]{};
    }
}
