package com.meenu.codingskills.leetcode.easy;

import java.util.HashMap;

/*
 * Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

Each letter in the magazine string can only be used once in your ransom note.

Note:
You may assume that both strings contain only lowercase letters.

canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true
 */

/**
 * @author Meenu V Nair
 *
 */
public class RansomNote {
	
	private boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : magazine.toCharArray()) {
        	map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for(int i = 0; i < ransomNote.length(); i++) {
        	char c = ransomNote.charAt(i);
        	if(map.containsKey(c) && map.get(c) > 0)
        		map.put(c, map.get(c) - 1);
        	else
        		return false;
        }
        return true;
    }

	public void findSolution() {
		String ransomNote = "a";
		String magazine = "b";
		/*String ransomNote = "aa";
		String magazine = "ab";*/
		/*String ransomNote = "aa";
		String magazine = "aab";*/
		
		System.out.println("Can construct ransom note from magazine ? " + canConstruct(ransomNote, magazine));
	}
}
