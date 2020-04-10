package com.meenu.codingskills.datastructures.linkedlist;

import com.meenu.codingskills.datastructures.linkedlist.LinkedList.Node;

public class ReverseWithRecurssion {
	static LinkedList list;
	public static void main(String[] args) {
		list = new LinkedList();
		list = insert(list, 10);
		list = insert(list, 20);
		list = insert(list, 30);
		list = insert(list, 40);
		list = insert(list, 50);
		
		System.out.println("Linked List : ");
		printLinkedList(list.head);
		System.out.println("null");
		
		System.out.println("\nReverse Linked List : ");
		reverse(list.head);
		printLinkedList(list.head);
		System.out.println("null");
	}
	
	public static LinkedList insert(LinkedList list, int data) {
		Node new_node = new Node(data);
		
		//check if list is empty
		if(list.head == null) {
			list.head = new_node;
		}
		else {
			Node current_node = list.head;
			while(current_node.next != null) {
				current_node = current_node.next;
			}
			current_node.next = new_node;
		}
		return list;
	}
	
	public static void printLinkedList(Node node) {
		if(node == null) {
			return;
		}
		System.out.print(node.data + " --> ");
		printLinkedList(node.next);
	}
	
	public static void reverse(Node node) {
		if(node.next == null) {
			list.head = node;
			return;
		}
		reverse(node.next);
		Node newNode = node.next;
		newNode.next = node;
		node.next = null;
	}

}
