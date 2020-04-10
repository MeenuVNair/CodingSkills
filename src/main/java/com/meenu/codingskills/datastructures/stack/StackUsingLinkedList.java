package com.meenu.codingskills.datastructures.stack;

public class StackUsingLinkedList {
	static Node top = null;
	static class Node{
		int data;
		Node next;
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	public static void push(int value) {
		Node node = new Node(value);
		node.next = top;
		top = node;
	}

	public static void pop() {
		if(top == null)
			return;
		Node node = top;
		top = node.next;
	}
	
	public static void main(String[] args) {
		push(10);
		print(top);
		push(20);
		print(top);
		push(30);
		print(top);
		pop();
		print(top);
	}
	
	public static void print(Node top) {
		System.out.println("\nStack : ");
		Node node = top;
		while(node != null) {
			System.out.print(node.data + " -- > ");
			node = node.next;
		}
		System.out.print("null");
	}
}
