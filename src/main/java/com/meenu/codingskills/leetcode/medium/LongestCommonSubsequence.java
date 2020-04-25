package com.meenu.codingskills.leetcode.medium;

/*
 * Given two strings text1 and text2, return the length of their longest common subsequence.

A subsequence of a string is a new string generated from the original string with some characters(can be none) deleted without changing the relative order of the remaining characters. (eg, "ace" is a subsequence of "abcde" while "aec" is not). A common subsequence of two strings is a subsequence that is common to both strings.

 

If there is no common subsequence, return 0.

 

Example 1:

Input: text1 = "abcde", text2 = "ace" 
Output: 3  
Explanation: The longest common subsequence is "ace" and its length is 3.
Example 2:

Input: text1 = "abc", text2 = "abc"
Output: 3
Explanation: The longest common subsequence is "abc" and its length is 3.
Example 3:

Input: text1 = "abc", text2 = "def"
Output: 0
Explanation: There is no such common subsequence, so the result is 0.
 */

/**
* @author Meenu V Nair
*
 * Creation time: Apr 25, 2020 11:21:24 PM
*
*/

public class LongestCommonSubsequence {

	private int longestCommonSubsequence(String s1, String s2) {
        int dp[][] = new int[s2.length() + 1][s1.length() + 1];
        
        int row = s2.length();
        int col = s1.length();
        
        dp[0][0] = 0;
        
        for(int i = 1; i <= row; i++) {
        	for(int j = 1; j <= col; j++) {
        		if(s2.charAt(i - 1) == s1.charAt(j - 1)) {
        			dp[i][j] = dp[i - 1][j - 1] + 1;
        		}
        		else {
        			dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
        		}
        	}
        }
        
        return dp[s2.length()][s1.length()];
    }
	
	public void findSolution() {
		String text1 = "abcde";
		String text2 = "ace";
		
		/*String text1 = "abc";
		String text2 = "abc";*/
		
		/*String text1 = "abc";
		String text2 = "def";*/
		
		System.out.println("Length of longest common subsequence : " + longestCommonSubsequence(text1, text2));
	}
}
