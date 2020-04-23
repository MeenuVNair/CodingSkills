package com.meenu.codingskills.leetcode.easy;

/*
 * Given two non-empty binary trees s and t, check whether tree t has exactly the same structure and node values with a subtree of s. A subtree of s is a tree consists of a node in s and all of this node's descendants. The tree s could also be considered as a subtree of itself.

Example 1:
Given tree s:

     3
    / \
   4   5
  / \
 1   2
Given tree t:
   4 
  / \
 1   2
Return true, because t has the same structure and node values with a subtree of s.
Example 2:
Given tree s:

     3
    / \
   4   5
  / \
 1   2
    /
   0
Given tree t:
   4
  / \
 1   2
Return false.
 */

/**
 * @author Meenu V Nair
 *
 */
public class SubtreeOfAnotherTree {

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
	
	private boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null)
        	return false;
        else if(isSameTree(s, t)) {
        	return true;
        }
        else {
        	return isSubtree(s.left, t) || isSubtree(s.right, t);
        }
    }
	
	private boolean isSameTree(TreeNode s, TreeNode t) {
		if(s == null || t == null)
			return s == t;
		
		else if(s.val == t.val) {
			return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
		}
		else
			return false;
	}
	
	public void findSolution() {
		TreeNode s = new TreeNode(3);
		s.left = new TreeNode(4);
		s.right = new TreeNode(5);
		s.left.left = new TreeNode(1);
		s.left.right = new TreeNode(2);
		
		TreeNode t = new TreeNode(4);
		t.left = new TreeNode(1);
		t.right = new TreeNode(2);
		
		/*TreeNode s = new TreeNode(3);
		s.left = new TreeNode(4);
		s.right = new TreeNode(5);
		s.left.left = new TreeNode(1);
		s.left.right = new TreeNode(2);
		s.left.right.left = new TreeNode(0);
		
		TreeNode t = new TreeNode(4);
		t.left = new TreeNode(1);
		t.right = new TreeNode(2);*/
		
		System.out.println("Is t a subtree of s ? " + isSubtree(s, t) );
	}
}
