package com.meenu.codingskills.leetcode.easy;

import java.util.Arrays;

/*
 * Given two strings s and t , write a function to determine if t is an anagram of s.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 */

/**
 * @author Meenu V Nair
 *
 */
public class ValidAnagram {

	private boolean isAnagram(String s, String t) {
		
/*********************   first approach   *********************************/
		
		/*if(s == null || t == null || s.length() != t.length())
			return false;
		char sArray[] = s.toCharArray();
		Arrays.sort(sArray);
		
		char tArray[] = t.toCharArray();
		Arrays.sort(tArray);
       
		for(int i = 0; i < sArray.length; i++) {
			if(sArray[i] != tArray[i])
				return false;
		}
		return true;*/
		
/*********************  second approach  ****************************/
		
		if(s.length() != t.length())
			return false;
		
		int count[] = new int[26];
		for(int i = 0; i < s.length(); i++) {
			count[s.charAt(i) - 'a'] ++;
			count[t.charAt(i) - 'a'] --;
		}
		
		for(int i : count) {
			if(i != 0)
				return false;
		}
		
		return true;
    }
	
	public void findSolution() {
		String s = "anagram";
		String t = "nagaram";
		
		/*String s = "rat";
		String t = "car";*/
		
		System.out.println("Is anagram ? " + isAnagram(s, t));
	}
}
