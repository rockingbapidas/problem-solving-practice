package queue;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumberOfStudentsUnableToEatLunchTest {
    @Test
    public void countStudents() {
        NumberOfStudentsUnableToEatLunch numberOfStudentsUnableToEatLunch = new NumberOfStudentsUnableToEatLunch();

        // assertEquals(0, numberOfStudentsUnableToEatLunch.countStudents(new int[]{1, 1, 0, 0}, new int[]{0, 1, 0, 1}));

        assertEquals(3, numberOfStudentsUnableToEatLunch.countStudents(new int[]{1,1,1,0,0,1}, new int[]{1,0,0,0,1,1}));
    }
}