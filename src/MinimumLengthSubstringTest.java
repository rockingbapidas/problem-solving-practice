import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MinimumLengthSubstringTest {
    private MinimumLengthSubstring minimumLengthSubstring;

    @BeforeEach
    void setUp() {
        minimumLengthSubstring = new MinimumLengthSubstring();
    }

    @AfterEach
    void tearDown() {
        minimumLengthSubstring = null;
    }

    @Test
    void Test_Minimum_Length_Substring_case_1() {
        int actual = minimumLengthSubstring.minLengthSubstring("dcbefebce", "fd");

        Assertions.assertEquals(5, actual);
    }

    @Test
    void Test_Minimum_Length_Substring_case_2() {
        int actual = minimumLengthSubstring.minLengthSubstring("bfbeadbcbcbfeaaeefcddcccbbbfaaafdbebedddf", "cbccfafebccdccebdd");

        Assertions.assertEquals(-1, actual);
    }
}