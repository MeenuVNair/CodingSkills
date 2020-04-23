package com.meenu.codingskills.leetcode.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

Example:

Input: [1,2,3,null,5,null,4]
Output: [1, 3, 4]
Explanation:

   1            <---
 /   \
2     3         <---
 \     \
  5     4       <---
 */


/**
 * @author Meenu V Nair
 *
 */
public class BinaryTreeRightSideView {
	
	class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}
	
	private List<Integer> rightSideView(TreeNode root) {
        List<Integer> viewList = new ArrayList<>();
		if(root == null)
			return viewList;
		
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			int size = queue.size();
			for(int i = 0; i < size; i++) {
				TreeNode currentNode = queue.remove();
				if(i == size - 1) {
					viewList.add(currentNode.val);
				}
				if(currentNode.left != null) {
					queue.add(currentNode.left);
				}
				if(currentNode.right != null)
					queue.add(currentNode.right);
			}
		}
		return viewList;
    }
	

	public void findSolution() {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.right = new TreeNode(5);
		root.right.right = new TreeNode(4);
		
		List<Integer> rightSideView = rightSideView(root);
		for(Integer i : rightSideView) {
			System.out.print(i + " ");
		}
	}
}
