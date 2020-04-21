package com.meenu.codingskills.leetcode.easy;

/*
 * Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.

Example 1:
------------------
Input: 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
 
Example 2:
-----------------
Input: 1
Output: 0
Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0.
 */

public class NumberComplement {

	private int findComplement(int num) {
		int result = 0;
        if(num == 0)
        	return 1;
        if(num == 1)
        	return 0;
       
        int base = 1;
		while(num > 0) {
        	int complement;
        	if(num % 2 == 1)
        		complement = 0;
        	else
        		complement = 1;
        	num = num / 2;
        	result += complement * base;
        	base = base * 2;
        }
        
        return result;
    }
	
	public void findSolution() {
		int num = 20161211;
		//int num = 1;
		//int num = 2;
		
		int complement = findComplement(num);
		System.out.println("Complement of " + num + " : " + complement);
	}
}
