package com.meenu.codingskills.datastructures.tree;

// Check if the given binary tree is a binary search tree

/**
 * @author Meenu V Nair
 *
 */
public class CheckIfBinarySearchTree {

	static class Node{
		int data;
		Node left;
		Node right;
		public Node(int value) {
			data = value;
			left = null;
			right = null;
		}
	}
	
	public void findSolution() {
		Node root = null;
		root = insert(root, 15);
		root = insert(root, 10);
		root = insert(root, 20);
		root = insert(root, 25);
		root = insert(root, 8);
		root = insert(root, 12);
		
		System.out.println("Is binary search tree ? : " + isBinarySearchTree(root));
	}
	
	private boolean isBinarySearchTree(Node root) {
		return isBinarySearchTreeUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	private boolean isBinarySearchTreeUtil(Node root, int minValue, int maxValue) {
		if(root == null)
			return true;
		if(root.data > minValue && root.data < maxValue 
				&& isBinarySearchTreeUtil(root.left, minValue, root.data)
				&& isBinarySearchTreeUtil(root.right, root.data, maxValue))
			return true;
		else
			return false;
	}

	private Node createNewNode(int value) {
		Node newNode = new Node(value);
		newNode.left = null;
		newNode.right = null;
		return newNode;
	}
	
	private Node insert(Node rootPtr, int value) {
		if(rootPtr == null) {
			rootPtr = createNewNode(value);
		}
		else if(value <= (int)rootPtr.data){
			rootPtr.left = insert(rootPtr.left, value);
		}
		else
			rootPtr.right = insert(rootPtr.right, value);
		return rootPtr;
	}
}
