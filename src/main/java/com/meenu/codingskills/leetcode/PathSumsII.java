package com.meenu.codingskills.leetcode;

import java.util.ArrayList;
import java.util.List;

/*
 * Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.

Note: A leaf is a node with no children.

Example:

Given the below binary tree and sum = 22,

      5
     / \
    4   8
   /   / \
  11  13  4
 /  \    / \
7    2  5   1
Return:

[
   [5,4,11,2],
   [5,8,4,5]
]
 */

public class PathSumsII {
	
	class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }

	private List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> paths = new ArrayList<List<Integer>>();
        findPaths(root, sum, new ArrayList<Integer>(), paths);
        
        return paths;
    }
	
	private void findPaths(TreeNode root, int sum, List<Integer> current, List<List<Integer>> paths) {
		if(root == null)
			return;

		current.add(root.val);
		if(root.val == sum && root.left == null && root.right == null) {
			paths.add(current);
			return;
		}
		
		findPaths(root.left, sum - root.val, new ArrayList<Integer>(current), paths);
		findPaths(root.right, sum - root.val, new ArrayList<Integer>(current), paths);
	}
	
	public void findSolution() {
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(4);
		root.right = new TreeNode(8);
		root.left.left = new TreeNode(11);
		root.left.left.left = new TreeNode(7);
		root.left.left.right = new TreeNode(2);
		root.right.left = new TreeNode(13);
		root.right.right = new TreeNode(4);
		root.right.right.left = new TreeNode(5);
		root.right.right.right = new TreeNode(1);
		
		int sum = 22;
		
		List<List<Integer>> paths = pathSum(root, sum);
		for(List list : paths) {
			System.out.println(list);
		}
	}
}
