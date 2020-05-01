package com.meenu.codingskills.dynamicProgramming;

/*
 * Given a string s and a string t, check if s is subsequence of t.

You may assume that there is only lower case English letters in both s and t. t is potentially a very long (length ~= 500,000) string, and s is a short string (<=100).

A subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (ie, "ace" is a subsequence of "abcde" while "aec" is not).

Example 1:
s = "abc", t = "ahbgdc"

Return true.

Example 2:
s = "axc", t = "ahbgdc"

Return false.
 */

/**
* @author Meenu V Nair
*
 * Creation time: Apr 29, 2020 7:47:24 PM
*
*/

public class IsSubsequence {
	
	private boolean isSubsequence(String s, String t) {
		if(s.length() == 0)
			return true;
		int i = 0;
		int j = 0;
		
		while(i < s.length() && j < t.length()) {
			if(s.charAt(i) == t.charAt(j)) {
				i++;
			}
			j++;
		}
		if(i == s.length()) {
			return true;
		}
		return false;
	}
	
	public void findSolution() {
		String s = "abc";
		String t = "ahbgdc";
		
		/*String s = "axc";
		String t = "ahbgdc";*/
		
		System.out.println("Is string 's' a subsequence of String 't' ? " + isSubsequence(s, t));
	}
}
