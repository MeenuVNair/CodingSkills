package datastructures.stack;

public class BalancedParanthesis {
	static int MAX_SIZE = 10;
	static char arr[] = new char[MAX_SIZE];
	static int top = -1;
	static boolean balanced = true;

	public static void main(String[] args) {

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

	public static void push(char value) {
		arr[++top] = value;
	}
	
	public static char pop() {
		return arr[top--];
	}
}
