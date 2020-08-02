package algorithm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import algorithm.data.structures.TreeNode;


public class ValidateBSTTest {

	@Test
	public void test() {
		ValidateBST v = new ValidateBST();
		TreeNode left = new TreeNode(8);
		TreeNode right = new TreeNode(35);
		TreeNode root = new TreeNode(19, left, right);
		
		int isValid = v.isValidBST(root);
		assertEquals(1, isValid);
		
		left = new TreeNode(100);
		right = new TreeNode(77);
		root = new TreeNode(88);
		
		isValid = v.isValidBST(root);
		assertEquals(1, isValid);
	}

}
