package algorithm;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class KthSmallestTest {

	@Test
	public void test() {
		int [] arr =  { 74, 90, 85, 58, 69, 77, 90, 85, 18, 36 };
		int expected = 18;
		int result;
		
		KthSmallest kthSmallest = new KthSmallest();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		result = kthSmallest.kthsmallest(list, 1);
		assertEquals(expected, result);
		list.clear();
	}

}
