package scenario;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NeedleHaystackProblemTest {
    private NeedleHaystackProblem needleHaystackProblem;

    @BeforeEach
    void setUp() {
        needleHaystackProblem = new NeedleHaystackProblem();
    }

    @AfterEach
    void tearDown() {
        needleHaystackProblem = null;
    }

    @Test
    void Needle_output_should_be_2(){
        String haystack = "hello";
        String needle = "ll";

        int actual = needleHaystackProblem.strStr(haystack, needle);

        Assertions.assertEquals(2, actual);
    }

    @Test
    void Needle_output_should_be_minus1(){
        String haystack = "aaaaa";
        String needle = "bba";

        int actual = needleHaystackProblem.strStr(haystack, needle);

        Assertions.assertEquals(-1, actual);
    }

    @Test
    void Needle_output_should_be_0(){
        String haystack = "aaa";
        String needle = "a";

        int actual = needleHaystackProblem.strStr(haystack, needle);

        Assertions.assertEquals(0, actual);
    }

    @Test
    void Needle_output_should_be_minus1_1(){
        String haystack = "";
        String needle = "a";

        int actual = needleHaystackProblem.strStr(haystack, needle);

        Assertions.assertEquals(-1, actual);
    }

    @Test
    void Needle_output_should_be_0_1(){
        String haystack = "";
        String needle = "";

        int actual = needleHaystackProblem.strStr(haystack, needle);

        Assertions.assertEquals(0, actual);
    }

    @Test
    void Needle_output_should_be_minus1_2(){
        String haystack = "aaa";
        String needle = "aaaa";

        int actual = needleHaystackProblem.strStr(haystack, needle);

        Assertions.assertEquals(-1, actual);
    }

    @Test
    void Needle_output_should_be_1(){
        String haystack = "mississippi";
        String needle = "issi";

        int actual = needleHaystackProblem.strStr(haystack, needle);

        Assertions.assertEquals(1, actual);
    }

    @Test
    void Needle_output_should_be_minus1_3(){
        String haystack = "hello";
        String needle = "lle";

        int actual = needleHaystackProblem.strStr(haystack, needle);

        Assertions.assertEquals(-1, actual);
    }

    @Test
    void Needle_output_should_be_4(){
        String haystack = "mississippi";
        String needle = "issip";

        int actual = needleHaystackProblem.strStr(haystack, needle);

        Assertions.assertEquals(4, actual);
    }

    @Test
    void Needle_output_should_be_3(){
        String haystack = "abcdabc";
        String needle = "da";

        int actual = needleHaystackProblem.strStr(haystack, needle);

        Assertions.assertEquals(3, actual);
    }
}