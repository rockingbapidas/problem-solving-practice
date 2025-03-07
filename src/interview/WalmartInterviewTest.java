package interview;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class WalmartInterviewTest {
    private WalmartInterview walmartInterview;

    @BeforeEach
    void setUp() {
        walmartInterview = new WalmartInterview();
    }

    @AfterEach
    void tearDown() {
        walmartInterview = null;
    }

    @Test
    void Test_Two_sum() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] actual = walmartInterview.twoSum(arr, 4);

        Assertions.assertEquals(new int[]{1, 3}, actual);
    }

    @Test
    void Test_balanced_brackets() {
        boolean actual = walmartInterview.balancedBrackets("{[(]}");

        Assertions.assertFalse(actual);
    }

    @Test
    void Test_longest_common_prefix() {
        String[] input = new String[]{"flower", "flow", "flight"};

        String actual = walmartInterview.longestCommonPrefix(input);

        String expected = "fl";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void Test_group_anagram() {
        String[] input = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> actual = walmartInterview.groupAnagram(input);

        List<List<String>> expected = new ArrayList<>();
        expected.add(List.of("eat", "tea", "ate"));
        expected.add(List.of("bat"));
        expected.add(List.of("tan", "nat"));

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void Test_find_missing_number() {
        int[] input = {1,2,3,5};

        int actual = walmartInterview.findMissingNumber(input, 4);

        Assertions.assertEquals(4, actual);
    }

    @Test
    void Test_Anagram_check() {
        boolean actual = walmartInterview.isAnagram("", "");

        Assertions.assertTrue(actual);
    }
}