package com.meenu.codingskills.leetcode.easy;

import java.util.Stack;

/*
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:

Input: "()"
Output: true
Example 2:

Input: "()[]{}"
Output: true
Example 3:

Input: "(]"
Output: false
Example 4:

Input: "([)]"
Output: false
Example 5:

Input: "{[]}"
Output: true
 */

/**
 * @author Meenu V Nair
 *
 */
public class ValidParentheses {

	private boolean isValid(String s) {
        if(s == null || s.length() == 0 || s.equals(""))
        	return true;
        
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
        	if(c == '(' || c == '[' || c == '{')
        		stack.push(c);
        	else {
        		if(stack.isEmpty())
        			return false;
        		if(c == ')') {
        			if(stack.peek() != '(')
        				return false;
        		}
        		else if(c == ']') {
        			if(stack.peek() != '[')
        				return false;
        		}
        		else if(c == '}') {
        			if(stack.peek() != '{')
        				return false;
        		}
        		stack.pop();
        	}
        }
        return stack.isEmpty();
    }
	
	public void findSolution() {
		String s = "]";
		//String s = "()";
		//String s = "() [] {}";
		//String s = "(]";
		//String s = "([)]";
		//String s = "{[]}";
		
		System.out.println("Is valid parenthesis ? " + isValid(s));
	}
}
