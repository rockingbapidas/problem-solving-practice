package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackspaceStringCompareTest {
    @Test
    void testBackspaceCompare() {
        BackspaceStringCompare backspaceStringCompare = new BackspaceStringCompare();

        // Test case 1
        String s1 = "ab#c";
        String t1 = "ad#c";
        assertTrue(backspaceStringCompare.backspaceCompare(s1, t1), "Test case 1 failed");

        // Test case 2
        String s2 = "ab##";
        String t2 = "c#d#";
        assertTrue(backspaceStringCompare.backspaceCompare(s2, t2), "Test case 2 failed");

        // Test case 3
        String s3 = "a#c";
        String t3 = "b";
        assertFalse(backspaceStringCompare.backspaceCompare(s3, t3), "Test case 3 failed");

        // Test case 4
        String s4 = "a##c";
        String t4 = "#a#c";
        assertTrue(backspaceStringCompare.backspaceCompare(s4, t4), "Test case 4 failed");
    }
}