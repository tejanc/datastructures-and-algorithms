package algorithm;

import algorithm.data.structures.TreeNode;

public class MaxPathSum {

	/**
	 * Input 1:

       1
      / \
     2   3

Output 1:
     6

Explanation 1:
    The path with maximum sum is: 2 -> 1 -> 3

Input 2:

       -10
       /  \
     -20  -30

Output 2:
    -10

Explanation 2
    The path with maximum sum is: -10
	 * @param a
	 * @return
	 */
	public int maxPathSum(TreeNode a) {
		Res res = new Res();
		res.val = Integer.MIN_VALUE;

		findMaxUtil(a, res);
		return res.val;
	}

	public class Res {
		public int val;
	}


	int findMaxUtil(TreeNode node, Res res)
	{


		if (node == null)
			return 0;

		int l = findMaxUtil(node.getLeft(), res);
		int r = findMaxUtil(node.getRight(), res);


		int max_single = Math.max(Math.max(l, r) + node.getVal(),
				node.getVal());

		int max_top = Math.max(max_single, l + r + node.getVal());


		res.val = Math.max(res.val, max_top);

		return max_single;
	}


}
