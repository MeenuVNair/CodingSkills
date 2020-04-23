package com.meenu.codingskills.datastructures.queue;

/**
 * @author Meenu V Nair
 *
 */
public class QueueUsingArray {
	static int MAX_SIZE = 5;
	static int queue[] = new int[MAX_SIZE];
	static int front = -1;
	static int rear = -1;

	public void findSolution() {
		enqueue(1);
		enqueue(2);
		enqueue(3);
		dequeue();
		dequeue();
		dequeue();
		dequeue();
		enqueue(4);
		enqueue(5);
		enqueue(6);
		enqueue(7);
		enqueue(8);
		enqueue(9);
	}
	
	private void enqueue(int value) {
		if(isEmpty()) {
			front = 0;
			rear = 0;
		}
		else if(isFull()) {
			System.err.println("Queue Full");
			return;
		}
		else
			rear = rear + 1;
		queue[rear] = value;
		
		printQueue();
	}
	
	private void dequeue() {
		if(isEmpty()) {
			System.err.println("Queue Empty");
			return;
		}
		else if(front == rear) {
			front = -1;
			rear = -1;
		}
		else
			front = front + 1;
		
		printQueue();
	}
	
	private Object front() {
		if(isEmpty()) {
			System.err.println("Queue Empty");
			return null;
		}
		else
			return queue[front];
		
	}
	
	private boolean isEmpty() {
		if(front == -1 && rear == -1)
			return true;
		else
			return false;
	}
	
	private boolean isFull() {
		if(rear == MAX_SIZE - 1)
			return true;
		else
			return false;
	}
	
	private void printQueue() {
		System.out.println("Queue : ");
		if(!isEmpty()) {
			for(int i = front ; i <= rear ; i++) {
				System.out.print(queue[i] + " ");
			}
		}
		else
			System.out.println("Queue is Empty....");
		System.out.println();
	}

}
