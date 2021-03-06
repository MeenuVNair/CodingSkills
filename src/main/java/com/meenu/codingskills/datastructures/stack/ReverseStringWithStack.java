package com.meenu.codingskills.datastructures.stack;

/**
 * @author Meenu V Nair
 *
 */
public class ReverseStringWithStack {

	static int MAX_SIZE = 101;
	static char arr[] = new char[MAX_SIZE];
	static int top = -1;
	
	public void findSolution() {
		String input = "Hello";
		/*Scanner input = new Scanner(System.in);
		while(input.hasNext()) {
			push(input.next());
		}
		input.close();*/
		for(int i = 0; i < input.length(); i++) {
			push(input.charAt(i));
			
		}
		System.out.print("String : ");
		print();
		String reverse = "";
		while(top != -1) {
			reverse = reverse + top();
		}
		System.out.println("\nReverse : " + reverse);
		
	}
	
	private void push(char value) {
		if(top == MAX_SIZE - 1) {
			System.err.println("Stack overflow");
			return;
		}
		arr[++top] = value;
	}
	
	private void pop() {
		if(top == -1) {
			System.err.println("Stack empty");
			return;
		}
		top--;
	}
	
	private char top() {
		if(top == -1) {
			System.err.println("Stack empty");
		}
		return arr[top--];
	}
	
	private void print() {
		for(int i = 0; i <= top; i++) {
			System.out.print(arr[i]);
		}
	}

}
