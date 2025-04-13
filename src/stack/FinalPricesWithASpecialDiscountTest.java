package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FinalPricesWithASpecialDiscountTest {
    @Test
    void testFinalPrices() {
        FinalPricesWithASpecialDiscount solution = new FinalPricesWithASpecialDiscount();
        assertArrayEquals(new int[]{4,2,4,2,3}, solution.finalPrices(new int[]{8, 4, 6, 2, 3}));
        assertArrayEquals(new int[]{1, 2, 3, 4}, solution.finalPrices(new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{10}, solution.finalPrices(new int[]{10}));
    }
}