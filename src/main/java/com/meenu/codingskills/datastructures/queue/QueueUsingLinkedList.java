package com.meenu.codingskills.datastructures.queue;

/**
 * @author Meenu V Nair
 *
 */
public class QueueUsingLinkedList {
	
	static Node front;
	static Node rear;
	
	static class Node{
		int data;
		Node next;
		public Node(int value) {
			data = value;
			next = null;
		}
	}

	public void findSolution() {
		enqueue(1);
		enqueue(2);
		dequeue();
		dequeue();
		dequeue();
		enqueue(4);
		enqueue(5);
		enqueue(6);
	}

	private void enqueue(int value) {
		Node newNode = new Node(value);
		newNode.next = null;
		if(front == null && rear == null) {
			front = rear = newNode;
			return;
		}
		rear.next = newNode;
		rear = newNode;
		
		printQueue();
	}
	
	private void dequeue() {
		if(front == null)
			return;
		if(front == rear)
			front = rear = null;
		else
			front = front.next;
		
		printQueue();
	}
	
	private void printQueue() {
		System.out.println("Queue : ");
		Node temp = front;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
}
