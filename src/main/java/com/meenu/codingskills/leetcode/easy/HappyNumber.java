package com.meenu.codingskills.leetcode.easy;

import java.util.HashSet;

/*
 * Write an algorithm to determine if a number n is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Return True if n is a happy number, and False if not.
Example: 

Input: 19
Output: true
Explanation: 
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1

 */

/**
 * @author Meenu V Nair
 *
 */
public class HappyNumber {

	private boolean isHappy(int n) {
        HashSet<Integer> hashSet = new HashSet<>();
        
        while(n != 1) {
        	int current = n;
        	int sum = 0;
        	while(current > 0) {
        		int a = current % 10;
        		current = current / 10;
        		sum += a * a;
        	}
        	if(!hashSet.contains(sum))
        		hashSet.add(sum);
        	else
        		return false;
        	n = sum;
        }
        return true;
    }
	
	public void findSolution() {
		int n = 19;
		boolean isHappy = isHappy(n);
		System.out.println("Is " + n + " a happy number : " + isHappy);
	}
}
