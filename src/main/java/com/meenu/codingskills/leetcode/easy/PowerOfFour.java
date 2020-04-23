package com.meenu.codingskills.leetcode.easy;

/*
 * Given an integer (signed 32 bits), write a function to check whether it is a power of 4.

Example 1:

Input: 16
Output: true
Example 2:

Input: 5
Output: false
Follow up: Could you solve it without loops/recursion?
 */

/**
 * @author Meenu V Nair
 *
 */
public class PowerOfFour {

	private boolean isPowerOfFour(int num) {
	       long i = 1;
	        while(i < num){
	            i = i * 4;
	        }
	        return i == num;
	    }

	public void findSolution() {
		int num = 16;
		//int num = 5;
		System.out.println("Is " + num + " power of 4 ? " + isPowerOfFour(num));
	}
}
