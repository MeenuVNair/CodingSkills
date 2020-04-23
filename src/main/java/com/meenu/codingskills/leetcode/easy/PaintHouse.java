package com.meenu.codingskills.leetcode.easy;

/*
 * There are a row of n houses, each house can be painted with one of the three colors: red, blue or green. The cost of painting each house with a certain color is different. You have to paint all the houses such that no two adjacent houses have the same color.

The cost of painting each house with a certain color is represented by a n x 3 cost matrix. For example, costs[0][0] is the cost of painting house 0 with color red; costs[1][2] is the cost of painting house 1 with color green, and so on... Find the minimum cost to paint all houses.

Note:
All costs are positive integers.

Example:
Input: [[17,2,17],[16,16,5],[14,3,19]]
Output: 10
Explanation: Paint house 0 into blue, paint house 1 into green, paint house 2 into blue. 
Minimum cost: 2 + 5 + 3 = 10.
 */

/**
 * @author Meenu V Nair
 *
 */
public class PaintHouse {
	
	private int minCost(int[][] costs) {
		int i = 0;
		int j;
		int min;
		int minCost = 0;
		while(i < costs.length) {
			j = 0;
			min = Integer.MAX_VALUE;
			while(j < costs[i].length) {
				min = Math.min(min, costs[i][j]);
				j++;
			}
			minCost += min;
			i++;
		}
		return minCost;
	}

	public void findSolution() {
		int costs[][] = new int[][] {{17,2,17},
									 {16,16,5},
									 {14,3,19}
								};
		int minCost = minCost(costs);
		System.out.println("Minimum cost to paint houses : " + minCost);
	}
}
