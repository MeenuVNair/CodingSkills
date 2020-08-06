package com.meenu.codingskills.practice;


/*
 * Objective
Check out the Tutorial tab for learning materials and an instructional video!

Task
A Node class is provided for you in the editor. A Node object has an integer data field, , and a Node instance pointer, , pointing to another node (i.e.: the next node in a list).

A removeDuplicates function is declared in your editor, which takes a pointer to the  node of a linked list as a parameter. Complete removeDuplicates so that it deletes any duplicate nodes from the list and returns the head of the updated list.

Note: The  pointer may be null, indicating that the list is empty. Be sure to reset your  pointer when performing deletions to avoid breaking the list.

Input Format

You do not need to read any input from stdin. The following input is handled by the locked stub code and passed to the removeDuplicates function:
The first line contains an integer, , the number of nodes to be inserted.
The  subsequent lines each contain an integer describing the  value of a node being inserted at the list's tail.

Constraints

The data elements of the linked list argument will always be in non-decreasing order.
Output Format

Your removeDuplicates function should return the head of the updated linked list. The locked stub code in your editor will print the returned list to stdout.

Sample Input
---------------
6
1
2
2
3
3
4
Sample Output
-----------------
1 2 3 4 

* 
*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
* @author Meenu V. Nair
*
 * Creation time: Aug 6, 2020 5:14:51 PM
*
*/

public class RemoveDuplicatesFromLinkedList {

	static class Node{
		int data;
		Node next;
		Node(int d){
	        data=d;
	        next=null;
	    }
		
	}
	public static Set<Integer> set = new HashSet<>();
	
	public static Node removeDuplicates(Node head) {
		if(head == null)
			return head;
	    Node currentNode = head;
	    set.add(currentNode.data);
	    Node prev = null;
	    while(currentNode != null && currentNode.next != null) {
	    	prev = currentNode;
	    	currentNode = currentNode.next;
	    	if(set.contains(currentNode.data)) {
	    		Node nextNonDuplicate = findNextDistinctNode(currentNode.next);
	    		prev.next = nextNonDuplicate;
	    		set.remove(currentNode.data);
	    		currentNode = nextNonDuplicate;
	    		if(nextNonDuplicate != null)
	    			set.add(nextNonDuplicate.data);
	    	}
	    	else {
	    		set.add(currentNode.data);
	    	}
	    }
	    return head;
    }

	private static Node findNextDistinctNode(Node node) {
		while(node != null && set.contains(node.data))
			node = node.next;
		return node;
	}
	
	 public static  Node insert(Node head,int data)
     {
        Node p=new Node(data);			
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node head)
     {
              Node start=head;
              while(start!=null)
              {
                  System.out.print(start.data+" ");
                  start=start.next;
              }
     }
    
    public static void main(String args[])
    {
          Scanner sc=new Scanner(System.in);
          Node head=null;
          int T=sc.nextInt();
          while(T-->0){
              int ele=sc.nextInt();
              head=insert(head,ele);
          }
          head=removeDuplicates(head);
          display(head);

   }
}
