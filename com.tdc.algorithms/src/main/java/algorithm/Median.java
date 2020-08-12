package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Median {

	public  double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {
		List<Integer> mergedList = new ArrayList<Integer>();
		if (!a.isEmpty()) {
			mergedList.addAll(a);
		}
		if (!b.isEmpty()) {
			mergedList.addAll(b);
		}

		if (!a.isEmpty() && !b.isEmpty()) {
			Collections.sort(mergedList);
		}
		
		System.out.println(mergedList);

		int n = mergedList.size();
		if (n % 2 == 0) {
			double left = mergedList.get((n-1)/2);
			double right = mergedList.get((n-1)/2 + 1);
			double x = (left + right ) / 2;
			return x;
		} else {
			if (n == 1){
				return mergedList.get(0);
			}    
			return mergedList.get((n-1)/2);
		}
	}
	
	public double findMedianSortedArrays2(final List<Integer> A, final List<Integer> B) {
	    int len = A.size() + B.size();
	    if(len % 2 == 1) return findKth(A, 0, B, 0, len / 2 + 1);
	    else return (findKth(A, 0, B, 0, len / 2) + findKth(A, 0, B, 0, len / 2 + 1)) / 2.0;
	}
	
	public int findKth(List<Integer> A, int A_start, List<Integer> B, int B_start, int k){
	    if(A_start >= A.size()) return B.get(B_start + k - 1);
	    if(B_start >= B.size()) return A.get(A_start + k - 1);
	    if(k == 1) return Math.min(A.get(A_start), B.get(B_start));
	    
	    int A_key = A_start + k / 2 - 1 < A.size() ? A.get(A_start + k / 2 - 1) : Integer.MAX_VALUE;
	    int B_key = B_start + k / 2 - 1 < B.size() ? B.get(B_start + k / 2 - 1) : Integer.MAX_VALUE;
	    
	    if(A_key < B_key){
	        return findKth(A, A_start + k / 2, B, B_start, k - k / 2);
	    }
	    else
	       return findKth(A, A_start, B, B_start + k / 2, k - k / 2);
	}
	
    public int findMedian(ArrayList<ArrayList<Integer>> A) {
        List<Integer> mergedList = new ArrayList<Integer>();
        int n = 0;
        
        for(int i = 0; i < A.size(); i++) {
            for(int j = 0; j < A.get(i).size(); j++) {
            	n++;
            	mergedList.add(A.get(i).get(j));
            }
        }
        Collections.sort(mergedList);
        System.out.println(mergedList);
        
        
        if (n % 2 == 1) {
            return mergedList.get((n-1) / 2);
        } else {
            double left = mergedList.get((n-1)/2);
			double right = mergedList.get((n-1)/2 + 1);
			double x =(left+right)/2;
			return (int)x;
        }
        
    }


}
