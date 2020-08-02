package algorithm;

import java.util.ArrayList;

public class ConcentricArray {

    public ArrayList<ArrayList<Integer>> prettyPrint(int A) {
        int len = 2 * A - 1;
        
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>(len);
        
        for (int i = 0; i < len; ++i) {
            ArrayList<Integer> row = new ArrayList<Integer>(len);
            for (int j = 0; j < len; ++j) {
                row.add(Math.max(Math.abs(i-len/2), Math.abs(j-len/2))+1); 
            }
            res.add(row);
        }
        
        return res;
    }
    
    public void printArray(ArrayList<ArrayList<Integer>> array) {
    	for (int i = 0; i < array.size(); i++) {
			for (int j = 0; j < array.size(); j++) {
				int val = array.get(i).get(j);
				System.out.print(val + " ");
			}
			System.out.println();
		}
    }
}
