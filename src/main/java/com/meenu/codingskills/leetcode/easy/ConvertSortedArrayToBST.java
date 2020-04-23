package com.meenu.codingskills.leetcode.easy;

/*
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

Example:

Given the sorted array: [-10,-3,0,5,9],

One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:

      0
     / \
   -3   9
   /   /
 -10  5
 */

/**
 * @author Meenu V Nair
 *
 */
public class ConvertSortedArrayToBST {

	class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int value){
			val = value;
			left = null;
			right = null;
		}
	}
	
	private TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0)
        	return null;
        
        return constructBST(nums, 0, nums.length - 1); 
    }
	
	private TreeNode constructBST(int[] nums, int left, int right) {
		if(left > right)
			return null;
		
		int mid = left + (right - left) / 2;
		TreeNode current = new TreeNode(nums[mid]);
		current.left = constructBST(nums, left, mid - 1);
		current.right = constructBST(nums, mid + 1, right);
		return current;
	}
	
	public void findSolution() {
		int nums[] = new int[] {-10,-3,0,5,9};
		TreeNode root = sortedArrayToBST(nums);
		printTree(root);
	}
	
	private void printTree(TreeNode root) {
		if(root == null)
			return;
		printTree(root.left);
		System.out.print(root.val + "  ");
		printTree(root.right);
	}
}
