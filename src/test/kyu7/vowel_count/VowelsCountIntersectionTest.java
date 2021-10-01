package kyu7.vowel_count;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class VowelsCountIntersectionTest {
    @Test
    public void testCase1() {
        assertEquals(5, VowelsCountIntersection.getCount("abracadabra"));
    }
}