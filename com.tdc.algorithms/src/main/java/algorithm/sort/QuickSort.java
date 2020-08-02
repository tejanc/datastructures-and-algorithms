package algorithm.sort;

import java.util.List;

public class QuickSort extends Object{

	public QuickSort() {
		// TODO Auto-generated constructor stub
	}

	private int partition(int arr[], int low, int high) {

		int pivot = arr[high];
		int i = low-1; // index of smaller element.

		for(int j = low; j < high; j++) {
			if (arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;

		return i+1;
	}
	
	public int[] toIntArray(List<Integer> list) {
		int[] ret = new int[list.size()];
		for (int i = 0; i < ret.length; i++) {
			ret[i] = list.get(i);
		}
		return ret;
	}

	public void sort(int arr[], int low, int high) {

		if (low < high) {

			int partition = partition(arr, low, high);
			sort(arr, partition+1, high);
			sort(arr, low, partition-1);
		}

	}

	public void printArray(int[] arr, int n) {
		for (int i = 0; i <= n; ++i ) {
			System.out.print(arr[i]+",");
		}
	}

}
