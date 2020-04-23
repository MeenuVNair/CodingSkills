package com.meenu.codingskills.datastructures.linkedlist;

import com.meenu.codingskills.datastructures.linkedlist.LinkedList.Node;

/**
 * @author Meenu V Nair
 *
 */
public class LinkedListOperations {

	private LinkedList insertFirst(LinkedList list, int data) {
		Node new_node = new Node(data);
		new_node.next = null;
		
		if(list.head != null) {
			new_node.next = list.head;
			list.head = new_node;
		}
		else {
			list.head = new_node;
		}
		return list;
	}
	
	private LinkedList insertLast(LinkedList list, int data) {
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
	
	private LinkedList insertAfterNode(LinkedList list, int old_data, int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = null;
		
		if(list.head == null) {
			list.head = new_node;
		}
		else {
			Node current_node = list.head;
			
			while(current_node.next != null) {
				if(current_node.data.equals(old_data)) {
					new_node.next = current_node.next;
					current_node.next = new_node;
					break;
				}
				current_node = current_node.next;
			}
			if(current_node.data.equals(old_data) && current_node.next == null) {
				new_node.next = null;
				current_node.next = new_node;
				return list;
			}
		}
		return list;
	}
	
	private LinkedList insertBeforeNode(LinkedList list, int old_data, int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = null;
		
		if(list.head == null) {
			list.head = new_node;
		}
		else {
			if(list.head.data.equals(old_data)) {
				new_node.next = list.head;
				list.head = new_node;
				return list;
			}
			else {
				Node current_node = list.head;
				Node prev_node = null;;
				
				while(current_node.next != null) {
					prev_node = current_node;
					current_node = current_node.next;
					if(current_node.data.equals(old_data)) {
						new_node.next = current_node;
						prev_node.next = new_node;
						break;
					}
				}
			}
		}
		
		return list;
	}
	
	private void printLinkedList(LinkedList list) {
		Node current_node = list.head;
		System.out.println("Linked List : ");
		while(current_node != null) {
			System.out.print(current_node.data + " --> ");
			current_node = current_node.next;
		}
		System.out.println("null");
	}
	
	public void findSolution() {
		LinkedList list = new LinkedList();
		list = insertLast(list, 10);
		list = insertLast(list, 20);
		list = insertLast(list, 30);
		list = insertLast(list, 40);
		list = insertLast(list, 50);
		
		printLinkedList(list);
		
		list = insertFirst(list, 5);
		System.out.println("\nAfter inserting 5 : ");
		printLinkedList(list);
		
		System.out.println("\nAfter inserting 12 : ");
		list = insertAfterNode(list, 10, 12);
		printLinkedList(list);
		
		list = insertAfterNode(list, 50, 60);
		System.out.println("\nAfter inserting 60 : ");
		printLinkedList(list);
		
		list = insertBeforeNode(list, 10, 1);
		System.out.println("\nAfter inserting 1 : ");
		printLinkedList(list);
		
		list = insertBeforeNode(list, 60, 55);
		System.out.println("\nAfter inserting 55 : ");
		printLinkedList(list);
	}
}
