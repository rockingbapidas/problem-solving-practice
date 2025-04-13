package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveOutermostParenthesesTest {
    @Test
    void testRemoveOuterParentheses() {
        RemoveOutermostParentheses removeOutermostParentheses = new RemoveOutermostParentheses();

        // Test case 1
        String s1 = "(()())(())";
        String expected1 = "()()()";
        assertEquals(expected1, removeOutermostParentheses.removeOuterParentheses(s1), "Test case 1 failed");

        // Test case 2
        String s2 = "(()())(())(()(()))";
        String expected2 = "()()()()(())";
        assertEquals(expected2, removeOutermostParentheses.removeOuterParentheses(s2), "Test case 2 failed");

        // Test case 3
        String s3 = "()()";
        String expected3 = "";
        assertEquals(expected3, removeOutermostParentheses.removeOuterParentheses(s3), "Test case 3 failed");
    }
}