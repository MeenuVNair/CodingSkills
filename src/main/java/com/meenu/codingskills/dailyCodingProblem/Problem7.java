package com.meenu.codingskills.dailyCodingProblem;

/*
 * Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.

For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.
 */

/**
* @author Meenu V. Nair
*
 * Creation time: May 6, 2020 3:17:43 PM
*
*/

public class Problem7 {
	
	private int decodeWays(String s) {
		int dp[] = new int[s.length() + 1];
		dp[0] = 1;
		dp[1] = s.charAt(0) == '0' ? 0 : 1;
		for(int i = 2; i <= s.length(); i++) {
			int one = Integer.valueOf(s.substring(i - 1, i));
			int two = Integer.valueOf(s.substring(i - 2, i));
			
			if(one >= 1) {
				dp[i] += dp[i - 1];
			}
			if(two >=10 && two <= 26) {
				dp[i] += dp[i -2];
			}
		}
		
		return dp[s.length()];
	}

	public void findSolution() {
		String s = "111";
		System.out.println("Number of ways 's' can be decoded : " + decodeWays(s));
	}
}
