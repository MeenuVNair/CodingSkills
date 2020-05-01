package com.meenu.codingskills.leetcode.easy;

/*
 * Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1
Clarification:

What should we return when needle is an empty string? This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 */

/**
* @author Meenu V Nair
*
 * Creation time: May 1, 2020 6:44:04 PM
*
*/

public class ImplementstrStr {

	private int strStr(String haystack, String needle) {
        if(needle == null || needle.length() == 0 || needle.equals("")) {
        	return 0;
        }
        
        for(int i = 0; i < haystack.length(); i++) {
        	if(i + needle.length() > haystack.length())
                return -1;
        	
        	int m = i;
        	for(int j = 0; j < needle.length(); j++) {
        		if(needle.charAt(j)==haystack.charAt(m)) {
        			if(j==needle.length()-1)
                        return i;
                    m++;
        		}
        		else
        			break;
        	}
        }
        
        return -1;
    }
	
	public void findSolution() {
		/*String haystack = "hello";
		String needle = "ll";*/
		
		/*String haystack = "aaaaa";
		String needle = "bba";*/
		
		/*String haystack = "aaa";
		String needle = "aaaa";*/
		
		String haystack = "mississippi";
		String needle = "pi";
		
		System.out.println("Index of first occurence of 'needle in 'haystack' : " + strStr(haystack, needle));
	}
}
