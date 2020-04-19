package com.meenu.codingskills.leetcode;

import java.util.ArrayList;
import java.util.List;

/*
 * Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.

Note:
You may assume k is always valid, 1 ≤ k ≤ BST's total elements.

Example 1:

Input: root = [3,1,4,null,2], k = 1
   3
  / \
 1   4
  \
   2
Output: 1
Example 2:

Input: root = [5,3,6,2,4,null,null,1], k = 3
       5
      / \
     3   6
    / \
   2   4
  /
 1
Output: 3
 */

public class KthSmallestElementInBST {

	class TreeNode {
	     int val;
	     TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
	
	private int kthSmallest(TreeNode root, int k) {
		List<Integer> elements = new ArrayList<>();
		List<Integer> result = inorderTraversal(root, k, elements);
        return result.get(k - 1);
    }
	
	private List<Integer> inorderTraversal(TreeNode root, int k, List<Integer> elements) {
		if(root == null) {
			return elements;
		}
		if(elements.size() == k)
			return elements;
		if(root.left != null)
			inorderTraversal(root.left, k, elements);
		elements.add(root.val);
		if(root.right != null)
			inorderTraversal(root.right, k, elements);
		
		return elements;
		 
	}

	public void findSolution() {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(1);
		root.right = new TreeNode(4);
		root.left.right = new TreeNode(2);
		
		/*TreeNode root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.right = new TreeNode(6);
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(4);
		root.left.left.left = new TreeNode(1);*/
		
		int k = 1;
		int smallest = kthSmallest(root, k);
		System.out.println("kth smallest : " + smallest);
	}
}
