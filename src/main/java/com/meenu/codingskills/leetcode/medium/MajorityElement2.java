package com.meenu.codingskills.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

Note: The algorithm should run in linear time and in O(1) space.

Example 1:

Input: [3,2,3]
Output: [3]
Example 2:

Input: [1,1,1,3,3,2,2,2]
Output: [1,2]
 */

/**
 * @author Meenu V Nair
 *
 */
public class MajorityElement2 {

	private List<Integer> majorityElement(int[] nums) {
		List<Integer> majorityElements = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums) {
        	map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        for(Integer key : map.keySet()) {
        	if(map.get(key) > nums.length / 3)
        		majorityElements.add(key);
        }
        
        return majorityElements;
    }
	
	public void findSolution() {
		//int nums[] = new int[] {1};
		//int nums[] = new int[] {1,2};
		int nums[] = new int[] {3,2,3};
		//int nums[] = new int[] {1,1,1,3,3,2,2,2};
		List<Integer> majorityElements = majorityElement(nums);
		for(int i : majorityElements) {
			System.out.print(i + "  ");
		}
	}
}
