package oops;

import array.MinimumIndex;

import java.util.Arrays;

public class TestDataExactlyTwoDifferentMinimums {
    public void test() {
        int[] seq = get_array();
        if (seq.length < 2) {
            throw new AssertionError("less than 2 elements in the array");
        }

        int[] tmp = seq.clone();
        Arrays.sort(tmp);
        if (!(tmp[0] == tmp[1] && (tmp.length == 2 || tmp[1] < tmp[2]))) {
            throw new AssertionError("there are not exactly two minimums in the array");
        }

        int expected_result = get_expected_result();
        int result = new MinimumIndex().minimum_index(seq);
        if (result != expected_result) {
            throw new AssertionError("result is different than the expected result");
        }
    }

    public int[] get_array() {
        // complete this function
        return new int[]{1, 1};
    }

    public int get_expected_result() {
        // complete this function
        return 0;
    }
}
