package com.meenu.codingskills.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

/*
 * Problem description: Given a non-empty array of integers, every element appears three times except for one, which appears exactly once. Find that single one.

Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:
Input: [2,2,3,2]
Output: 3

Example 2:
Input: [0,1,0,1,0,1,99]
Output: 99
 
 */

/**
 * @author Meenu V Nair
 *
 */
public class SingleNumberII {
	Map<Integer,Integer> map;

	public void findSolution() {
		int array[] = new int[] {0,1,0,1,0,1,99}; // {2,2,3,2}; 
		map = new HashMap<Integer,Integer>();
		int singleNumber = findSingleNumber(array);
		if(singleNumber == -1)
			System.out.println("No single number found");
		else
			System.out.println("Single number : " + singleNumber);
	}
	private int findSingleNumber(int[] array) {
		for(int i = 0; i < array.length; i++) {
			if(map.containsKey(array[i]))
				map.put(array[i], map.get(array[i]) + 1);
			else
				map.put(array[i], 1);
		}
		
		for(int i : map.keySet()) {
			if(map.get(i) == 1)
				return i;
		}
		return -1;
	}
}
