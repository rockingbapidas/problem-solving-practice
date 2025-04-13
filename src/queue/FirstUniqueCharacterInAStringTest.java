package queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstUniqueCharacterInAStringTest {
    @Test
    void testFirstUniqChar() {
        FirstUniqueCharacterInAString firstUniqueCharacterInAString = new FirstUniqueCharacterInAString();
        assertEquals(0, firstUniqueCharacterInAString.firstUniqChar("leetcode"));
        assertEquals(2, firstUniqueCharacterInAString.firstUniqChar("loveleetcode"));
        assertEquals(-1, firstUniqueCharacterInAString.firstUniqChar("aabb"));
        assertEquals(-1, firstUniqueCharacterInAString.firstUniqChar("aadadaad"));
    }
}