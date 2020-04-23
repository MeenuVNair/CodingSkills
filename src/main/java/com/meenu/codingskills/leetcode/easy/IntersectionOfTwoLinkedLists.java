package com.meenu.codingskills.leetcode.easy;

import java.util.HashSet;

/*
 * Write a program to find the node at which the intersection of two singly linked lists begins.

For example, the following two linked lists:


begin to intersect at node c1.

 

Example 1:


Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2, skipB = 3
Output: Reference of the node with value = 8
Input Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect). From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,0,1,8,4,5]. There are 2 nodes before the intersected node in A; There are 3 nodes before the intersected node in B.
 

Example 2:


Input: intersectVal = 2, listA = [0,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
Output: Reference of the node with value = 2
Input Explanation: The intersected node's value is 2 (note that this must not be 0 if the two lists intersect). From the head of A, it reads as [0,9,1,2,4]. From the head of B, it reads as [3,2,4]. There are 3 nodes before the intersected node in A; There are 1 node before the intersected node in B.
 

Example 3:


Input: intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2
Output: null
Input Explanation: From the head of A, it reads as [2,6,4]. From the head of B, it reads as [1,5]. Since the two lists do not intersect, intersectVal must be 0, while skipA and skipB can be arbitrary values.
Explanation: The two lists do not intersect, so return null.
 

Notes:

If the two linked lists have no intersection at all, return null.
The linked lists must retain their original structure after the function returns.
You may assume there are no cycles anywhere in the entire linked structure.
Your code should preferably run in O(n) time and use only O(1) memory.
 */

/**
 * @author Meenu V Nair
 *
 */
public class IntersectionOfTwoLinkedLists {

	class ListNode{
		int val;
		ListNode next;
		ListNode(int value){
			val = value;
			next = null;
		}
	}
	
	private ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();
        
        while(headA != null) {
        	set.add(headA);
        	headA = headA.next;
        }
        
        while(headB != null) {
        	if(set.contains(headB)) {
        		return headB;
        	}
        	headB = headB.next;
        }
        
        return null;
    }
	
	public void findSolution() {
		ListNode listA = null;
		listA = insert(listA, 4);
		listA = insert(listA, 1);
		listA = insert(listA, 8);
		listA = insert(listA, 4);
		listA = insert(listA, 5);
		
		System.out.println("A : ");
		print(listA);
		
		/*ListNode listB = null;
		listB = insert(listB, 5);
		listB = insert(listB, 0);
		listB = insert(listB, 1);
		listB = insert(listB, 8);
		listB = insert(listB, 4);
		listB = insert(listB, 5);*/
		
		ListNode listB = getIntersectionNode(listA);
		
		System.out.println("B : ");
		print(listB);
		
		ListNode intersection = getIntersectionNode(listA, listB);
		System.out.println("Intersection : ");
		print(intersection);
		
	}
	
	private ListNode getIntersectionNode(ListNode node) {
		while(node != null) {
			if(node.val == 8)
				return node;
			node = node.next;
		}
		return null;
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
	
	private ListNode insert(ListNode head, int value) {
		ListNode newNode = new ListNode(value);
		if(head == null) {
			return newNode;
		}
		
		newNode.next = null;
		
		ListNode current = head;
		
		while(current.next != null) {
			current = current.next;
		}
		
		current.next = newNode;
		return head;
	}
}
