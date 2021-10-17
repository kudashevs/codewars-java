package kyu7.string_ends_with;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringEndsWithTest {
    @Test
    public void testSomething() {
        assertEquals(true, StringEndsWith.solution("samurai", "ai"));
        assertEquals(false, StringEndsWith.solution("sumo", "omo"));
        assertEquals(true, StringEndsWith.solution("ninja", "ja"));
        assertEquals(true, StringEndsWith.solution("sensei", "i"));
        assertEquals(false, StringEndsWith.solution("samurai", "ra"));
        assertEquals(false, StringEndsWith.solution("abc", "abcd"));
        assertEquals(true, StringEndsWith.solution("abc", "abc"));
        assertEquals(true, StringEndsWith.solution("abcabc", "bc"));
        assertEquals(false, StringEndsWith.solution("ails", "fails"));
        assertEquals(true, StringEndsWith.solution("fails", "ails"));
        assertEquals(false, StringEndsWith.solution("this", "fails"));
        assertEquals(true, StringEndsWith.solution("yes this will pass", ""));
        assertEquals(false, StringEndsWith.solution("this will not pass", "`^$<>()[]*|"));
        assertEquals(false, StringEndsWith.solution("abc\n", "abc"), "Watch out for \n in the end");
    }
}
