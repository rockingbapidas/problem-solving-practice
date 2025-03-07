package interview.fbprep;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;


class VeryBigSumTest {
    private VeryBigSum veryBigSum;

    @BeforeEach
    void setUp() {
        veryBigSum = new VeryBigSum();
    }

    @AfterEach
    void tearDown() {
        veryBigSum = null;
    }

    @Test
    void Sum_should_bee_5000000015() {
        long actual = veryBigSum.aVeryBigSum(new ArrayList<>(Arrays.asList(1000000001L, 1000000002L,
                1000000003L, 1000000004L, 1000000005L)));

        long expected = 5000000015L;

        Assertions.assertEquals(expected, actual);
    }
}