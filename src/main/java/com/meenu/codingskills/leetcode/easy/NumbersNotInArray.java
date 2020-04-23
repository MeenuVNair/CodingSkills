package com.meenu.codingskills.leetcode.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements of [1, n] inclusive that do not appear in this array.

Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

Example:

Input:
[4,3,2,7,8,2,3,1]

Output:
[5,6]
 */

/**
 * @author Meenu V Nair
 *
 */
public class NumbersNotInArray {

	private List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missingNumbers = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int num : nums)
        	set.add(num);
        
        for(int i = 1; i <= nums.length; i++) {
        	if(!set.contains(i))
        		missingNumbers.add(i);
        }
        
        return missingNumbers;
    }
	
	public void findSolution() {
		int nums[] = new int[] {4,3,2,7,8,2,3,1};
		List<Integer> missingNumbers = findDisappearedNumbers(nums);
		for(Integer i : missingNumbers) {
			System.out.print(i + "  ");
		}
	}
}
