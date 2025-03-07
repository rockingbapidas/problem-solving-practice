package string;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LongestSubStringTest {
    private LongestSubString subject;

    @BeforeEach
    void setUp() {
        subject = new LongestSubString();
    }

    @AfterEach
    void tearDown() {
        subject = null;
    }

    @Test
    void Test_longest_sub_string_case_1() {
        int actual = subject.lengthOfLongestSubstring("abcabcbb");

        Assertions.assertEquals(3, actual);
    }

    @Test
    void Test_longest_sub_string_case_2() {
        int actual = subject.lengthOfLongestSubstring("bbbbb");

        Assertions.assertEquals(1, actual);
    }

    @Test
    void Test_longest_sub_string_case_3() {
        int actual = subject.lengthOfLongestSubstring("pwwkew");

        Assertions.assertEquals(3, actual);
    }

    @Test
    void Test_longest_sub_string_case_4() {
        int actual = subject.lengthOfLongestSubstring("abba");

        Assertions.assertEquals(2, actual);
    }

    @Test
    void Test_longest_sub_string_case_5() {
        int actual = subject.lengthOfLongestSubstring(" ");

        Assertions.assertEquals(1, actual);
    }

    @Test
    void Test_longest_sub_string_case_6() {
        int actual = subject.lengthOfLongestSubstring("");

        Assertions.assertEquals(0, actual);
    }

    @Test
    void Test_longest_sub_string_case_7() {
        int actual = subject.lengthOfLongestSubstring("au");

        Assertions.assertEquals(2, actual);
    }
}