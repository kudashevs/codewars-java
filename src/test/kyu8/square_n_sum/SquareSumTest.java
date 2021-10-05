package kyu8.square_n_sum;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SquareSumTest {
    @Test
    public void testBasic()
    {
     assertEquals(9, SquareSum.squareSum(new int[] {1,2,2}));
     assertEquals(5, SquareSum.squareSum(new int[] {1,2}));
     assertEquals(50, SquareSum.squareSum(new int[] {5,-3,4}));
    }
}
