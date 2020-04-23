package com.meenu.codingskills.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/*
 * Given a set of distinct integers, nums, return all possible subsets (the power set).

Note: The solution set must not contain duplicate subsets.

Example:

Input: nums = [1,2,3]
Output:
[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
 */

/**
 * @author Meenu V Nair
 *
 */
public class Subsets {

	private List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        findSubset(nums, 0, new ArrayList<>(), subsets);
        
        return subsets;
    }
	
	private void findSubset(int[] nums, int index, List<Integer> current, List<List<Integer>> subsets) {
		subsets.add(new ArrayList<>(current));
		for(int i = index; i < nums.length; i++) {
			current.add(nums[i]);
			findSubset(nums, i + 1, current, subsets);
			current.remove(current.size() - 1);
		}
	}

	public void findSolution() {
		int nums[] = new int[] {1,2,3};
		List<List<Integer>> subsets = subsets(nums);
		for(List list : subsets) {
			System.out.println(list);
		}
	}
}
