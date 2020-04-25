package com.meenu.codingskills.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/*
 * Given a collection of distinct integers, return all possible permutations.

Example:

Input: [1,2,3]
Output:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]
 */

/**
* @author Meenu V Nair
*
 * Creation time: Apr 25, 2020 9:02:09 PM
*
*/

public class Permutations {
	
	private List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> allPossiblePermutations = new ArrayList<>();
        
        generatePermutation(new ArrayList<>(), nums, allPossiblePermutations);
        return allPossiblePermutations;
    }

	private void generatePermutation(List<Integer> currentPossibleCombinations, int[] nums, List<List<Integer>> allPossiblePermutations) {
		if(currentPossibleCombinations.size() == nums.length) {
			allPossiblePermutations.add(new ArrayList<>(currentPossibleCombinations));
			return;
		}
		
		for(int i : nums) {
			int choice = i;
			if(currentPossibleCombinations.contains(choice)) {
				continue;
			}
			currentPossibleCombinations.add(choice);
			generatePermutation(currentPossibleCombinations, nums, allPossiblePermutations);
			currentPossibleCombinations.remove(currentPossibleCombinations.size() - 1);
		}
	}
	
	public void findSolution() {
		int nums[] = new int[] {1,2,3};
		List<List<Integer>> allPossiblePermutations = permute(nums);
		for(List list : allPossiblePermutations) {
			System.out.println(list);
		}
	}
}
