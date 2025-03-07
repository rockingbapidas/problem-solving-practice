package string;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LongestPalindromicStringTest {
    private LongestPalindromicString subject;

    @BeforeEach
    void setUp() {
        subject = new LongestPalindromicString();
    }

    @AfterEach
    void tearDown() {
        subject = null;
    }

    @Test
    void Test_Longest_Palindromic_Sub_String_case_1() {
        String actual = subject.longestPalindrome("babad");
        Assertions.assertEquals("bab", actual);
    }

    @Test
    void Test_Longest_Palindromic_Sub_String_case_2() {
        String actual = subject.longestPalindrome("cbbd");
        Assertions.assertEquals("bb", actual);
    }

    @Test
    void Test_Longest_Palindromic_Sub_String_case_3() {
        String actual = subject.longestPalindrome("aaaa");
        Assertions.assertEquals("aaaa", actual);
    }
}