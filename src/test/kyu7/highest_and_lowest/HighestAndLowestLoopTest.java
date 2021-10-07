package kyu7.highest_and_lowest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HighestAndLowestLoopTest {
    @Test
    public void test1() {
      assertEquals("42 -9", HighestAndLowestLoop.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
}
