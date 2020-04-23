package com.meenu.codingskills.leetcode.easy;

/*
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
 */

/**
 * @author Meenu V Nair
 *
 */
public class MergeTwoSortedList {

	class ListNode{
		int val;
		ListNode next;
		ListNode(int value){
			val = value;
			next = null;
		}
	}
		
	private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode mergedList = new ListNode(-1);
		ListNode head = mergedList;
        
		while(l1 != null && l2 != null) {
			if(l1.val < l2.val) {
				mergedList.next = l1;
				l1 = l1.next;
			}
			else {
				mergedList.next = l2;
				l2 = l2.next;
			}
			mergedList = mergedList.next;
		}
		
		if(l1 != null) {
			mergedList.next = l1;
		}
		if(l2 != null) {
			mergedList.next = l2;
		}
        
        return head.next;
    }
	
	public void findSolution() {
		ListNode l1 = null;
		/*l1 = insert(l1, 1);
		l1 = insert(l1, 2);
		l1 = insert(l1, 4);*/
		l1 = insert(l1, -9);
		l1 = insert(l1, 3);
		
		print(l1);
		
		ListNode l2 = null;
		/*l2 = insert(l2, 1);
		l2 = insert(l2, 3);
		l2 = insert(l2, 4);*/
		l2 = insert(l2, 5);
		l2 = insert(l2, 7);
		l2 = insert(l2, 9);
		
		print(l2);
		
		ListNode mergedList = mergeTwoLists(l1, l2);
		print(mergedList);
		
	}
	
	private ListNode insert(ListNode node, int value) {
		ListNode newNode = new ListNode(value);
		if(node == null) {
			node = newNode;
			return node;
		}
		
		ListNode current = node;
		while(current.next != null) {
			current = current.next;
		}
		current.next = newNode;
		return node;
	}
	
	private void print(ListNode node) {
		while(node != null) {
			System.out.print(node.val + " --> ");
			node = node.next;
		}
		System.out.print("null");
		System.out.println();
	}
}
