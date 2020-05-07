package com.meenu.codingskills.thirtydaysofcode;

import java.util.Stack;

/*
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
 

Example 1:

Input
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

Output
[null,null,null,null,-3,null,0,-2]

Explanation
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin(); // return -3
minStack.pop();
minStack.top();    // return 0
minStack.getMin(); // return -2
 */

/**
* @author Meenu V. Nair
*
 * Creation time: May 7, 2020 12:08:45 PM
*
*/

public class MinStack {
	
	static Stack<Integer> stack;
	static Stack<Integer> minStack;
	
	public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
	private void push(int x) {
    	stack.push(x);
        if(minStack.isEmpty()) {
        	minStack.push(x);
        }
        else {
        	minStack.push(Math.min(x, minStack.peek()));
        }
    }
    
    private void pop() {
    	stack.pop();
    	minStack.pop();
    }
    
    private int top() {
        return stack.peek();
    }
    
    private int getMin() {
    	return minStack.peek();
    }

	public void findSolution() {
		int val;
		MinStack minStack = new MinStack();
		minStack.push(-2);
		printStack();
		minStack.push(0);
		printStack();
		minStack.push(-3);
		printStack();
		val =minStack.getMin(); // return -3
		System.out.println("Min value : " + val);
		minStack.pop();
		printStack();
		val = minStack.top();    // return 0
		System.out.println("Top() : " + val);
		printStack();
		val = minStack.getMin(); // return -2
		System.out.println("Min value : " + val);
		
	}
	
	private void printStack() {
		System.out.print("| ");
		for(int i = 0; i < stack.size(); i++) {
			System.out.print(stack.get(i) + " | ");
		}
		System.out.println();
	}
}
