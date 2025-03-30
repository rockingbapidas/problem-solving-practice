package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringReversalTest {
    @Test
    void reverse() {
        StringReversal stringReversal = new StringReversal();
        String actual = stringReversal.reverse("Hello");
        assertEquals("olleH", actual);
    }
}