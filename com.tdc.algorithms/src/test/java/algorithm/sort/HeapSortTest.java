package algorithm.sort;

import static org.junit.Assert.*;

import org.junit.Test;

import algorithm.sort.HeapSort;

public class HeapSortTest {

	@Test
	public void test() {
		int A[] = {22, 21, 3, 25, 26, 7};
		int n = A.length;

		HeapSort ob = new HeapSort();
		ob.sort(A);

		System.out.println("Sorted array is");
		ob.print_array(A);

	}

}
