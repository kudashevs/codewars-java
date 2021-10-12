package kyu6.split_strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class StringSplitRegexTest {
    @Test
    public void testEvenString() {
        String s = "abcdef";
        String s1 = "HelloWorld";
        assertEquals("[ab, cd, ef]", Arrays.toString(StringSplitRegex.solution(s)), "Should handle even string");
        assertEquals("[He, ll, oW, or, ld]", Arrays.toString(StringSplitRegex.solution(s1)), "Should handle even string");
    }

    @Test
    public void testOddString() {
        String s = "abcde";
        String s1 = "LovePizza";
        assertEquals("[ab, cd, e_]", Arrays.toString(StringSplitRegex.solution(s)), "Should handle odd string");
        assertEquals("[Lo, ve, Pi, zz, a_]", Arrays.toString(StringSplitRegex.solution(s1)), "Should handle odd string");
    }
}