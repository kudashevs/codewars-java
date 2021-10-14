package kyu8.sum_of_positive;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PositiveSumTest {
    @Test
    public void testSomething() {
        assertEquals(15, PositiveSum.sum(new int[] { 1, 2, 3, 4, 5 }));
        assertEquals(13, PositiveSum.sum(new int[] { 1, -2, 3, 4, 5 }));
        assertEquals(0, PositiveSum.sum(new int[] {}));
        assertEquals(0, PositiveSum.sum(new int[] { -1, -2, -3, -4, -5 }));
        assertEquals(9, PositiveSum.sum(new int[] { -1, 2, 3, 4, -5 }));
    }
}