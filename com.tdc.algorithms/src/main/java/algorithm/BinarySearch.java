package algorithm;

public class BinarySearch {

	// You can only use binary search on a sorted array. 
	public int binarySearch(int A[], int target) {
		int low = 0;
		int high = A.length-1;
		
		while (low <= high) {
			int middle = (low + high) / 2;
			if (target < A[middle]) {
				high = middle - 1;
			}
			else if (target > A[middle]) {
				low = middle + 1;
			}
			else {
				return middle;
			}
		}
		
		return -1;
	}
}
