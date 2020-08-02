package algorithm;


import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class AToITest {

	@Test
	public void test() {
		AToI aToI = new AToI();
		int d = AToI.atoi("-11281293D777277 23 3");
		assertEquals(-11281293, d);
	}

}
