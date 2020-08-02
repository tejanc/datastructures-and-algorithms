package algorithm;

import java.util.List;

import algorithm.sort.QuickSort;

public class KthSmallest {

	// DO NOT MODIFY THE LIST. IT IS READ ONLY
	public int kthsmallest(final List<Integer> A, int B) {
		QuickSort qs = new QuickSort();
		int [] arr = qs.toIntArray(A);
		qs.sort(arr, 0, arr.length-1);
		return arr[B-1];
	}

}
