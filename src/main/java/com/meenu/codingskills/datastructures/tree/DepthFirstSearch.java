package com.meenu.codingskills.datastructures.tree;

/**
 * @author Meenu V Nair
 *
 */
public class DepthFirstSearch {

	static class Node{
		char data;
		Node left;
		Node right;
		public Node(char value) {
			data = value;
			left = null;
			right = null;
		}
	}
	
	public void findSolution() {
		/*Tree
					   F
					 /	\
				   D	  J
				  /	\	 / \
				  B  E	 G	K
				/  \   	  \
				A	C	   I
		*/
		
		Node root = null;
		root = insert(root, 'F');
		root = insert(root, 'D');
		root = insert(root, 'J');
		root = insert(root, 'B');
		root = insert(root, 'E');
		root = insert(root, 'G');
		root = insert(root, 'K');
		root = insert(root, 'A');
		root = insert(root, 'C');
		root = insert(root, 'I');
		
		System.out.print("Pre-order : ");
		preOrderTraversal(root);
		
		System.out.print("\nIn-order : ");
		inOrderTraversal(root);
		
		System.out.print("\nPost-order : ");
		postOrderTraversal(root);
	}
	
	private void preOrderTraversal(Node root) {
		if(root == null)
			return;
		System.out.print(root.data + " ");
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}
	
	private void inOrderTraversal(Node root) {
		if(root == null)
			return;
		inOrderTraversal(root.left);
		System.out.print(root.data + " ");
		inOrderTraversal(root.right);
	}
	
	private void postOrderTraversal(Node root) {
		if(root == null)
			return;
		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.print(root.data + " ");
	}
	
	private Node insert(Node root, char value) {
		if(root == null)
			root = createNewNode(value);
		else if(value <= root.data)
			root.left = insert(root.left,value);
		else
			root.right = insert(root.right,value);
		
		return root;
	}

	private Node createNewNode(char value) {
		Node newNode = new Node(value);
		newNode.left = null;
		newNode.right = null;
		return newNode;
	}

}
