package algorithm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.sun.tools.javac.util.List;

public class BestTimeToBuyAndSellStocksTest {

	@Test
	public void test() {
		BestTimeToBuyAndSellStocks b = new BestTimeToBuyAndSellStocks();
		int maxProfit = b.maxProfit(List.of(1,2,6,1,4));
		assertEquals(8, maxProfit);
		
		maxProfit = b.maxProfit(List.of(1,2,3));
		assertEquals(2, maxProfit);
	}

}
