package datastructures.tree;

public class LevelOrderTraversal {
	
	static Node queue[] = new Node[50];
	static int front = -1;
	static int rear = -1;
	
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
	
	public static void main(String[] args) {
		
		/*Code To Test the logic
		  Creating an example tree
		            M
				   / \
				  B   Q
				 / \   \
				A   C   Z
	    */
		
		Node root = null;
		root = insert(root, 'M');
		root = insert(root, 'B');
		root = insert(root, 'Q');
		root = insert(root, 'Z');
		root = insert(root, 'A');
		root = insert(root, 'C');
		
		levelOrderTraversal(root);
	}
	
	public static void levelOrderTraversal(Node root) {
		if(root == null)
			return;
		else {
			enqueue(root);
			while(!isEmpty()) {
				Node currentNode = front();
				System.out.print(currentNode.data + " ");
				if(currentNode.left != null)
					enqueue(currentNode.left);
				if(currentNode.right != null)
					enqueue(currentNode.right);
				dequeue();
			} 
		}
	}
	
	public static void enqueue(Node node) {
		if(isEmpty())
			front = rear = 0;
		else
			rear = rear + 1;
		queue[rear] = node;
	}
	
	public static boolean isEmpty() {
		if(front == -1 && rear == -1)
			return true;
		return false;
	}
	
	public static Node front() {
		if(isEmpty()) {
			System.err.println("Queue is empty");
			return null;
		}
		return queue[front];	
	}
	
	public static void dequeue() {
		if(front == rear) {
			front = rear = -1;
		}
		else
			front = front + 1;
	}

	public static Node insert(Node root, char value) {
		if(root == null)
			root = createNewNode(value);
		else if(value <= root.data)
			root.left = insert(root.left,value);
		else
			root.right = insert(root.right,value);
		
		return root;
	}

	public static Node createNewNode(char value) {
		Node newNode = new Node(value);
		newNode.left = null;
		newNode.right = null;
		return newNode;
	}
}
