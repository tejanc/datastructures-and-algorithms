package algorithm;

public class TwoSum {

	/*
	 * 	Given an array of integers, return indices of the two numbers such that they add up to a specific target.
	 *
	 *	You may assume that each input would have exactly one solution, and you may not use the same element twice.
	 *
	 *	Example:
	 *
	 *	Given nums = [2, 7, 11, 15], target = 9,
	 *
	 *	Because nums[0] + nums[1] = 2 + 7 = 9,
	 *	return [0, 1].
	 */
	
	//Runtime: 157 ms, faster than 5.02% of Java online submissions for Two Sum.
	//Memory Usage: 41.1 MB, less than 5.08% of Java online submissions for Two Sum.

	public int[] twoSum(int[] nums, int target) {
		int integers[] = new int[2];
		int sum = 0;
		boolean sumFound = false;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (i == j)
					continue;
				sum = nums[i] + nums[j];
				if (sum == target) {
					integers[0] = i;
					integers[1] = j;
					sumFound = true;
					break;
				}
			}
		}
		return integers;
	}


}
