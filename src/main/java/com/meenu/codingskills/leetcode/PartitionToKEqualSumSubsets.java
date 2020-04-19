package com.meenu.codingskills.leetcode;

import java.util.HashMap;

/*
 * Given an array of integers nums and a positive integer k, find whether it's possible to divide this array into k non-empty subsets whose sums are all equal.

Example 1:

Input: nums = [4, 3, 2, 3, 5, 2, 1], k = 4
Output: True
Explanation: It's possible to divide it into 4 subsets (5), (1, 4), (2,3), (2,3) with equal sums.
 */

public class PartitionToKEqualSumSubsets {

	private boolean canPartitionKSubsets(int[] nums, int k) {
        if(k <= 0) 
        	return false;
        int total = 0;
        for(int i : nums) {
        	total += i;
        }
        
        if(total % k != 0)
        	return false;
        
        return canPartition(nums, 0, 0, total / k, k, new boolean[nums.length]);
    }
	
	private boolean canPartition(int[] nums, int index, int currentSum, int targetSum, int k, boolean[] used) {
		if(k == 1)
			return true;
		if(currentSum == targetSum)
			return canPartition(nums, 0, 0, targetSum, k - 1, used);
		
		for(int i = index; i < nums.length; i++) {
			if(!used[i] /*&& currentSum + nums[i] <= targetSum*/) {
				used[i] = true;
				if(canPartition(nums, i + 1, currentSum + nums[i], targetSum, k, used)) {
					return true;
				}
			//}
			used[i] = false;
			}
		}
		
		return false;
	}
	
	public void findSolution() {
		int nums[] = new int[] {2,2,2,2,3,4,5};
		int k = 2;
		System.out.println(canPartitionKSubsets(nums, k));
	}
}
