package interview.fbprep;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ArrayLeftRotationTest {
    private ArrayLeftRotation arrayLeftRotation;

    @BeforeEach
    void setUp() {
        arrayLeftRotation = new ArrayLeftRotation();
    }

    @AfterEach
    void tearDown() {
        arrayLeftRotation = null;
    }

    @Test
    void Should_be_5_1_2_3_4() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int time = 4;
        List<Integer> actual = arrayLeftRotation.rotateWithList(list, time);
        List<Integer> expected = new ArrayList<>(Arrays.asList(5, 1, 2, 3, 4));
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void Should_be_6_5_1_2_3_4() {
        int[] list = new int[]{1, 2, 3, 4, 5, 6};
        int time = 4;
        int[] actual = arrayLeftRotation.rotateWithIntArray(list, time);
        int[] expected = new int[]{5, 6, 1, 2, 3, 4};
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }
}