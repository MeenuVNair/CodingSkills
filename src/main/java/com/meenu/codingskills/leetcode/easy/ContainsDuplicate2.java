package com.meenu.codingskills.leetcode.easy;

import java.util.HashMap;

/*
 * Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false
 */

public class ContainsDuplicate2 {

	private boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
        	int current = nums[i];
        	if(map.containsKey(current) && i - map.get(current) <= k) {
        		return true;
        	}else {
        		map.put(current, i);
        	}
        }
        return false;
    }
	
	public void findSolution() {
		int nums[] = new int[] {1,2,3,1};
		int k = 3;
		/*int nums[] = new int[] {1,0,1,1};
		int k = 1;*/
		/*int nums[] = new int[] {1,2,3,1,2,3};
		int k = 2;*/
		
		System.out.println(containsNearbyDuplicate(nums, k));
		
	}
}
