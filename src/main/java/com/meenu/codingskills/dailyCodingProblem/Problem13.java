package com.meenu.codingskills.dailyCodingProblem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
* @author Meenu V. Nair
*
 * Creation time: Jun 1, 2020 2:16:47 PM
*
*/

/*
 * Given an integer k and a string s, find the length of the longest substring that contains at most k distinct characters.

For example, given s = "abcba" and k = 2, the longest substring with k distinct characters is "bcb".


 */

public class Problem13 {
	
	private Integer findLongestSubstring(String s, int k) {
		if(s == null || s.equals(""))
			return null;
		Map<String, Integer> map = new HashMap<>();
		for(int i = 0; i < s.length(); i++) {
			map = populateMap(s, k, map, i);
		}
		
		int max = -1;
		for(Integer value : map.values()) {
			if(value > max) {
				max = value;
			}
		}
		return max;
	}
	
	private Map<String, Integer> populateMap(String s, int k, Map<String, Integer> map, int i) {
		String longestSubstring = "";
		while(i < s.length()) {
			Set<Character> set = new HashSet<>();
			set.add(s.charAt(i));
			longestSubstring = longestSubstring + s.charAt(i);
			int j = i + 1;
			while(j < s.length()) {
				if(set.contains(s.charAt(j))) {
					longestSubstring = longestSubstring + s.charAt(j);
				}
				else if(!set.contains(s.charAt(j)) && set.size() < k) {
					set.add(s.charAt(j));
					longestSubstring = longestSubstring + s.charAt(j);
				}
				else if(!set.contains(s.charAt(j)) && set.size() >= k) {
					set.add(s.charAt(j));
					map.put(longestSubstring, longestSubstring.length());
					longestSubstring = "";
					i = j;
					break;
				}
				j++;
			}
			if(i < s.length() && j >= s.length()) {
				map.put(longestSubstring, longestSubstring.length());
				longestSubstring = "";
				i++;
			}
		}
		return map;
	}

	public void findSolution() {
		int k = 2;
		String s = "abcba";
		System.out.println("Length of longest substring with " + k + " distinct characters : " + findLongestSubstring(s, k));
	}
}
