package com.meenu.codingskills.leetcode.easy;

/*
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
 

But the following [1,2,2,null,3,null,3] is not:

    1
   / \
  2   2
   \   \
   3    3
 */


/**
 * @author Meenu V Nair
 *
 */
public class SymmetricTree {

	class TreeNode{
		int data;
		TreeNode left;
		TreeNode right;
		TreeNode(int value){
			data = value;
			left = null;
			right = null;
		}
	}
	
	private boolean isSymmetric(TreeNode root) {
       if(root == null)
    	   return true;
       
       return checkIfSymmetric(root.left, root.right);
    }
	
	private boolean checkIfSymmetric(TreeNode left, TreeNode right) {
		if(left == null || right == null) {
			return left == right;
		}
		if(left.data != right.data) {
			return false;
		}
		
		return checkIfSymmetric(left.left, right.right) && checkIfSymmetric(left.right, right.left);
	}

	public void findSolution() {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.right.left = new TreeNode(4);
		root.right.right = new TreeNode(3);
		
	 	/*TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(2);
		root.left.right = new TreeNode(3);
		root.right.right = new TreeNode(3);*/
		
		System.out.println("Is the given tree symmectric ? : " + isSymmetric(root));
		
    }
}
