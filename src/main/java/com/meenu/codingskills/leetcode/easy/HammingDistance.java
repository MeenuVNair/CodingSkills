package com.meenu.codingskills.leetcode.easy;

/*
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

Note:
0 ≤ x, y < 231.

Example:

Input: x = 1, y = 4

Output: 2

Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑

The above arrows point to positions where the corresponding bits are different.
 */

public class HammingDistance {

	private int hammingDistance(int x, int y) {
        if(x == y)
        	return 0;
        
        int distance = 0;
        while(x > 0 || y > 0) {
        	if(x > 0 && y > 0) {
        		if(x % 2 != y % 2)
        			distance++;
        	}
        	else if(x > 0 && x % 2 != 0) {
        		distance++;
        	}
        	else if(y > 0 && y % 2 != 0)
        		distance++;
        	x = x / 2;
        	y = y / 2;
        }
        return distance;
    }
	
	public void findSolution() {
		int x = 1;
		int y = 4;
		int hammingDistance = hammingDistance(x, y);
		System.out.println("Hamming distance : " + hammingDistance);
	}
}
