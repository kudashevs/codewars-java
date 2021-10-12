package kyu6.stop_gninnips_my_sdrow;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SpinWordsRegexTest {
    @Test
    public void test() {
      assertEquals("emocleW", new SpinWordsRegex().spinWords("Welcome"));
      assertEquals("Hey wollef sroirraw", new SpinWordsRegex().spinWords("Hey fellow warriors"));
    }
}
