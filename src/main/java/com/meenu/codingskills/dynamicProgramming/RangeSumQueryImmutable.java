package com.meenu.codingskills.dynamicProgramming;
/*
 * Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.

Example:
Given nums = [-2, 0, 3, -5, 2, -1]

sumRange(0, 2) -> 1
sumRange(2, 5) -> -1
sumRange(0, 5) -> -3
Note:
You may assume that the array does not change.
There are many calls to sumRange function.
 */

/**
* @author Meenu V Nair
*
 * Creation time: Apr 29, 2020 6:29:26 PM
*
*/

public class RangeSumQueryImmutable {
	
/*******************************  first approach  *******************************************/
	/* int array[];

	    public RangeSumQueryImmutable(int[] nums) {
	       array = new int[nums.length];
	        for(int i = 0; i < nums.length; i++){
	            array[i] = nums[i];
	        }
	        if(nums.length > 0) {
	        int dp[] = new int[nums.length];
	        dp[0] = nums[0];
	        for(int i = 1; i < nums.length; i++) {
	        	dp[i] = dp[i - 1] + nums[i];
	        }
	       int sum = dp[nums.length];
	        }
	    }
	    
	    public int sumRange(int i, int j) {
	        int sum = 0;
	        for(int start = i; start <= j; start++){
	            sum += array[start];
	        }
	        return sum;
	    }*/
	
/**
 * *******************************   second approach   ***************************************/
	int dp[];
	
	public RangeSumQueryImmutable(int[] nums) {
		
	   if(nums.length > 0) {
	        dp = new int[nums.length + 1];
	        for(int i = 0; i < nums.length; i++) {
	        	dp[i + 1] = dp[i] + nums[i];
	        }
	   }
	}
	    
	    public int sumRange(int i, int j) {
	        return dp[j + 1] - dp[i];
	    }
	
	public void findSolution() {
		int nums[] = new int[] {-2, 0, 3, -5, 2, -1};
		RangeSumQueryImmutable obj = new RangeSumQueryImmutable(nums);
		int sum = obj.sumRange(0, 2);
		System.out.println("Range sum : " + sum);
	}
}
