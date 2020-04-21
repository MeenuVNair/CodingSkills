package com.meenu.codingskills.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
 * Given an array of strings, group anagrams together.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
 */

public class GroupedAnagrams {

	private List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        List<List<String>> groupedAnagram = new ArrayList<>();
        
        for(String current : strs) {
        	char[] characters = current.toCharArray();
        	Arrays.sort(characters);
        	String sorted = new String(characters);
        	if(!map.containsKey(sorted)) {
        		map.put(sorted, new ArrayList<>());
        	}
        	map.get(sorted).add(current);
        }
        groupedAnagram.addAll(map.values());
        return groupedAnagram;
    }

	public void findSolution() {
		String[] strs = new String[] {"eat", "tea", "tan", "ate", "nat", "bat"};
		List<List<String>> groupedAnagrams = groupAnagrams(strs);
		
		for(List list : groupedAnagrams) {
			System.out.println(list);
		}
	}
	
}
