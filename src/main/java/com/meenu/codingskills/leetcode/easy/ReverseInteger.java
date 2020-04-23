package com.meenu.codingskills.leetcode.easy;

import java.util.Stack;

/*
 * Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
 */

/**
 * @author Meenu V Nair
 *
 */
public class ReverseInteger {

	private int reverse(int x) {
		
/**************************** first approach ****************************/
       /*String rev = "";
        int num = x;
        if(x < 0)
        	x = x * -1;
        while(x > 0) {
        	rev = rev + x % 10;
        	x = x / 10;
        }
        
        if(num < 0)
        	rev = "-" + rev;
        
        int result = 0;
        try {
        	result = Integer.parseInt(rev);
        }
        catch(NumberFormatException e) {
        }
        return result;*/
		
/****************************** second approach *********************************/
		
		int num = x;
		if(x < 0)
			x = x * -1;
		
		long reverse = 0;
		while(x > 0) {
			reverse = (reverse * 10) + (x % 10);
			x = x / 10;
		}
		
		if(reverse > Integer.MAX_VALUE)
			return 0;
		
		if(num < 0)
			return (int) reverse * -1;
		else
			return (int) reverse;
		
    }
	
	public void findSolution() {
		int x= 123;
		//int x = -123;
		//int x = 120;
		//int x = 1234567899;
		int reverse = reverse(x);
		System.out.println("Reverse : " + reverse);
	}
}
