package datastructures.tree;

import datastructures.tree.BinarySearchTree.Node;

public class BSTOperations {

	public static void main(String[] args) {
		Node rootPtr = null;
		rootPtr = insert(rootPtr, 15);
		rootPtr = insert(rootPtr, 10);
		rootPtr = insert(rootPtr, 20);
		rootPtr = insert(rootPtr, 25);
		rootPtr = insert(rootPtr, 8);
		rootPtr = insert(rootPtr, 12);
		
		print(rootPtr);
		
		if(search(rootPtr,2) == true)
			System.out.println("Search 2 : Found");
		else
			System.out.println("Search 2 : Not found");
		
		if(search(rootPtr,20) == true)
			System.out.println("Search 20 : Found");
		else
			System.out.println("Search 20 : Not found");
		
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
	
	public static boolean search(Node rootPtr, int value) {
		if(rootPtr == null)
			return false;
		if((int)rootPtr.data == value)
			return true;
		else if(value <= (int)rootPtr.data)
			return search(rootPtr.left, value);
		else
			return search(rootPtr.right, value);
	}
	
	public static void print(Node rootPtr) {
		if(rootPtr == null)
			return;
		System.out.println(rootPtr.data);
		print(rootPtr.left);
		print(rootPtr.right);
	}
}
