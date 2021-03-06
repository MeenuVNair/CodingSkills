package com.meenu.codingskills.leetcode.easy;

import java.util.HashMap;

/*
 * Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.

Note:

The length of both num1 and num2 is < 5100.
Both num1 and num2 contains only digits 0-9.
Both num1 and num2 does not contain any leading zero.
You must not use any built-in BigInteger library or convert the inputs to integer directly.

Example
Input : "0"
Output : "0"
 */

/**
 * @author Meenu V Nair
 *
 */
public class AddStrings {

	private String addStrings(String num1, String num2) {
		StringBuilder result = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        
        int sum = 0;
        int carry = 0;
        while(i >= 0  || j >= 0) {
        	sum = carry;
        	if(i >= 0) {
        		sum += num1.charAt(i--) - '0';
        	}
        	if(j >= 0) {
        		sum += num2.charAt(j--) - '0';
        	}
        	result.append(sum % 10);
        	carry = sum / 10;
        }
        if(carry != 0)
        	result.append(carry);
        
        return result.reverse().toString();
    }
	
	public void findSolution() {
		/*String num1 = "120";
		String num2 = "10";*/
		
		/*String num1 = "6913259244";
		String num2 = "71103343";*/
		
		String num1 = "9";
		String num2 = "99";
		
		System.out.println("Sum : " + addStrings(num1, num2));
	}
	
}
