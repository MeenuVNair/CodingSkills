package datastructures.stack;

public class InfixToPostfix {
	static char stack[] = new char[20];
	static int top = -1;

	public static void main(String[] args) {
		String infix = "((a+b)*c-d)*e"; // "a+b*c-d*e";
		System.out.println("Infix expression : " + infix);
		String postfix = "";
		
		for(int i = 0; i < infix.length(); i++) {
			if(isOperand(infix.charAt(i))) {
				postfix = postfix + infix.charAt(i);
			}
			else if(isOperator(infix.charAt(i))) {
				while(!isEmpty() && higherPrecedence(top(), infix.charAt(i))) {
					postfix = postfix + top();
					pop();
				}
				push(infix.charAt(i));
			}
			else if(infix.charAt(i) == '(') {
				push(infix.charAt(i));
			}
			else if(infix.charAt(i) == ')') {
				while(!isEmpty() && top() != '(') {
					postfix += top();
					pop();
				}
				pop();
			}
		}
		while(!isEmpty()) {
			postfix = postfix + top();
			pop();
		}
		
		System.out.println("Postfix expression : " + postfix);
	}
	
	public static boolean isOperand(char value) {
		if(value >= 0 && value <= 9)
			return true;
		if(value >= 'a' && value <= 'z')
			return true;
		if(value >= 'A' && value <= 'Z')
			return true;
		
		return false;
	}
	
	public static boolean isOperator(char op) {
		if(op == '+' || op == '-' || op == '*' || op == '/')
			return true;
		return false;
	}

	public static boolean higherPrecedence(char oldValue, char newValue) {
		int op1Weight = GetOperatorWeight(oldValue);
		int op2Weight = GetOperatorWeight(newValue);
		if(op1Weight == op2Weight)
			return true;
		return op1Weight > op2Weight ?  true: false;
	}
	
	static int GetOperatorWeight(char op)
	{
		int weight = -1; 
		if(op == ('+') || op == ('-'))
			weight = 1;
		if(op == ('*') || op == ('/'))
			weight = 2;
		return weight;
	}
	
	public static void push(char value) {
		stack[++top] = value;
		//printStack();
	}
	
	public static void pop() {
		top--;
	}
	
	public static char top() {
		return(stack[top]);
	}
	
	public static boolean isEmpty() {
		if(top == -1)
			return true;
		else
			return false;
	}
	
	public static void printStack() {
		System.out.println(" -------------------------------");
		for(int i = 0; i <= top; i++) {
			System.out.print(" |  " + stack[i]);
		}
		System.out.println();
		System.out.println(" --------------------------------");
	}
}
