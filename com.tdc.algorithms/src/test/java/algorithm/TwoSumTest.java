package algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

public class TwoSumTest {

	@Test
	public void test() {
		int nums[] = {2, 7, 11, 15};
		int target = 18;
		TwoSum twoSum = new TwoSum();
		int[] result = twoSum.twoSum(nums, target);
		System.out.println(result[0] + " " + result[1]);
	}

}
