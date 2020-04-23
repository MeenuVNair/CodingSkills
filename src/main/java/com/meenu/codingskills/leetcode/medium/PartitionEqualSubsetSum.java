package com.meenu.codingskills.leetcode.medium;

import java.util.HashMap;

/*
 * Given a non-empty array containing only positive integers, find if the array can be partitioned into two subsets such that the sum of elements in both subsets is equal.

Note:
Each of the array element will not exceed 100.
The array size will not exceed 200.
 
Example 1:

Input: [1, 5, 11, 5]
Output: true
Explanation: The array can be partitioned as [1, 5, 5] and [11].
 
Example 2:
Input: [1, 2, 3, 5]
Output: false
Explanation: The array cannot be partitioned into equal sum subsets.
 */

/**
 * @author Meenu V Nair
 *
 */
public class PartitionEqualSubsetSum {

	private boolean canPartition(int[] nums) {
       int total = 0;
		for(int i : nums) {
    	   total += i;
       }
		if(total % 2 != 0)
			return false;
		
		return isPartitionPossible(nums, 0, 0, total, new HashMap<String, Boolean>());
    }
	
	public boolean isPartitionPossible(int[] nums, int index, int currentSum, int total, HashMap<String, Boolean> statusMap) {
		String currentStatus = index + "" + currentSum;
		
		if(statusMap.containsKey(currentStatus))
			return statusMap.get(currentStatus);
		if(currentSum > total / 2 || index >= nums.length)
			return false;
		System.out.println(currentSum + " -- " + index);
		if(currentSum * 2 == total)
			return true;
		
		boolean found = isPartitionPossible(nums, index + 1, currentSum, total, statusMap) || isPartitionPossible(nums, index + 1, currentSum + nums[index], total, statusMap);
		statusMap.put(currentStatus, found);
		return found;
	}
	
	public void findSolution() {
		int nums[] = new int[] {1, 5, 11, 5};
		System.out.println(canPartition(nums));
	}
}
