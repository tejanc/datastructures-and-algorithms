package algorithm;

import java.util.LinkedList;

import algorithm.data.structures.TreeNode;

public class ValidateBST {

	LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
	LinkedList<Integer> uppers = new LinkedList<Integer>(),
			lowers = new LinkedList<Integer>();

	public void update(TreeNode root, Integer lower, Integer upper) {
		stack.add(root);
		lowers.add(lower);
		uppers.add(upper);
	}

	public int isValidBST(TreeNode root) {
		Integer lower = null, upper = null, val;
		update(root, lower, upper);

		while (!stack.isEmpty()) {
			root = stack.poll();
			lower = lowers.poll();
			upper = uppers.poll();

			if (root == null) continue;
			val = root.getVal();
			if (lower != null && val <= lower) return 0;
			if (upper != null && val >= upper) return 0;
			update(root.getRight(), val, upper);
			update(root.getLeft(), lower, val);
		}
		return 1;
	}
}
