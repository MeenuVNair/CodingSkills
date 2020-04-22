package com.meenu.codingskills.leetcode.easy;

/*
 * Given an integer, write a function to determine if it is a power of two.

Example 1:

Input: 1
Output: true 
Explanation: 20 = 1
Example 2:

Input: 16
Output: true
Explanation: 24 = 16
Example 3:

Input: 218
Output: false
 */

public class PowerOfTwo {
	
	private boolean isPowerOfTwo(int n) {
        long i = 1;
        while(i < n){
            i = i * 2;
        }
        return i == n;
    }

	public void findSolution() {
		int n = 1;
		//int n = 16;
		//int n = 218;
		
		System.out.println("Is " + n + " power of two ? " + isPowerOfTwo(n));
	}
}
