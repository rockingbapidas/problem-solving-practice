import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class QueueRemovalsTest {
    private QueueRemovals subject;

    @BeforeEach
    void setUp() {
        subject = new QueueRemovals();
    }

    @AfterEach
    void tearDown() {
        subject = null;
    }

    @Test
    void Test_findPositions_case_1() {
        int[] actual = subject.findPositions(new int[]{1, 2, 2, 3, 4, 5}, 5);

        int[] expected = {5, 6, 4, 1, 2};

        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    void Test_findPositions_case_2() {
        int[] actual = subject.findPositions(new int[]{2, 4, 2, 4, 3, 1, 2, 2, 3, 4, 3, 4, 4}, 4);

        int[] expected = {2, 5, 10, 13};

        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }
}