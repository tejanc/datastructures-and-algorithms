package algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

public class FirstNonRepeatingCharTest {

	@Test
	public void test() {
		FirstNonRepeatingChar c = new FirstNonRepeatingChar();
		String solve = c.solve("aabcdbccck");
		System.out.println(solve);
		
	}

}
