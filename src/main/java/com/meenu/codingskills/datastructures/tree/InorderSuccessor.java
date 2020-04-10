package com.meenu.codingskills.datastructures.tree;

public class InorderSuccessor {

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
	
	public static void main(String[] args) {
		Node root = null;
		root = insert(root, 15);
		root = insert(root, 10);
		root = insert(root, 20);
		root = insert(root, 8);
		root = insert(root, 12);
		root = insert(root, 17);
		root = insert(root, 25);
		root = insert(root, 6);
		root = insert(root, 11);
		root = insert(root, 16);
		root = insert(root, 27);
		
		System.out.println("Inorder traversal : ");
		inorder(root);
		
		Node successor = getSuccessor(root, 12);
		if(successor == null)
			System.out.println("\nNo successor found");
		else
			System.out.println("\nSuccessor : " + successor.data);
	}
	
	public static Node getSuccessor(Node root, int value) {
		Node current = findNode(root, value);
		if(current == null)
			return null;
		//if has right subtree
		if(current.right != null)
			return findMin(current.right);
		//if no right subtree
		else {
			Node successor = null;
			Node ancestor = root;
			while(current != ancestor) {
				if(current.data < ancestor.data) {
					successor = ancestor;
					ancestor = ancestor.left;
				}
				else
					ancestor = ancestor.right;
			}
			return successor;
		}
	}
	
	public static Node findMin(Node root) {
		if(root == null)
			return root;
		while(root.left != null)
			root = root.left;
		return root;
	}
	
	public static Node findNode(Node root, int value) {
		if(root == null)
			return null;
		else if(root.data == value)
			return root;
		else if(value < root.data)
			return findNode(root.left, value);
		else
			return findNode(root.right, value);
	}
	
	public static Node createNewNode(int value) {
		Node newNode = new Node(value);
		newNode.left = null;
		newNode.right = null;
		return newNode;
	}
	
	public static Node insert(Node rootPtr, int value) {
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
	
	//Function to visit nodes in Inorder
		public static void inorder(Node root) {
			if(root == null) return;
		 
			inorder(root.left);       //Visit left subtree
			System.out.print(root.data + " ");  //Print data
			inorder(root.right);      // Visit right subtree
		}
}
