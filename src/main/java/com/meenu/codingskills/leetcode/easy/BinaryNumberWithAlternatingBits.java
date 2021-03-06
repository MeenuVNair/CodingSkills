package com.meenu.codingskills.leetcode.easy;

/*
 * Given a positive integer, check whether it has alternating bits: namely, if two adjacent bits will always have different values.

Example 1:
Input: 5
Output: True
Explanation:
The binary representation of 5 is: 101
Example 2:
Input: 7
Output: False
Explanation:
The binary representation of 7 is: 111.
Example 3:
Input: 11
Output: False
Explanation:
The binary representation of 11 is: 1011.
Example 4:
Input: 10
Output: True
Explanation:
The binary representation of 10 is: 1010.
 */

/**
 * @author Meenu V Nair
 *
 */
public class BinaryNumberWithAlternatingBits {

	private boolean hasAlternatingBits(int n) {
		if(n == 0 || n == 1)
			return true;
        int prev = -1;
        int num = n;
        
        while(num > 0) {
        	int a = num % 2;
        	if(prev != -1 && prev == a)
        		return false;
        	else {
        		prev = a;
        	}
        	num = num / 2;
        }
        return true;
    }
	
	public void findSolution() {
		int n = 5;
		//int n = 7;
		//int n = 11;
		//int n = 10;
				
		System.out.println("Does the given number has alternating bits : " + hasAlternatingBits(n));
	}
}
