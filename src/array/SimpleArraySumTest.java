package array;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class SimpleArraySumTest {
    private SimpleArraySum simpleArraySum;

    @BeforeEach
    void setUp() {
        simpleArraySum = new SimpleArraySum();
    }

    @AfterEach
    void tearDown() {
        simpleArraySum = null;
    }

    @Test
    void Sum_should_31() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 10, 11));

        int actual = simpleArraySum.simpleArraySum(input);

        Assertions.assertEquals(31, actual);
    }
}