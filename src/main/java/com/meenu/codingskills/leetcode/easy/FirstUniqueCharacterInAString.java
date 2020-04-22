package com.meenu.codingskills.leetcode.easy;

import java.util.HashMap;

/*
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
 */

public class FirstUniqueCharacterInAString {

	private int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) {
        	map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for(int i = 0; i < s.length(); i++) {
        	if(map.get(s.charAt(i)) == 1)
        		return i;
        }
        return -1;
    }
	
	public void findSolution() {
		String s = "leetcode";
		//String s = "loveleetcode";
		
		System.out.println("Index of first non-repeating character : " + firstUniqChar(s));
	}
}
