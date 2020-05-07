package com.meenu.codingskills.thirtydaysofcode;

/*
 * Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

Example:
Given a binary tree
          1
         / \
        2   3
       / \     
      4   5    
Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].

Note: The length of path between two nodes is represented by the number of edges between them.
 */

/**
* @author Meenu V. Nair
*
 * Creation time: May 7, 2020 2:28:17 PM
*
*/

public class DiameterOfBinaryTree {

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode() {}
		TreeNode(int val) { 
			this.val = val; 
			left = null;
			right = null;
		}
		TreeNode(int val, TreeNode left, TreeNode right) {
		    this.val = val;
		    this.left = left;
		    this.right = right;
		}
	 }
	
	int diameter;
	
	private int diameterOfBinaryTree(TreeNode root) {
		diameter = 1;
        depth(root);
        return diameter - 1;
    }
	
	private int depth(TreeNode node) {
        if (node == null) return 0;
        int L = depth(node.left);
        int R = depth(node.right);
        diameter = Math.max(diameter, L+R+1);
        return Math.max(L, R) + 1;
    }

	public void findSolution() {
		/*TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);*/
		
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(1);
		root.left.right.left = new TreeNode(5);
		
		System.out.println("Diameter of binary tree : " + diameterOfBinaryTree(root));
	}
}
