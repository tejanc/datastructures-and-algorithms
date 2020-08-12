package algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringTest {

	@Test
	public void test() {
		String s = "Hello, my name is Tejan. What's yours?";
		ReverseString revString = new ReverseString();
		String reverse = revString.reverse(s);
		assertEquals(reverse, "?sruoy s'tahW .najeT si eman ym ,olleH");
	}

}
