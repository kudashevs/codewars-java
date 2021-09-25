package kyu8.twice_as_old;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TwiceAsOldAsTest {
    @Test
    public void testSomething() {
        assertEquals(30, TwiceAsOldAs.TwiceAsOld(30, 0));
        assertEquals(16, TwiceAsOldAs.TwiceAsOld(30, 7));
        assertEquals(15, TwiceAsOldAs.TwiceAsOld(45, 30));
    }
}
