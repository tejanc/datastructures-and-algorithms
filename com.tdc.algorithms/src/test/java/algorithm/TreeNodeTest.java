package algorithm;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import algorithm.data.structures.TreeNode;

public class TreeNodeTest {

	@Test
	public void test() {
		UniqueBSTII ubst = new UniqueBSTII();
		
		int start = 1, end = 5;
		List<TreeNode> list = new ArrayList<TreeNode>();
		list = ubst.generateBSTs(start, end);
		ubst.printTrees(list);
		System.out.println("There are " + ubst.numTrees(start, end) + " trees in this range.");
		System.out.println("There are " + ubst.numTrees(end) + " trees in this range.");
		
	}

}
