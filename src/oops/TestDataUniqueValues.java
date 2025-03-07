package oops;

import array.MinimumIndex;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class TestDataUniqueValues {
    public void test() {
        int[] seq = get_array();
        if (seq.length < 2) {
            throw new AssertionError("less than 2 elements in the array");
        }

        Integer[] tmp = new Integer[seq.length];
        for (int i = 0; i < seq.length; ++i) {
            tmp[i] = seq[i];
        }
        if (!((new LinkedHashSet<Integer>(Arrays.asList(tmp))).size() == seq.length)) {
            throw new AssertionError("not all values are unique");
        }

        int expected_result = get_expected_result();
        int result = new MinimumIndex().minimum_index(seq);
        if (result != expected_result) {
            throw new AssertionError("result is different than the expected result");
        }
    }

    public int[] get_array() {
        // complete this function
        return new int[]{1, 2};
    }

    public int get_expected_result() {
        // complete this function
        return 0;
    }
}
