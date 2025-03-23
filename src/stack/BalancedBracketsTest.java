package stack;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BalancedBracketsTest {
    private BalancedBrackets balancedBrackets;

    @BeforeEach
    void setUp() {
        balancedBrackets = new BalancedBrackets();
    }

    @AfterEach
    void tearDown() {
        balancedBrackets = null;
    }

    @Test
    void Bracket_should_be_balanced() {
        String input = "{[()]}";

        String actual = balancedBrackets.validBrackets(input);
        boolean status = balancedBrackets.isBalanced(input);

        String expected = "YES";

        Assertions.assertEquals(expected, actual);
        Assertions.assertTrue(status);
    }

    @Test
    void Bracket_should_not_be_balanced() {
        String input = "{[(])}";

        String actual = balancedBrackets.validBrackets(input);
        boolean status = balancedBrackets.isBalanced(input);

        String expected = "NO";

        Assertions.assertEquals(expected, actual);
        Assertions.assertFalse(status);
    }
}