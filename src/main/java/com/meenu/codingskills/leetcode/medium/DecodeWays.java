package com.meenu.codingskills.leetcode.medium;

/*
 * A message containing letters from A-Z is being encoded to numbers using the following mapping:

'A' -> 1
'B' -> 2
...
'Z' -> 26
Given a non-empty string containing only digits, determine the total number of ways to decode it.

Example 1:

Input: "12"
Output: 2
Explanation: It could be decoded as "AB" (1 2) or "L" (12).
Example 2:

Input: "226"
Output: 3
Explanation: It could be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6). 
 */

/**
 * @author Meenu V Nair
 *
 */
public class DecodeWays {

	private int numDecodings(String s) {
		int decodings[] = new int[s.length() + 1];
		decodings[0] = 1;
		decodings[1] = s.charAt(0) == '0' ? 0 : 1;
		for(int i = 2; i <= s.length(); i++) {
			int oneDigit = Integer.valueOf(s.substring(i - 1, i));
			int twoDigit = Integer.valueOf(s.substring(i - 2, i));
			if(oneDigit >= 1)
				decodings[i] += decodings[i - 1];
			if(twoDigit >= 10 && twoDigit <= 26)
				decodings[i] += decodings[i - 2];
		}
		return decodings[s.length()];
 	}
	
	public void findSolution() {
		String s = "12";
		int numDecodings = numDecodings(s);
		System.out.println("Number of decodings : " + numDecodings);
	}
}
