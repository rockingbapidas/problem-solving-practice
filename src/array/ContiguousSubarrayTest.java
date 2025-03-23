package array;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class ContiguousSubarrayTest {
    private ContiguousSubarray contiguousSubarray;

    @BeforeEach
    void setUp() {
        contiguousSubarray = new ContiguousSubarray();
    }

    @AfterEach
    void tearDown() {
        contiguousSubarray = null;
    }

    @Test
    void Test_contiguous_sub_array() {
        int[] input = new int[]{3, 4, 1, 6, 2};

        int[] actual = contiguousSubarray.countSubarrays(input);

        int[] expected = new int[]{1, 3, 1, 5, 1};
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }
}