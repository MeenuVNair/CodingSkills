package com.meenu.codingskills.dynamicProgramming;

import java.util.Arrays;

/*
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Follow up:

If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */

/**
* @author Meenu V Nair
*
 * Creation time: Apr 29, 2020 5:51:31 PM
*
*/

public class MaximumSubarray {

	private int maxSubArray(int[] nums) {
       int maxSum = nums[0];
        int dp[] = new int[nums.length];
        
        dp[0] = nums[0];
        
        for(int i = 1; i < nums.length; i++) {
        	dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
        	maxSum = Math.max(maxSum, dp[i]);
        }
        
        return maxSum;
    }
	
	public void findSolution() {
		int nums[] = new int[] {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println("Max sum of subarray : " + maxSubArray(nums));
	}
}
