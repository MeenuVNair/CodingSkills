package com.meenu.codingskills.leetcode.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * Given two binary trees, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical and the nodes have the same value.

Example 1:

Input:     1         1
          / \       / \
         2   3     2   3

        [1,2,3],   [1,2,3]

Output: true
Example 2:

Input:     1         1
          /           \
         2             2

        [1,2],     [1,null,2]

Output: false
Example 3:

Input:     1         1
          / \       / \
         2   1     1   2

        [1,2,1],   [1,1,2]

Output: false
 */

/**
 * @author Meenu V Nair
 *
 */
public class SameTree {

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
	
	private boolean isSameTree(TreeNode p, TreeNode q) {
		if(p == null || q == null)
			return p == q;
		if(p.val != q.val)
			return false;
		
		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	}
	
/********************* Second Approach - Iterative ***********************/
	
	/*private boolean isSameTree(TreeNode p, TreeNode q) {
		if(p == null || q == null)
			return p == q;
		
		Queue<TreeNode> queueForP = new LinkedList<>();
		Queue<TreeNode> queueForQ = new LinkedList<>();
		
		queueForP.add(p);
		queueForQ.add(q);
		
		boolean same = true;
		
		while(!queueForP.isEmpty() && !queueForQ.isEmpty()) {
			TreeNode currentNodeOfP = queueForP.remove();
			TreeNode currentNodeOfQ = queueForQ.remove();
			if(currentNodeOfP == null || currentNodeOfQ == null) {
				same = (currentNodeOfP == currentNodeOfQ);
				if(!same)
					break;
			}
			else if (currentNodeOfP.val != currentNodeOfQ.val) {
				same = false;
				break;
			}
			if(currentNodeOfP.left != null && currentNodeOfQ.left != null) {
				if(currentNodeOfP.left.val == currentNodeOfQ.left.val) {
					queueForP.add(currentNodeOfP.left);
					queueForQ.add(currentNodeOfQ.left);
				}
				else {
					same = false;
					break;
				}
				
			}
			else if((currentNodeOfP.left != null && currentNodeOfQ.left == null) || (currentNodeOfP.left == null && currentNodeOfQ.left != null)){
				same = false;
				break;
			}
			if(currentNodeOfP.right != null && currentNodeOfQ.right != null) {
				if(currentNodeOfP.right.val == currentNodeOfQ.right.val) {
					queueForP.add(currentNodeOfP.right);
					queueForQ.add(currentNodeOfQ.right);
				}
				else {
					same = false;
					break;
				}
				
			}
			else if((currentNodeOfP.right != null && currentNodeOfQ.right == null) || (currentNodeOfP.right == null && currentNodeOfQ.right != null)){
				same = false;
				break;
			}
		}
		
		if(same)
			return true;
		return false;
	}*/
	
/********************* First Approach ************************************/
	
	/*private boolean isSameTree(TreeNode p, TreeNode q) {
		if(p == null || q == null)
			return p == q;
		
        List<Integer> inorderListOfp = getInorderOfTree(p);
        List<Integer> inorderListOfq = getInorderOfTree(q);
        
        if(inorderListOfp.equals(inorderListOfq))
        	return true;
       
        return false;
    }
	
	private List<Integer> getInorderOfTree(TreeNode root){
		List<Integer> list = new ArrayList<>();
		
		Queue<TreeNode> queue = new LinkedList<>();
		
		queue.add(root);
		list.add(root.val);
		while(!queue.isEmpty()) {
			TreeNode current = queue.remove();
			//list.add(current.val);
			if(current.left == null)
				list.add(null);
			else {
				list.add(current.left.val);
				queue.add(current.left);
			}
			if(current.right == null)
				list.add(null);
			else {
				list.add(current.right.val);
				queue.add(current.right);
			}
		}
		return list;
	}*/

	public void findSolution() {
		
		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
		p.right = new TreeNode(3);
		
		TreeNode q = new TreeNode(1);
		q.left = new TreeNode(2);
		q.right = new TreeNode(3);
		
		/*TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
		
		TreeNode q = new TreeNode(1);
		q.right = new TreeNode(2);*/
		
		/*TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
		p.right = new TreeNode(1);
		
		TreeNode q = new TreeNode(1);
		q.left = new TreeNode(1);
		q.right = new TreeNode(2);*/
		
		/*TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
		
		TreeNode q = new TreeNode(1);
		q.right = new TreeNode(2);*/
		
		System.out.println("isSameTree() : " + isSameTree(p, q));
	}
}
