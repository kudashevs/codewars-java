package kyu7.highest_and_lowest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HighestAndLowestSortTest {
    @Test
    public void test1() {
      assertEquals("42 -9", HighestAndLowestSort.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
}
