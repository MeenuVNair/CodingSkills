package com.meenu.codingskills.leetcode.easy;

import java.util.Stack;

/*
 * Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

Example 1:

Input: S = "ab#c", T = "ad#c"
Output: true
Explanation: Both S and T become "ac".
Example 2:

Input: S = "ab##", T = "c#d#"
Output: true
Explanation: Both S and T become "".
Example 3:

Input: S = "a##c", T = "#a#c"
Output: true
Explanation: Both S and T become "c".
Example 4:

Input: S = "a#c", T = "b"
Output: false
Explanation: S becomes "c" while T becomes "b".
 */

public class BackspaceStringCompare {

	private boolean backspaceCompare(String S, String T) {
        Stack<Character> stack = new Stack<>();
        String s = "";
        for(char c : S.toCharArray()) {
        	if(c != '#')
        		stack.push(c);
        	else {
        		if(!stack.isEmpty())
        			stack.pop();
        	}
        }
        
        while(!stack.isEmpty())
        	s += stack.pop();
        
        String t = "";
        for(char c : T.toCharArray()) {
        	if(c != '#')
        		stack.push(c);
        	else {
        		if(!stack.isEmpty())
        			stack.pop();
        	}
        }
        
        while(!stack.isEmpty())
        	t += stack.pop();
        
        return s.equals(t);
    }
	
	public void findSolution() {
		String S = "ab#c";
		String T = "ad#c";
		/*String S = "ab##"; 
		String T = "c#d#";*/
		/*String S = "a##c";
		String T = "#a#c";*/
		/*String S = "a#c";
		String T = "b";*/
		
		System.out.println("Equal : " + backspaceCompare(S, T));
	}
}
