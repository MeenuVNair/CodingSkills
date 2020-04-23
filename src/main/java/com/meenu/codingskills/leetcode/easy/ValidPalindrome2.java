package com.meenu.codingskills.leetcode.easy;

/*
 * Given a non-empty string s, you may delete at most one character. Judge whether you can make it a palindrome.

Example 1:
Input: "aba"
Output: True
Example 2:
Input: "abca"
Output: True
Explanation: You could delete the character 'c'.
 */

/**
 * @author Meenu V Nair
 *
 */
public class ValidPalindrome2 {

	private boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while(i < j) {
        	if(s.charAt(i) != s.charAt(j)) {
        		return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
        	}
        	i++;
        	j--;
        }
        return true;
    }
	
	private boolean isPalindrome(String s, int i, int j) {
		while(i < j) {
			if(s.charAt(i++) != s.charAt(j--))
				return false;
		}
		return true;
	}
	
	public void findSolution() {
		String s = "aba";
		//String s = "abca";
		
		System.out.println("Is valid palindrome ? " + validPalindrome(s));
	}
}
