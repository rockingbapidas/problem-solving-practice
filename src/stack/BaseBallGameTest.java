package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BaseBallGameTest {
    @Test
    void testCalPoints() {
        BaseBallGame baseBallGame = new BaseBallGame();

        // Test case 1: Basic operations
        String[] operations1 = {"5", "2", "C", "D", "+"};
        assertEquals(30, baseBallGame.calPoints(operations1));

        // Test case 2: All operations
        String[] operations2 = {"5", "-2", "4", "C", "D", "9", "+", "+"};
        assertEquals(27, baseBallGame.calPoints(operations2));

        // Test case 3: Only score operations
        String[] operations3 = {"1", "2", "3"};
        assertEquals(6, baseBallGame.calPoints(operations3));

        // Test case 4: Only C and D operations
        String[] operations4 = {"C", "D"};
        assertEquals(0, baseBallGame.calPoints(operations4));

        // Test case 5: Empty operations
        String[] operations5 = {};
        assertEquals(0, baseBallGame.calPoints(operations5));
    }
}