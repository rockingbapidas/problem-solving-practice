package scenario;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class IceCreamParlourTest {
    private IceCreamParlour iceCreamParlour;

    @BeforeEach
    void setUp() {
        iceCreamParlour = new IceCreamParlour();
    }

    @AfterEach
    void tearDown() {
        iceCreamParlour = null;
    }

    @Test
    void Should_return_1_and_4_flavor() {
        List<Integer> cost = new ArrayList<>(Arrays.asList(1, 4, 5, 3, 2));
        int money = 4;

        List<Integer> actual = iceCreamParlour.iceCreamParlor(money, cost);

        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 4));

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void Should_return_1_and_2_flavor() {
        List<Integer> cost = new ArrayList<>(Arrays.asList(2, 2, 4, 3));
        int money = 4;

        List<Integer> actual = iceCreamParlour.iceCreamParlor(money, cost);

        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 2));

        Assertions.assertEquals(expected, actual);
    }
}