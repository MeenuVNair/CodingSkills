package com.meenu.codingskills.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/*
 * Given a binary tree, return all root-to-leaf paths.

Note: A leaf is a node with no children.

Example:

Input:

   1
 /   \
2     3
 \
  5

Output: ["1->2->5", "1->3"]

Explanation: All root-to-leaf paths are: 1->2->5, 1->3
 */

/**
 * @author Meenu V Nair
 *
 */
public class BinaryTreePaths {

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
	
	private List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if(root == null)
        	return paths;
        
        dfs(root, "", paths);
        return paths;
    }
	
	private void dfs(TreeNode root, String path, List<String> paths) {
		path += root.val;
		
		if(root.left == null && root.right == null) {
			paths.add(path);
			return;
		}
		if(root.left != null) {
			dfs(root.left, path + "->", paths);
		}
		if(root.right != null)
		dfs(root.right, path + "->", paths);
	}
	
	public void findSolution() {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.right = new TreeNode(5);
		
		List<String> paths = binaryTreePaths(root);
		for(String s : paths) {
			System.out.println(s);
		}
	}
}
