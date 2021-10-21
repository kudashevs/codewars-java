package kyu8.reversed_words;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReverseWordsLoopTest {
    @Test
    public void testSomething() {
        assertEquals("eating like I", ReverseWordsLoop.reverseWords("I like eating"));
        assertEquals("flying like I", ReverseWordsLoop.reverseWords("I like flying"));
        assertEquals("nice is world The", ReverseWordsLoop.reverseWords("The world is nice"));
    }
}