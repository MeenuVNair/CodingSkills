package com.meenu.codingskills.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sums to target.

Each number in candidates may only be used once in the combination.

Note:

All numbers (including target) will be positive integers.
The solution set must not contain duplicate combinations.
Example 1:

Input: candidates = [10,1,2,7,6,1,5], target = 8,
A solution set is:
[
  [1, 7],
  [1, 2, 5],
  [2, 6],
  [1, 1, 6]
]
Example 2:

Input: candidates = [2,5,2,1,2], target = 5,
A solution set is:
[
  [1,2,2],
  [5]
]
 */

public class CombinationSumII {

	private List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations(candidates, 0, target, new ArrayList<>(), result);
        
        return result;
    }
	
	private void findCombinations(int[] candidates, int index, int target, List<Integer> current, List<List<Integer>> result) {
		if(target == 0) {
			result.add(new ArrayList<>(current));
			return;
		}
		if(target < 0) {
			return;
		}
		
		for(int i = index; i < candidates.length; i++) {
			if(i == index || candidates[i] != candidates[i - 1]) {
				current.add(candidates[i]);
				findCombinations(candidates, i + 1, target - candidates[i], current, result);
				current.remove(current.size() - 1);
			}
		}
	}

	public void findSolution() {
		int candidates[] = new int[] {10,1,2,7,6,1,5};
		int target = 8;
		List<List<Integer>> result = combinationSum2(candidates, target);
		for(List list : result) {
			System.out.println(list);
		}
	}
}
