package com.meenu.codingskills.old.leetcode;

import java.util.HashMap;
import java.util.Map;

/*
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 	You may assume that each input would have exactly one solution, and you may not use the same element twice.
 	
 	Example:
	 		Given nums = [2, 7, 11, 15], target = 9,
	 		Because nums[0] + nums[1] = 2 + 7 = 9,
	 		return [0, 1].
 * 
 */

/**
 * @author Meenu V Nair
 *
 */
public class TwoSums {

	public static void main(String[] args) {
		int nums[] = {2, 7, 11, 15};
		int target = 9;
		int indices[] = twoSum(nums, target);
		System.out.println(indices[0] + " " + indices[1] );

	}

	
	// first approach... brute force way
	/* public static int[] twoSum(int[] nums, int target) {
	        
	        int indices[] = new int[2];
	        for(int i = 0; i < nums.length; i++){
	            for(int j = i + 1; j < nums.length; j++){
	               if(nums[i] + nums[j] == target){
	                   indices[0] = i;
	                   indices[1] = j;
	                   return indices;
	               } 
	            }
	        }
	        throw new IllegalArgumentException("No two sum solution");
	    }*/
	
	// second approach ..... best solution
	
	public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
        	int complement = target - nums[i];
        	if(map.containsKey(complement)) {
        		return new int[] {map.get(complement),i};
        	}
        	map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
