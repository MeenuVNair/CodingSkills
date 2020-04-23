package com.meenu.codingskills.leetcode.easy;

/*
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”

Given binary search tree:  root = [6,2,8,0,4,7,9,null,null,3,5]
				6
			/		\
		   2		8
		  /	\	   /  \
		 0	 4	   7   9
			/  \
			3	5	

Example 1:

Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
Output: 6
Explanation: The LCA of nodes 2 and 8 is 6.
Example 2:

Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
Output: 2
Explanation: The LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself according to the LCA definition.
 */

/**
 * @author Meenu V Nair
 *
 */
public class LowestCommonAncestorOfBST {

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
	
	private TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val < root.val && q.val < root.val) {
        	root = lowestCommonAncestor(root.left, p, q);
        }
        if(p.val > root.val && q.val > root.val) {
        	root = lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }
	
	public void findSolution() {
		TreeNode root = null;
		root = insert(root, 6);
		root = insert(root, 2);
		root = insert(root, 8);
		root = insert(root, 0);
		root = insert(root, 4);
		root = insert(root, 7);
		root = insert(root, 9);
		root = insert(root, 3);
		root = insert(root, 5);
		
		TreeNode p = new TreeNode(2);
		TreeNode q = new TreeNode(8);
		
		TreeNode lowestAncestor = lowestCommonAncestor(root, p, q);
		System.out.println("Lowest Ancestor : " + lowestAncestor.val);
	}
	
	private TreeNode insert(TreeNode root, int value) {
		TreeNode newNode = new TreeNode(value);
		if(root == null) {
			return newNode;
		}
		if(value < root.val) {
			root.left = insert(root.left, value);
		}
		if(value > root.val) {
			root.right = insert(root.right, value);
		}
		
		return root;
	}
}
