package com.meenu.codingskills.datastructures.stack;

/**
 * @author Meenu V Nair
 *
 */
public class BalancedParanthesis {
	static int MAX_SIZE = 10;
	static char arr[] = new char[MAX_SIZE];
	static int top = -1;
	static boolean balanced = true;

	public void findSolution() {

		String input = ")(";  //"{[()]}"; // "{][()" ; 
		System.out.println("input : " + input);
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == '{' || input.charAt(i) == '[' || input.charAt(i) == '(') {
				push(input.charAt(i));
			}
			else if(input.charAt(i) == '}' || input.charAt(i) == ']' || input.charAt(i) == ')') {
				if(top == -1) {
					balanced = false;
					break;
				}
				char popped = pop();
				if((popped == '(' && input.charAt(i) != ')' ) || (popped == '{' && input.charAt(i) != '}' ) || (popped == '[' && input.charAt(i) != ']' )) {
					balanced = false;
					break;
				}
			}
		}
		if(balanced)
			System.out.println("Balanced");
		else
			System.out.println("Not balanced");
	}

	private void push(char value) {
		arr[++top] = value;
	}
	
	private char pop() {
		return arr[top--];
	}
}
