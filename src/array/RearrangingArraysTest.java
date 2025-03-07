package array;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class RearrangingArraysTest {
    private RearrangingArrays rearrangingArrays;

    @BeforeEach
    void setUp() {
        rearrangingArrays = new RearrangingArrays();
    }

    @AfterEach
    void tearDown() {
        rearrangingArrays = null;
    }

    @Test
    void Array_should_be_rearrange_1() {
        int[] actual = rearrangingArrays.bruteForce(5, new int[]{3, 1, 34, 22, 16}, 22);

        int[] expected = new int[]{1, 3, 1, 34, 16};

        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    void Array_should_be_rearrange_2() {
        int[] actual = rearrangingArrays.bruteForce(5, new int[]{22, 1, 34, 22, 16}, 22);

        int[] expected = new int[]{1, 1, 1, 34, 16};

        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }
}