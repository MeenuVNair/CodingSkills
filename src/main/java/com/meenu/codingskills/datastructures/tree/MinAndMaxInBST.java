package com.meenu.codingskills.datastructures.tree;

import com.meenu.codingskills.datastructures.tree.BinarySearchTree.Node;

/**
 * @author Meenu V Nair
 *
 */
public class MinAndMaxInBST {

	public void findSolution() {
		Node root = null;
		root = insert(root, 15);
		root = insert(root, 10);
		root = insert(root, 20);
		root = insert(root, 8);
		root = insert(root, 12);
		root = insert(root, 17);
		root = insert(root, 25);
		
		int minElement = findMinElement(root);
		int maxElement = findMaxElement(root);
		
		System.out.println("Min with iterative approach : " + minElement);
		System.out.println("Max with iterative approach : " + maxElement);
		
		int minRecurssive = findMinRecurssive(root);
		int maxRecurssive = findMaxRecurssive(root);
		
		System.out.println("Min with recurssive approach : " + minRecurssive);
		System.out.println("Max with recurssive approach : " + maxRecurssive);
	}
	
	private int findMinRecurssive(Node root) {
		if(root == null) {
			System.err.println("Tree is empty");
			return -1;
		}
		else if(root.left == null)
			return root.data;
		return findMinRecurssive(root.left);
	}
	
	private int findMaxRecurssive(Node root) {
		if(root == null) {
			System.err.println("Tree is empty");
			return -1;
		}
		else if(root.right == null)
			return root.data;
		return findMaxRecurssive(root.right);
	}
	
	private int findMinElement(Node root) {
		if(root == null) {
			System.err.println("Tree is empty");
			return -1;
		}
		while(root.left != null) {
			root = root.left;
		}
		return root.data;
	}
	
	private int findMaxElement(Node root) {
		if(root == null) {
			System.err.println("Tree is empty");
			return -1;
		}
		while(root.right!= null) {
			root = root.right;
		}
		return root.data;
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
