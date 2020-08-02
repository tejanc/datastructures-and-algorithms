package algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseBitsTest {

	@Test
	public void test() {
		ReverseBits rb = new ReverseBits();
		
		long val, ret;
		
		val = 3l;
		ret = rb.reverseBitWise(val);
		assertEquals(3221225472l, ret);
		
		val = 0l;
		ret = rb.reverseBitWise(val);
		assertEquals(0l, ret);
		
	}

}
