package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InfixToPostfixConversionTest {
    @Test
    void test_infixToPostfix() {
        InfixToPostfixConversion converter = new InfixToPostfixConversion();

        // Test cases
        assertEquals("abc*+d+", converter.infixToPostfix("a+b*c+d"));
        assertEquals("abc*+", converter.infixToPostfix("a+b*c"));
        assertEquals("ab+c*", converter.infixToPostfix("(a+b)*c"));
        assertEquals("ab+c*d-", converter.infixToPostfix("(a+b)*c-d"));
        assertEquals("ab+c*de/-", converter.infixToPostfix("(a+b)*c-d/e"));
        assertEquals("ab+c*de/-f-", converter.infixToPostfix("(a+b)*c-d/e-f"));
    }
}