package com.meenu.codingskills.leetcode.medium;

import java.util.Arrays;

/*
 * Given an unsorted array of integers, find the length of longest increasing subsequence.

Example:

Input: [10,9,2,5,3,7,101,18]
Output: 4 
Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4. 
Note:

There may be more than one LIS combination, it is only necessary for you to return the length.
Your algorithm should run in O(n2) complexity.
 */

/**
* @author Meenu V Nair
*
 * Creation time: Apr 25, 2020 11:55:58 PM
*
*/

public class LongestIncreasingSubsequence {

	private int lengthOfLIS(int[] nums) {
		if(nums.length == 0)
			return 0;
        int dp[] = new int[nums.length];
        Arrays.fill(dp, 1);
        
        int maxSoFar = 1;
        
        for(int j = 1; j < nums.length; j++) {
        	for(int i = 0; i < j; i++) {
        		if(nums[j] > nums[i]) {
        			dp[j] = Math.max(dp[j], dp[i] + 1);
        		}
        	}
        	
        	maxSoFar = Math.max(maxSoFar, dp[j]);
        }
        return maxSoFar;
    }
	
	public void findSolution() {
		//int nums[] = new int[] {10,9,2,5,3,7,101,18};
		int nums[] = new int[] {1,3,6,7,9,4,10,5,6};
		System.out.println("Length of longest increasing subsequence is : " + lengthOfLIS(nums));
	}
}
