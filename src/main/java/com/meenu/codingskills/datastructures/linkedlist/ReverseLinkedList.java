package com.meenu.codingskills.datastructures.linkedlist;

import com.meenu.codingskills.datastructures.linkedlist.LinkedList.Node;

public class ReverseLinkedList {
	
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

	public static void printLinkedList(LinkedList list) {
		Node current_node = list.head;
		while(current_node != null) {
			System.out.print(current_node.data + " --> ");
			current_node = current_node.next;
		}
		System.out.println("null");
	}
	
	public static LinkedList reverse(LinkedList list) {
		Node current_node, prev_node, next_node;
		current_node = list.head;
		prev_node = null;  next_node = null;
		
		while(current_node != null) {
			next_node = current_node.next;
			current_node.next = prev_node;
			prev_node = current_node;
			current_node = next_node;
		}
		list.head = prev_node;
		
		return list;
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list = insert(list, 10);
		list = insert(list, 20);
		list = insert(list, 30);
		list = insert(list, 40);
		list = insert(list, 50);
		
		System.out.println("Linked List : ");
		printLinkedList(list);
		
		System.out.println("\nReverse Linked List : ");
		reverse(list);
		printLinkedList(list);
	}

}
