package com.meenu.codingskills.leetcode.easy;

/*
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:

Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Example 2:

Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
 */

/**
 * @author Meenu V Nair
 *
 */
public class PlusOne {

	private int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--) {
        	if(digits[i] < 9) {
        		digits[i]++;
        		return digits;
        	}
        	digits[i] = 0;
        }
        int result[] = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
	
	public void findSolution() {
		int digits[] = new int[] {1,2,3};
		//int digits[] = new int[] {4,3,2,1};
		//int digits[] = new int[] {9,9,9};
		
		int result[] = plusOne(digits);
		for(int i : result) {
			System.out.print(i);
		}
	}
}
