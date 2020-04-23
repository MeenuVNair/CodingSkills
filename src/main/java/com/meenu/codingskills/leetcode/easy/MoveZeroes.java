package com.meenu.codingskills.leetcode.easy;

/*
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12] 1 0 1
Output: [1,3,12,0,0]
 */

/**
 * @author Meenu V Nair
 *
 */
public class MoveZeroes {

	private void moveZeroes(int[] nums) {
		int j = 0;
        for(int i = 0; i < nums.length; i++) {
        	if(nums[i] != 0) {
        		nums[j++] = nums[i];
        	}
        }
        for(int i = j; i < nums.length; i++) {
        	nums[i] = 0;
        }
        for(int i : nums) {
        	System.out.print(i);
        }
    }
	
	public void findSolution() {
		int nums[] = new int[] {0,1,0,3,12};
		//int nums[] = new int[] {1,0,1};
		moveZeroes(nums);
	}
}
