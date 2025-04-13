package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveAllAdjacentDuplicatesInStringTest {
    @Test
    void testRemoveDuplicates() {
        RemoveAllAdjacentDuplicatesInString removeAllAdjacentDuplicatesInString = new RemoveAllAdjacentDuplicatesInString();
        assertEquals("ca", removeAllAdjacentDuplicatesInString.removeDuplicates("abbaca"));
        assertEquals("ay", removeAllAdjacentDuplicatesInString.removeDuplicates("azxxzy"));
        assertEquals("abc", removeAllAdjacentDuplicatesInString.removeDuplicates("abc"));
        assertEquals("", removeAllAdjacentDuplicatesInString.removeDuplicates("aa"));
    }
}