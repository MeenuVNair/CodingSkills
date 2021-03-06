package com.meenu.codingskills.leetcode.easy;

import java.util.HashMap;

/*
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */

/**
 * @author Meenu V Nair
 *
 */
public class TwoSum {

	private int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
        	int diff = target - nums[i];
        	if(map.containsKey(diff)) {
        		result[0] = map.get(diff);
        		result[1] = i;
        		return result;
        	}
        	map.put(nums[i], i);
        }
        return result;
    }
	
	public void findSolution() {
		int nums[] = new int[] {2,7,11,15};
		int target = 9;
		int result[] = twoSum(nums, target);
		System.out.println(result[0] + " " + result[1]);
	}
}
