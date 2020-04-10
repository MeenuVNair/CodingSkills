package com.meenu.codingskills.datastructures.linkedlist;

import com.meenu.codingskills.datastructures.linkedlist.LinkedList.Node;

/*
 * Reverse the given string word by word
 * Input : This is a cat
 * Output : sihT si a tac
 */


public class StringReversal {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list = insert(list,"T");
		list = insert(list,"h");
		list = insert(list,"i");
		list = insert(list,"s");
		list = insert(list," ");
		list = insert(list,"i");
		list = insert(list,"s");
		list = insert(list," ");
		list = insert(list,"a");
		list = insert(list," ");
		list = insert(list,"c");
		list = insert(list,"a");
		list = insert(list,"t");
		
		printLinkedList(list);
		
		list = reverse(list);
		
		System.out.println("\nReversed string");
		printLinkedList(list);
	}

	public static LinkedList reverse(LinkedList list) {
		Node current = list.head;
		Node prev = null; Node next = null; Node temp = null; Node mainHead = null; Node newHead = null;
		
		temp = list.head;
		int count = 0;
		while(current != null) {
			newHead = current;
			while(current != null && !current.data.equals(" ")) {
				next = current.next;
				current.next = prev;
				prev = current;
				current = next;
			}
			if(count == 0) {
				mainHead = prev;
				count++;
				temp.next = current;
			}
			else {
				temp.next = prev;
				newHead.next = current;
			}
			temp = current;
			if(current != null)
				current = current.next;
			prev = null;
			
		}
		list.head = mainHead;
		return list;
	}
	
	
	public static LinkedList insert(LinkedList list, String data) {
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
		System.out.println("Linked List : ");
		while(current_node != null) {
			System.out.print(current_node.data + " --> ");
			current_node = current_node.next;
		}
		System.out.println("null");
	}
}
