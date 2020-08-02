package algorithm.data.structures;

public class TreeNode {
	private int val;
	private TreeNode left;
	private TreeNode right;
	public TreeNode() {}
	public TreeNode(int val) { this.setVal(val); }
	public TreeNode(int val, TreeNode left, TreeNode right) {
		this.setVal(val);
		this.setLeft(left);
		this.setRight(right);
	}
	public TreeNode getLeft() {
		return left;
	}
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	public TreeNode getRight() {
		return right;
	}
	public void setRight(TreeNode right) {
		this.right = right;
	}
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
}
