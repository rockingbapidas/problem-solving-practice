package stack;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ValidParenthesisTest {
    private ValidParenthesis validParenthesis;

    @BeforeEach
    void setUp() {
        validParenthesis = new ValidParenthesis();
    }

    @AfterEach
    void tearDown() {
        validParenthesis = null;
    }

    @Test
    void Parenthesis_should_be_valid_for_1() {
        boolean actual = validParenthesis.isValid("()[]{}");

        Assertions.assertTrue(actual);
    }

    @Test
    void Parenthesis_should_be_valid_for_2() {
        boolean actual = validParenthesis.isValid("()");

        Assertions.assertTrue(actual);
    }

    @Test
    void Parenthesis_should_be_valid_for_3() {
        boolean actual = validParenthesis.isValid("{[]}");

        Assertions.assertTrue(actual);
    }

    @Test
    void Parenthesis_should_not_be_valid_for_1() {
        boolean actual = validParenthesis.isValid("(]");

        Assertions.assertFalse(actual);
    }

    @Test
    void Parenthesis_should_not_be_valid_for_2() {
        boolean actual = validParenthesis.isValid("(){}}{");

        Assertions.assertFalse(actual);
    }
}