package kyu6.which_are_in;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class WhichAreInLoopTest {
	@Test
	public void test1() {
		String a[] = new String[]{ "arp", "live", "strong" };
    	String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
    	String r[] = new String[] { "arp", "live", "strong" };
		assertArrayEquals(r, WhichAreInLoop.inArray(a, b));
	}
}