package kyu6.stop_gninnips_my_sdrow;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SpinWordsMapTest {
    @Test
    public void test() {
      assertEquals("emocleW", new SpinWordsMap().spinWords("Welcome"));
      assertEquals("Hey wollef sroirraw", new SpinWordsMap().spinWords("Hey fellow warriors"));
    }
}
