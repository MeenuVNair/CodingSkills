package com.meenu.codingskills.datastructures.linkedlist;

/**
 * @author Meenu V Nair
 *
 */
public class DoublyLinkedList {
	
	Node head;
	
	static class Node{
		Object data;
		Node prev;
		Node next;
		
		public Node(Object value) {
			data = value;
			prev = null;
			next = null;
		}
	}
}
