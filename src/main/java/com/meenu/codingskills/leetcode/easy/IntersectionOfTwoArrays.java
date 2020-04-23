package com.meenu.codingskills.leetcode.easy;

import java.util.HashSet;

/*
 * Given two arrays, write a function to compute their intersection.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
 */

/**
 * @author Meenu V Nair
 *
 */
public class IntersectionOfTwoArrays {

	private int[] intersection(int[] nums1, int[] nums2) {
		
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums1) {
        	set.add(i);
        }
        
        HashSet<Integer> intersection  = new HashSet<>();
        for(int i : nums2) {
        	if(set.contains(i)) {
        		intersection.add(i);
        	}
        }
        
        int result[] = new int[intersection.size()];
        int index = 0;
        for(int i : intersection) {
        	result[index++] = i;
        }
        
        return result;
    }
	
	public void findSolution() {
		int nums1[] = new int[] {1,2,2,1};
		int nums2[] = new int[] {2,2};
		
		/*int nums1[] = new int[] {4,9,5};
		int nums2[] = new int[] {9,4,9,8,4};*/
		
		int intersection[] = intersection(nums1, nums2);
		for(int i : intersection) {
			System.out.print(i + "  ");
		}
	}
}
