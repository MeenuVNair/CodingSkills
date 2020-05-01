package com.meenu.codingskills.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/*
 * Given a string s, partition s such that every substring of the partition is a palindrome.

Return all possible palindrome partitioning of s.

Example:

Input: "aab"
Output:
[
  ["aa","b"],
  ["a","a","b"]
]
 */

/**
* @author Meenu V Nair
*
 * Creation time: Apr 26, 2020 2:38:42 PM
*
*/

public class PalindromePartitioning {

	private List<List<String>> partition(String s) {
        
		List<List<String>> result = new ArrayList<>();
		generatePartitions(0, s, new ArrayList<>(), result);
		
		return result;
    }
	
	private void generatePartitions(int start, String s, List<String> currentPartition, List<List<String>> result) {
		if(start == s.length()) {
			result.add(new ArrayList<>(currentPartition));
			return;
		}
		
		for(int i = start; i < s.length(); i++) {
			if(isPalindrome(s, start, i)) {
				String currentSubstring = s.substring(start, i + 1);
				currentPartition.add(currentSubstring);
				generatePartitions(i + 1, s, currentPartition, result);
				currentPartition.remove(currentPartition.size() - 1);
			}
		}
	}
	
	private boolean isPalindrome(String s, int i, int j) {
		while(i < j) {
			if(s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
	
	public void findSolution() {
		String s = "aab";
		List<List<String>> result = partition(s);
		for(List list : result) {
			System.out.println(list);
		}
	}
}
