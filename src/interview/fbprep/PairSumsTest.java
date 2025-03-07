package interview.fbprep;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PairSumsTest {
    private PairSums pairSums;

    @BeforeEach
    void setUp() {
        pairSums = new PairSums();
    }

    @AfterEach
    void tearDown() {
        pairSums = null;
    }

    @Test
    void Test_pair_sum_number_of_ways() {
        int[] input = new int[]{1, 2, 3, 4, 3};
        int sum = 6;

        int actual = pairSums.numberOfWays(input, sum);

        Assertions.assertEquals(2, actual);
    }

    @Test
    void Test_pair_sum_number_of_ways_1() {
        int[] input = new int[]{1, 5, 3, 3, 3};
        int sum = 6;

        int actual = pairSums.numberOfWays(input, sum);

        Assertions.assertEquals(4, actual);
    }
}