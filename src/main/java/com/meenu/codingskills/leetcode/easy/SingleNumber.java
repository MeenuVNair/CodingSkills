package com.meenu.codingskills.leetcode.easy;

import java.util.HashMap;

/*
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1
Example 2:

Input: [4,1,2,1,2]
Output: 4
 */

public class SingleNumber {

	private int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums) {
        	map.put(i, map.getOrDefault(i, 0) + 1);		
        }
        
        for(int key : map.keySet()) {
        	if(map.get(key) == 1)
        		return key;
        }
        return -1;
    }
	
	public void findSolution() {
		int nums[] = new int[] {2,2,1};
		//int nums[] = new int[] {4,1,2,1,2};
		
		System.out.println("Single number : " + singleNumber(nums));
	}
}
