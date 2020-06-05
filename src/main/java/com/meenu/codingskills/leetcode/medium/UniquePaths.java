package com.meenu.codingskills.leetcode.medium;

/*
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

How many possible unique paths are there?

Example 1:

Input: m = 3, n = 2
Output: 3
Explanation:
From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
1. Right -> Right -> Down
2. Right -> Down -> Right
3. Down -> Right -> Right

Example 2:

Input: m = 7, n = 3
Output: 28
 */

/**
 * @author Meenu V Nair
 *
 */
public class UniquePaths {

	private int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i = 0; i < dp.length; i++) {
        	dp[i][0] = 1;
        }
        for(int i = 0; i < dp[0].length; i++) {
        	dp[0][i] = 1;
        }
        
        for(int i = 1; i < dp.length; i++) {
        	for(int j = 1; j < dp[i].length; j++) {
        		dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
        	}
        }
        
        return dp[m - 1][n - 1];
    }

	public void findSolution() {
		int m = 3; int n = 2;
		int uniquePaths = uniquePaths(m, n);
		System.out.println("Unique paths : "+ uniquePaths);
	}
}
