package com.meenu.codingskills.datastructures.tree;

import com.meenu.codingskills.datastructures.tree.BinarySearchTree.Node;

public class HeightOfBinaryTree {
	
	public void findSolution() {
		Node root = null;
		root = insert(root, 15);
		root = insert(root, 10);
		root = insert(root, 20);
		root = insert(root, 8);
		root = insert(root, 12);
		root = insert(root, 17);
		root = insert(root, 25);
		root = insert(root, 11);
		root = insert(root, 19);
		root = insert(root, 18);
		
		System.out.println("Height of the tree : " + findHeight(root));
	}
	
	private int findHeight(Node root) {
		if(root == null)
			return -1;
		int leftHeight = findHeight(root.left);
		int rightHeight = findHeight(root.right);
		
		return Math.max(leftHeight, rightHeight) + 1;
	}

	private Node insert(Node root, int value) {
		if(root == null)
			root = createNewNode(value);
		else if(value <= root.data)
			root.left = insert(root.left,value);
		else
			root.right = insert(root.right,value);
		
		return root;
	}

	private Node createNewNode(int value) {
		Node newNode = new Node(value);
		newNode.left = null;
		newNode.right = null;
		return newNode;
	}
}
