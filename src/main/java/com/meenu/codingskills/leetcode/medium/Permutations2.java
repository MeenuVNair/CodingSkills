package com.meenu.codingskills.leetcode.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
* @author Meenu V Nair
*
 * Creation time: Apr 25, 2020 9:13:15 PM
*
*/

public class Permutations2 {

	private List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> allPossiblePermutations = new ArrayList<>();
        
        generatePermutation(0, nums, allPossiblePermutations);
        return allPossiblePermutations;
    }
	
	private void generatePermutation(int start, int[] nums, List<List<Integer>> allPossiblePermutations) {
		
		if(start == nums.length - 1) {
			List<Integer> currentPossibleCombinations = new ArrayList<>();
			for(int i : nums) {
				currentPossibleCombinations.add(i);
			}
			allPossiblePermutations.add(currentPossibleCombinations);
			return;
		}
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int i = start; i < nums.length; i++) {
			int choice = nums[i];
			if(set.contains(choice)) {
				continue;
			}
			set.add(choice);
			swap(nums, i, start);
			generatePermutation(start + 1, nums, allPossiblePermutations);
			swap(nums, i, start);
		}
	}
	
	private void swap(int[] nums, int i, int j){
	    int temp = nums[i];
	    nums[i] = nums[j];
	    nums[j] = temp;
	}
	
	public void findSolution() {
		int nums[] = new int[] {1,1,2};
		List<List<Integer>> allPossiblePermutations = permute(nums);
		for(List list : allPossiblePermutations) {
			System.out.println(list);
		}
	}
}
