package queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfRecentCallsTest {
    @Test
    void testNumber_Of_recentCalls() {
        NumberOfRecentCalls numberOfRecentCalls = new NumberOfRecentCalls();
        assertEquals(1, numberOfRecentCalls.ping(1));
        assertEquals(2, numberOfRecentCalls.ping(100));
        assertEquals(3, numberOfRecentCalls.ping(3001));
        assertEquals(3, numberOfRecentCalls.ping(3002));
    }
}