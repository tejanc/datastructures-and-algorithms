package algorithm;

import java.util.ArrayList;
import java.util.List;

import algorithm.data.structures.TreeNode;

public class UniqueBSTII {

	//	Given an integer A, how many structurally unique BST’s (binary search trees) exist that can store values 1…A?

	//Faster and space efficient.
	public int numTrees(int limit) {
        int[] dp = new int[limit + 1];
        dp[0] = dp[1] = 1;
        for (int n = 2; n <= limit; n++) {
            for (int root = 1; root <= n; root++) {
                dp[n] += dp[root - 1] * dp[n - root];
            }
        }
        return dp[limit];
    }

	//Slow but handles generation of any tree range
	public int numTrees(int start, int end) {
		return generateBSTs(start, end).size();
	}

	public List<TreeNode> generateBSTs(int start, int end) {
		
		List<TreeNode> list = new ArrayList<TreeNode>();

		if (start > end)  
		{  
			list.add(null);  
			return list;  
		}

		for (int i = start; i <= end; i++)  {
			List<TreeNode> leftSubTree = generateBSTs(start, i-1);
			List<TreeNode> rightSubTree = generateBSTs(i+1, end);
			for (int j = 0; j < leftSubTree.size(); j++)  
			{  
				TreeNode left = leftSubTree.get(j);  
				for (int k = 0; k < rightSubTree.size(); k++)  
				{  
					TreeNode right = rightSubTree.get(k);  
					TreeNode node = new TreeNode(i);        // making value i as root  
					node.setLeft(left);              // connect left subtree  
					node.setRight(right);            // connect right subtree  
					list.add(node);                // add this tree to list  
				}  
			}
		}
		return list;  
	}

	// A utility function to do pre-order traversal of BST  
	static void preorder(TreeNode root)  
	{  
		if (root != null)  
		{  
			System.out.print(root.getVal()+" ") ; 
			preorder(root.getLeft());  
			preorder(root.getRight());  
		}  
	}  
	
	
	static void printTrees(List<TreeNode> nodes) {
		 for (int i = 0; i < nodes.size(); i++)  
	        {  
	            preorder(nodes.get(i));  
	            System.out.println(); 
	        }  
	}
	

}
