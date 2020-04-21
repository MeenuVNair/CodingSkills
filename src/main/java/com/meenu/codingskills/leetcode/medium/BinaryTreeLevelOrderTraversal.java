package com.meenu.codingskills.leetcode.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

/*
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]
 */
	static class TreeNode{
		int data;
		TreeNode left;
		TreeNode right;
		public TreeNode(int value) {
			data = value;
			left = null;
			right = null;
		}
	}
	
	private List<List<Integer>> levelOrder(TreeNode root){
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(root == null)
			return result;
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while(!queue.isEmpty()) {
			int size = queue.size();
			List<Integer> currentLevel = new ArrayList<Integer>();
			for(int i = 0; i < size ; i++) {
				TreeNode currentNode = queue.remove();
				currentLevel.add(currentNode.data);
				if(currentNode.left != null)
					queue.add(currentNode.left);
				if(currentNode.right != null)
					queue.add(currentNode.right);
			}
			result.add(currentLevel);
		}
		
		return result;
	}
	
	public void findSolution() {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		
		List<List<Integer>> result = levelOrder(root);
		for(List item : result) {
			System.out.println(item);		
		}
	}
	
}
