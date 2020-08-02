package algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseIntegerTest {

	@Test
	public void test() {
		ReverseInteger i = new ReverseInteger();
		int reversed = i.reverse(1882889029);
		System.out.println("Reversed Number: " + reversed);
	}

}
