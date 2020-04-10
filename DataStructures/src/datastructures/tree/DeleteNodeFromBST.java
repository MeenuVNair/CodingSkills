package datastructures.tree;

public class DeleteNodeFromBST {

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
		root = insert(root, 12);
		root = insert(root, 5);
		root = insert(root, 15);
		root = insert(root, 3);
		root = insert(root, 7);
		root = insert(root, 13);
		root = insert(root, 17);
		root = insert(root, 1);
		root = insert(root, 9);
		
		root = delete(root,15);
		System.out.println("Inorder : ");
		inorder(root);
	}
	
	public static Node delete(Node root, int value) {
		if(root == null)
			return root;
		else if(value < root.data)
			root.left = delete(root.left, value);
		else if(value > root.data)
			root.right = delete(root.right, value);
		else {
			//if no child node
			if(root.left == null && root.right == null)
				root = null;
			//if one child node
			else if(root.left == null)
				root = root.right;
			else if(root.right == null)
				root = root.left;
			else {
				// if 2 children
				Node tempNode = findMin(root.right);
				root.data = tempNode.data;
				root.right = delete(root.right,tempNode.data);
			}	
		}
		return root;
	}
	
	public static Node findMin(Node root) {
		if(root.left == null)
			return root;
		return findMin(root.left);
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
