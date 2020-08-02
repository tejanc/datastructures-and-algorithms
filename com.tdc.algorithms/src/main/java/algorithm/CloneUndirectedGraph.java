package algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CloneUndirectedGraph {

	/**
	 * Definition for undirected graph.
	 * class UndirectedGraphNode {
	 *     int label;
	 *     List<UndirectedGraphNode> neighbors;
	 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
	 * };
	 */

	class UndirectedGraphNode {
		int label;
		List<UndirectedGraphNode> neighbors;
		UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
	};
	
	public class Solution {
		
		public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
	        HashMap<Integer, UndirectedGraphNode> labelsVisited = new HashMap<Integer, UndirectedGraphNode>();
	        return cloneGraph(node, labelsVisited);
	    }
	    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node, HashMap<Integer, UndirectedGraphNode> labelsVisited) {
	        if(labelsVisited.containsKey(node.label)){
	            return labelsVisited.get(node.label);
	        }
	        UndirectedGraphNode newNode = new UndirectedGraphNode(node.label);
	        labelsVisited.put(newNode.label,newNode);
	        for(UndirectedGraphNode each : node.neighbors){
	            newNode.neighbors.add(cloneGraph(each, labelsVisited));
	        }
	        return newNode;
	    }
	}

}
