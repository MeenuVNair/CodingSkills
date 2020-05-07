package com.meenu.codingskills.thirtydaysofcode;

/*
 * Given a string containing only three types of characters: '(', ')' and '*', write a function to check whether this string is valid. We define the validity of a string by these rules:

Any left parenthesis '(' must have a corresponding right parenthesis ')'.
Any right parenthesis ')' must have a corresponding left parenthesis '('.
Left parenthesis '(' must go before the corresponding right parenthesis ')'.
'*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string.
An empty string is also valid.
Example 1:
Input: "()"
Output: True
Example 2:
Input: "(*)"
Output: True
Example 3:
Input: "(*))"
Output: True
 */

/**
* @author Meenu V. Nair
*
 * Creation time: May 7, 2020 3:32:10 PM
*
*/

public class ValidParenthesisString {

	private boolean checkValidString(String s) {
        int low = 0;
        int high = 0;
        
        for(int i = 0; i < s.length(); i++) {
        	if(s.charAt(i) == '(') {
        		low++;
        	}
        	else {
        		low--;
        	}
        	if(s.charAt(i) != ')') {
        		high++;
        	}
        	else
        		high--;
        	if(high < 0)
        		break;
        	low = Math.max(low, 0);
        }
        
		return low == 0;
    }
	
	public void findSolution() {
		String s = "()";
		//String s = "(*)";
		//String s = "(*))";
		//String s = "(***)";
		//String s = "(*)(*)";
		//String s = "(*(((*)";
		
		System.out.println("Valid parenthesis : " + checkValidString(s));
	}
}
