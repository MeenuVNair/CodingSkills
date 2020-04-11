package com.meenu.codingskills.datastructures.stack;

public class StackUsingArray {

	static int MAX_SIZE = 101;
	static int stack[] = new int[MAX_SIZE];
	static int top = -1;
	
	private void push(int value) {
		if(top == MAX_SIZE - 1) {
			System.err.println("Stack overload");
			return;
		}
		stack[++top] = value;
	}
	
	private void pop() {
		top--;
	}
	
	private int top() {
		return(stack[top]);
	}
	
	private boolean isEmpty() {
		if(top == -1)
			return true;
		else
			return false;
	}
	
	public void findSolution() {

		push(10);
		printStack();
		push(20);
		printStack();
		push(30);
		printStack();
		pop();
		printStack();
		push(50);
		printStack();
		int value = top();
		System.out.println("\nvalue : " + value);
		System.out.println("isEmpty : " + isEmpty());
	}
	
	private void printStack() {
		System.out.println("\nStack : \n");
		
		System.out.println(" -------------------------------");
		for(int i = 0; i <= top; i++) {
			System.out.print(" |  " + stack[i]);
		}
		System.out.println();
		System.out.println(" --------------------------------");
	}

}
