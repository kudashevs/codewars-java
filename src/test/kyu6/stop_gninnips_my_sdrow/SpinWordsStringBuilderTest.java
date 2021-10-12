package kyu6.stop_gninnips_my_sdrow;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SpinWordsStringBuilderTest {
    @Test
    public void test() {
      assertEquals("emocleW", new SpinWordsStringBuilder().spinWords("Welcome"));
      assertEquals("Hey wollef sroirraw", new SpinWordsStringBuilder().spinWords("Hey fellow warriors"));
    }
}
