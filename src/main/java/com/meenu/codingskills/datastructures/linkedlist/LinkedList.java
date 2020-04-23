package com.meenu.codingskills.datastructures.linkedlist;

/**
 * @author Meenu V Nair
 *
 */
public class LinkedList {
	Node head;
	
	static class Node{
		Object data;
		Node next;
		
		public Node(Object value) {
			data = value;
			next = null;
		}
	}
}
