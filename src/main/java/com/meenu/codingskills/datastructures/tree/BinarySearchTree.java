package com.meenu.codingskills.datastructures.tree;

public class BinarySearchTree {
	
	Node rootPtr;

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
	
}
