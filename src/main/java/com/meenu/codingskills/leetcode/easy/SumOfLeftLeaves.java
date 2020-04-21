package com.meenu.codingskills.leetcode.easy;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Find the sum of all left leaves in a given binary tree.

Example:

    3
   / \
  9  20
    /  \
   15   7

There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
 */

public class SumOfLeftLeaves {

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int value){
			val = value;
			left = null;
			right = null;
		}
	}
	
	
/********************** Second approach **************************/	
	
	private int sumOfLeftLeaves2(TreeNode root) {
        if(root == null)
        	return 0;
        else if(root.left != null && root.left.left == null && root.left.right == null)
        	return root.left.val + sumOfLeftLeaves(root.right);
        else
        	return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
	}
	
	
/********************** First approach ***************************/
	
	private int sumOfLeftLeaves(TreeNode root) {
        if(root == null)
        	return 0;
       
        int sum = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
        	TreeNode current = q.remove();
        	if(current.left != null) {
        		if(current.left.left == null && current.left.right == null)
        			sum += current.left.val;
        		q.add(current.left);
        	}
        	if(current.right != null)
        		q.add(current.right);
        }
        
        return sum;
    }
	
	public void findSolution() {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		
		/*TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.right.right = new TreeNode(5);*/
		
		int iterativeSum = sumOfLeftLeaves(root);
		int recurssiveSum = sumOfLeftLeaves2(root);
		
		System.out.println("Sum of left leaves (iterative approach) : " + iterativeSum);
		System.out.println("Sum of left leaves (recurssive approach) : " + recurssiveSum);
	}
}
