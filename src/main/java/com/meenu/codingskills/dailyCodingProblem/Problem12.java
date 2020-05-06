package com.meenu.codingskills.dailyCodingProblem;

/*
 * There exists a staircase with N steps, and you can climb up either 1 or 2 steps at a time. Given N, write a function that returns the number of unique ways you can climb the staircase. The order of the steps matters.

For example, if N is 4, then there are 5 unique ways:

1, 1, 1, 1
2, 1, 1
1, 2, 1
1, 1, 2
2, 2
 */

/**
* @author Meenu V. Nair
*
 * Creation time: May 6, 2020 9:30:13 PM
*
*/

public class Problem12 {
	
	private int waysToClimb(int n) {
		int dp[] = new int[n + 1];
		
		if(n <= 2)
			return n;
		
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		
		for(int i = 3; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		
		return dp[n];
	}

	public void findSolution() {
		int n = 4;
		System.out.println("Number of unique ways to climb the steps : " + waysToClimb(n));
	}
}
