package array;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LongestCommonPrefixTest {
    private LongestCommonPrefix longestCommonPrefix;

    @BeforeEach
    void setUp() {
        longestCommonPrefix = new LongestCommonPrefix();
    }

    @AfterEach
    void tearDown() {
        longestCommonPrefix = null;
    }

    @Test
    void Common_Prefix_Should_be_fl() {
        String[] param = new String[]{"flower","flow","flight"};
        String actual = longestCommonPrefix.solution(param);

        String expected = "fl";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void Common_Prefix_Should_be_aa() {
        String[] param = new String[]{"aaaa","aa","aaa"};
        String actual = longestCommonPrefix.solution(param);

        String expected = "aa";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void Common_Prefix_Should_be_c() {
        String[] param = new String[]{"cir","cri"};
        String actual = longestCommonPrefix.solution(param);

        String expected = "c";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void Common_Prefix_Should_be_a() {
        String[] param = new String[]{"a"};
        String actual = longestCommonPrefix.solution(param);

        String expected = "a";
        Assertions.assertEquals(expected, actual);
    }
}