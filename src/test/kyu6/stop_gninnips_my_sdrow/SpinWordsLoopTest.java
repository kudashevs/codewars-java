package kyu6.stop_gninnips_my_sdrow;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SpinWordsLoopTest {
    @Test
    public void test() {
      assertEquals("emocleW", new SpinWordsLoop().spinWords("Welcome"));
      assertEquals("Hey wollef sroirraw", new SpinWordsLoop().spinWords("Hey fellow warriors"));
    }
}
