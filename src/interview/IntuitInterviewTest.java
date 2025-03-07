package interview;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IntuitInterviewTest {
    private IntuitInterview intuitInterview;

    @BeforeEach
    void setUp() {
        intuitInterview = new IntuitInterview();
    }

    @AfterEach
    void tearDown() {
        intuitInterview = null;
    }

    @Test
    void Test_check_sum_of_matrix_case_1() {
        int[][] arr = new int[][]{{3, 1, 5}, {3, 5, 6, 7, 1}, {1, 5, 2, 6}};
        int actual = intuitInterview.checkSumOfMatrix(arr);
        Assertions.assertEquals(15, actual);
    }
}