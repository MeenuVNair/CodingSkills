package com.meenu.codingskills.thirtydaysofcode;

/*
 * Given a non-empty, singly linked list with head node head, return a middle node of linked list.

If there are two middle nodes, return the second middle node.

 

Example 1:

Input: [1,2,3,4,5]
Output: Node 3 from this list (Serialization: [3,4,5])
The returned node has value 3.  (The judge's serialization of this node is [3,4,5]).
Note that we returned a ListNode object ans, such that:
ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, and ans.next.next.next = NULL.
Example 2:

Input: [1,2,3,4,5,6]
Output: Node 4 from this list (Serialization: [4,5,6])
Since the list has two middle nodes with values 3 and 4, we return the second one.
 */

/**
* @author Meenu V. Nair
*
 * Creation time: May 7, 2020 11:49:45 AM
*
*/

public class MiddleOfTheLinkedList {
	
	  class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { 
	    	  this.val = val; 
	    	  this.next = null;
	      }
	      ListNode(int val, ListNode next) { 
	    	  this.val = val; 
	    	  this.next = next; 
	      }
	  }
	 
	 private ListNode middleNode(ListNode head) {	     
	     ListNode currentOne = head;
	     ListNode currentTwo = head;
	     
	     while(currentTwo != null && currentTwo.next != null) {
	    	 currentOne = currentOne.next;
	    	 currentTwo = currentTwo.next.next;
	     }
	     
	     return currentOne;
	 }
	  
	public void findSolution() {
		ListNode node = null;
		node = insert(1, node);
		node = insert(2, node);
		node = insert(3, node);
		node = insert(4, node);
		node = insert(5, node);
		node = insert(6, node);
		printNodes(node);
		
		ListNode middleNode = middleNode(node);
		printNodes(middleNode);
	}
	
	private void printNodes(ListNode node) {
		while(node != null) {
			System.out.print(node.val + " --> ");
			node = node.next;
		}
		System.out.print("null \n");
	}
	
	private ListNode insert(int value, ListNode node) {
		ListNode newNode = new ListNode(value);
		if(node == null) {
			return newNode;
		}
		ListNode current = node;
		while(current.next != null) {
			current = current.next;
		}
		current.next = newNode;
		
		return node;
	}
}
