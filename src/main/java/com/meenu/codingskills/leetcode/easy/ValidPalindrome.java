package com.meenu.codingskills.leetcode.easy;
/*
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true
Example 2:

Input: "race a car"
Output: false
 */

public class ValidPalindrome {

	private boolean isPalindrome(String s) {
        if(s == null || s.length() == 0 || s.equals(""))
        	return true;
        
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
     /********* first approach *****************/
        /*String reverse = "";
        for(int i = s.length() - 1; i >= 0; i--) {
        	reverse += s.charAt(i);
        }
        
        return s.equals(reverse);*/
        
    /**************** second approach *************/
        int i = 0;
        int j = s.length() - 1;
        while(i < j) {
        	if(s.charAt(i) == s.charAt(j)) {
        		i++;
        		j--;
        	}
        	else
        		return false;
        }
        
        return true;
    }
	
	public void findSolution() {
		String s = "A man, a plan, a canal: Panama";
		//String s = "race a car";
		//String s = "0P";
		System.out.println("Is palindrome : " + isPalindrome(s));
	}
}
