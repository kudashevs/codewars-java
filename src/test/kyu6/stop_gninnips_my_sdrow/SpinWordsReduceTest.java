package kyu6.stop_gninnips_my_sdrow;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SpinWordsReduceTest {
    @Test
    public void test() {
      assertEquals("emocleW", new SpinWordsReduce().spinWords("Welcome"));
      assertEquals("Hey wollef sroirraw", new SpinWordsReduce().spinWords("Hey fellow warriors"));
    }
}
