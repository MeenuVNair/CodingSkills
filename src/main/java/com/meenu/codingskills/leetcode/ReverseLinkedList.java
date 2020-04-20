package com.meenu.codingskills.leetcode;

/*
 * Reverse a singly linked list.

Example:

Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
Follow up:

A linked list can be reversed either iteratively or recursively. Could you implement both?
 */

public class ReverseLinkedList {

	class ListNode{
		int val;
		ListNode next;
		ListNode(int value){
			val = value;
			next = null;
		}
	}
	
	ListNode headNode;
	
	private ListNode reverseList(ListNode head) {
        if(head == null) {
        	return null;
        }
        
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        
        while(current != null) {
        	next = current.next;
        	current.next = prev;
        	prev = current;
        	current = next;
        }
        return prev;
    }
	
	public void findSolution() {
		ListNode node = null;
		node = insert(1);
		node = insert(2);
		node = insert(3);
		node = insert(4);
		node = insert(5);
		print(node);
		
		node = reverseList(node);
		print(node);
	}
	
	private void print(ListNode node) {
		if(node == null) {
			System.out.print("null");
			return;
		}
		while(node != null) {
			System.out.print(node.val + " --> ");
			node = node.next;
		}
		System.out.print("null\n");
	}
	
	private ListNode insert(int value) {
		if(headNode == null) {
			ListNode newNode = new ListNode(value);
			headNode = newNode;
			return headNode;
		}
		
		ListNode newNode = new ListNode(value);
		newNode.next = null;
		
		ListNode node = headNode;
		
		while(node.next != null) {
			node = node.next;
		}
		
		node.next = newNode;
		return headNode;
	}
}
