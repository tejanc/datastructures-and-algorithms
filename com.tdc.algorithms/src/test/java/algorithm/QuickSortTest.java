package algorithm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import algorithm.sort.QuickSort;

public class QuickSortTest {

	@Test
	public void test() {
		int arr[] = {30, 22, 18, 19, 98, 99, 56, 74, 93, 22, 19, 9, 4, 73, 36};
		int n = arr.length;

		QuickSort qs = new QuickSort();
		qs.sort(arr, 0, n-1);
		assertNotNull(arr);

		qs.printArray(arr, n-1);

		
		int expected[] = {4,9,18,19,19,22,22,30,36,56,73,74,93,98,99};
		assertEquals(expected.length, arr.length);
		for (int i = 0; i < expected.length; i++) {
			assertEquals(expected[i], arr[i]);
		}
		
		

	}

}
