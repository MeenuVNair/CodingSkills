package com.meenu.codingskills.datastructures.stack;

/**
 * @author Meenu V Nair
 *
 */
public class EvaluationOfExpression {
	static String stack[] = new String[20];
	static int top = -1;
	
	/* for postfix evaluation, 
			scan the expression from left to right
			while popping, first element popped will be second operand and second element will be first operand
		for prefix evaluation,
			scan the expression from right to left
			while popping, first element popped will be first operand and second element will be second operand	
	*/

	public void findSolution() {
		// postfix evaluation
		String posExpression[] = new String[]{"2","3","*","5","4","*","+","9","-"};
		int pos_output = 0;
		for(int i = 0; i < posExpression.length; i++) {
			if(!(posExpression[i].equals("+") || posExpression[i].equals("-") || posExpression[i].equals("*") || posExpression[i].equals("/")) ) {
				push(posExpression[i]);
			}
			else {
				int second = Integer.parseInt(pop());
				int first = Integer.parseInt(pop());
				pos_output = performOperation(first, second, posExpression[i]);
				push(String.valueOf(pos_output));
			}
		}
		System.out.println("Postfix Output : " + pos_output);
		
		//prefix evaluation
		// clear the stack
		top = -1;
		String preExpression[] = new String[]{"-","+","*","2","3","*","5","4","9"};
		int pre_output = 0;
		for(int i = preExpression.length - 1; i >= 0; i--) {
			if(!(preExpression[i].equals("+") || preExpression[i].equals("-") || preExpression[i].equals("*") || preExpression[i].equals("/")) ) {
				push(preExpression[i]);
			}
			else {
				int first = Integer.parseInt(pop());
				int second = Integer.parseInt(pop());
				pre_output = performOperation(first, second, preExpression[i]);
				push(String.valueOf(pre_output));
			}
		}
		System.out.println("Prefix Output : " + pre_output);
	}
	
	private int performOperation(int first, int second, String operation) {
		int output = 0;
		if(operation.equals("+")) {
			output = first + second;
		}
		else if(operation.equals("-")) {
			output = first - second;
		}
		else if(operation.equals("*")) {
			output = first * second;
		}
		else {
			output = first / second;
		}
		return output;
	}

	private void push(String value) {
		stack[++top] = value;
		//printStack();
	}
	
	private String pop() {
		return stack[top--];
	}
	
	private void printStack() {
		System.out.println(" -------------------------------");
		for(int i = 0; i <= top; i++) {
			System.out.print(" |  " + stack[i]);
		}
		System.out.println();
		System.out.println(" --------------------------------");
	}
}
