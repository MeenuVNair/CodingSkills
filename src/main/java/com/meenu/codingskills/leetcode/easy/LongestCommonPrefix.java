package com.meenu.codingskills.leetcode.easy;

/*
 * Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 */

public class LongestCommonPrefix {

	private String longestCommonPrefix(String[] strs) {
		String prefix = "";
        if(strs == null || strs.length == 0)
        	return prefix;
        
        int index = 0;
        for(char c : strs[0].toCharArray()) {
        	for(int i = 1; i < strs.length; i++) {
        		if(index >= strs[i].length() || strs[i].charAt(index) != c)
        			return prefix;
        	}
        	prefix += c;
        	index++;
        }
        
        return prefix;
    }
	
	public void findSolution() {
		//String strs[] = new String[] {"flower","flow","flight"};
		String strs[] = new String[] {"dog","racecar","car"};
		
		System.out.println("Longest common prefix  : " + longestCommonPrefix(strs));
	}
}
