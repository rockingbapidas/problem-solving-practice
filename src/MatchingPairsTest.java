import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MatchingPairsTest {
    private MatchingPairs matchingPairs;

    @BeforeEach
    void setUp() {
        matchingPairs = new MatchingPairs();
    }

    @AfterEach
    void tearDown() {
        matchingPairs = null;
    }

    @Test
    void Test_matching_pairs_case_1() {
        int actual = matchingPairs.matchingPairs("abcd", "adcb");

        Assertions.assertEquals(4, actual);
    }

    @Test
    void Test_matching_pairs_case_2() {
        int actual = matchingPairs.matchingPairs("mno", "mno");

        Assertions.assertEquals(1, actual);
    }
}