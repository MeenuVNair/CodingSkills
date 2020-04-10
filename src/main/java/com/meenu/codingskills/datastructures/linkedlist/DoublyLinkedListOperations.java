package com.meenu.codingskills.datastructures.linkedlist;

import com.meenu.codingskills.datastructures.linkedlist.DoublyLinkedList.Node;

public class DoublyLinkedListOperations {

	public static void main(String[] args) {
		Node head = null;
		head = insert(head, 10);
		head = insert(head, 20);
		head = insert(head, 30);
		head = insert(head, 40);
		
		System.out.println("Doubly linked list : ");
		System.out.print("null --> ");
		printLinkedList(head);
		System.out.print("null\n");
		
		System.out.println("\nAfter inserting 25 : ");
		head = insertAfterGivenNode(head, 20, 25);
		System.out.print("null --> ");
		printLinkedList(head);
		System.out.print("null\n");
		
		System.out.println("After inserting 5 : ");
		head = insertBeforeGivenNode(head, 10, 5);
		System.out.print("null --> ");
		printLinkedList(head);
		System.out.print("null\n");
		
		
	}
	
	public static Node insertBeforeGivenNode(Node node, int oldValue, int newValue) {
		Node head = node;
		Node newNode = new Node(newValue);
		newNode.next = null;
		newNode.prev = null;
		
		if(head == null) {
			head = newNode;
			return head;
		}
		else {
			while(node.next != null) {
				if(node.data.equals(oldValue)) {
					newNode.prev = node.prev;
					newNode.next = node;
					if(node.prev != null)
						node.prev.next = newNode;
					else
						head = newNode;
					node.prev = newNode;
				}
				node = node.next;
			}
			if(node != null && node.data.equals(oldValue)) {
				newNode.next = node;
				newNode.prev = node.prev;
				node.prev = newNode;
				head = newNode;
			}
		}
		
		return head;
	}
	
	public static Node insertAfterGivenNode(Node node, int oldValue, int newValue) {
		Node head = node;
		Node newNode = new Node(newValue);
		newNode.prev = null;
		newNode.next = null;
		
		if(head == null) {
			head = newNode;
			return head;
		}
		else {
			while(node.next != null) {
				if(node.data.equals(oldValue)) {
					newNode.next = node.next;
					newNode.prev = node;
					node.next.prev = newNode;
					node.next = newNode;
				}
				node = node.next;
			}
			if(node != null && node.data.equals(oldValue)) {
				node.next = newNode;
				newNode.prev = node;
				newNode.next = null;
			}
		}
		
		return head;
	}

	public static Node insert(Node node, int value) {
		
		Node head = node;
		Node newNode = new Node(value);
		newNode.prev = null;
		newNode.next = null;
		
		if(node == null) {
			node = newNode;
			return node;
		}
		else {
			while(node.next != null) {
				node = node.next;
			}
			newNode.prev = node;
			node.next = newNode;
			newNode.next = null;
		}
		
		return head;
	}
	
	public static void printLinkedList(Node node) {
		while(node != null) {
			System.out.print(node.data + " -- > ");
			node = node.next;
		}
	}
}
