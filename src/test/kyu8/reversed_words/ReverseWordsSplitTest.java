package kyu8.reversed_words;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReverseWordsSplitTest {
    @Test
    public void testSomething() {
        assertEquals("eating like I", ReverseWordsSplit.reverseWords("I like eating"));
        assertEquals("flying like I", ReverseWordsSplit.reverseWords("I like flying"));
        assertEquals("nice is world The", ReverseWordsSplit.reverseWords("The world is nice"));
    }
}