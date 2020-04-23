package com.meenu.codingskills.leetcode.easy;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Given the root node of a binary search tree, return the sum of values of all nodes with value between L and R (inclusive).

The binary search tree is guaranteed to have unique values.

 

Example 1:

Input: root = [10,5,15,3,7,null,18], L = 7, R = 15
Output: 32
Example 2:

Input: root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
Output: 23
 */

/**
 * @author Meenu V Nair
 *
 */
public class RangeSumOfBST {

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
	
	private int rangeSumBST(TreeNode root, int L, int R) {
        int sum = 0;
        if(root == null)
        	return sum;
        
 /**********************************  recursive method  ******************************/
        
        //return calculateSum(root, L, R, 0);
        
        
        
/***********************************  iterative method  ******************************/
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
        	TreeNode current = q.remove();
        	if(current.val >= L && current.val <= R)
        		sum += current.val;
        	if(current.left != null && current.val > L)
        		q.add(current.left);
        	if(current.right != null && current.val < R)
        		q.add(current.right);
        }
        return sum;
    }
	
	/*private int calculateSum(TreeNode root, int L, int R, int sum) {
		if(root == null)
			return sum;
		if(root.val >= L && root.val <= R) {
			sum += root.val;
		}
		sum = calculateSum(root.left, L, R, sum);
		sum = calculateSum(root.right, L, R, sum);
		return sum;
	}*/
	
	public void findSolution() {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.right = new TreeNode(15);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(7);
		root.right.right = new TreeNode(18);
		int L = 7;
		int R = 15;
		
		/*TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.right = new TreeNode(15);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(7);
		root.right.left = new TreeNode(13);
		root.right.right = new TreeNode(18);
		root.left.left.left = new TreeNode(1);
		root.right.right.left = new TreeNode(6);
		int L = 6;
		int R = 10; */
		
		int sum = rangeSumBST(root, L, R);
		System.out.println("Range sum : " + sum);
	}
}
