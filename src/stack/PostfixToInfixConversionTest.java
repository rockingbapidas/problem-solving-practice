package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostfixToInfixConversionTest {
    @Test
    void test_postFixToInfix() {
        PostfixToInfixConversion converter = new PostfixToInfixConversion();

        // Test cases
        assertEquals("((a*b)+c)", converter.postFixToInfix("ab*c+"));
        assertEquals("(((a+b)*c)+d)", converter.postFixToInfix("ab+c*d+"));
        assertEquals("(a+(b*c))", converter.postFixToInfix("abc*+"));
        assertEquals("((a+b)*c)", converter.postFixToInfix("ab+c*"));
        assertEquals("(((a+b)*c)-d)", converter.postFixToInfix("ab+c*d-"));
        assertEquals("((((a+b)*c)/d)-e)", converter.postFixToInfix("ab+c*d/e-"));
        assertEquals("(((((a+b)*c)/d)-e)-f)", converter.postFixToInfix("ab+c*d/e-f-"));
    }
}