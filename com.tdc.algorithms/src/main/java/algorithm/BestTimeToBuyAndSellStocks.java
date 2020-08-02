package algorithm;

import java.util.List;

public class BestTimeToBuyAndSellStocks {

	/**
	 * Observation based solution:
	Note 1: I will never buy a stock and sell it in loss.
	Note 2: If A[i] < A[i+1], I will always buy a stock on i and sell it on i+1. 
	Think and try to come up with a proof on the validity of the statement.
	
	DP based solution:
	Let Dp[i] = max profit you can gain in region (i,i+1,….,n).
	Then Dp[i] = max(Dp[i+1],-A[i] + max( A[j]+Dp[j] st j > i ) )
	Can you come up with base cases and direction of computation now?
	 * @param A
	 * @return int
	 */

	public int maxProfit(final List<Integer> A) {
		if(A.size()<=1){
			return 0;
		}
		int profit = 0;
		for(int i=1;i<A.size();i++){
			if(A.get(i)>A.get(i-1)){
				profit += A.get(i)-A.get(i-1);
			}
		}
		return profit;
	}

}
