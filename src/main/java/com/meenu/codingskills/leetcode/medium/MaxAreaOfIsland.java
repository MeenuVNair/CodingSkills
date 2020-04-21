package com.meenu.codingskills.leetcode.medium;

/*
 * Given a non-empty 2D array grid of 0's and 1's, an island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.

Find the maximum area of an island in the given 2D array. (If there is no island, the maximum area is 0.)

Example 1:

[[0,0,1,0,0,0,0,1,0,0,0,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,1,1,0,1,0,0,0,0,0,0,0,0],
 [0,1,0,0,1,1,0,0,1,0,1,0,0],
 [0,1,0,0,1,1,0,0,1,1,1,0,0],
 [0,0,0,0,0,0,0,0,0,0,1,0,0],
 [0,0,0,0,0,0,0,1,1,1,0,0,0],
 [0,0,0,0,0,0,0,1,1,0,0,0,0]]
Given the above grid, return 6. Note the answer is not 11, because the island must be connected 4-directionally.
Example 2:

[[0,0,0,0,0,0,0,0]]
Given the above grid, return 0.
Note: The length of each dimension in the given grid does not exceed 50.
 */

public class MaxAreaOfIsland {

	public void findSolution() {
		int grid[][] = new int[][] { {0,0,1,0,0,0,0,1,0,0,0,0,0},
									 {0,0,0,0,0,0,0,1,1,1,0,0,0},
									 {0,1,1,0,1,0,0,0,0,0,0,0,0},
									 {0,1,0,0,1,1,0,0,1,0,1,0,0},
									 {0,1,0,0,1,1,0,0,1,1,1,0,0},
									 {0,0,0,0,0,0,0,0,0,0,1,0,0},
									 {0,0,0,0,0,0,0,1,1,1,0,0,0},
									 {0,0,0,0,0,0,0,1,1,0,0,0,0}
									};
		printGrid(grid);
		int maxAreaOfIsland = maxAreaOfIsland(grid);
		System.out.println("Number of islands : " + maxAreaOfIsland + "\n");							
	}
	
	private int maxAreaOfIsland(int[][] grid) {
		if(grid == null || grid.length == 0)
			return 0;
		int maxArea = 0;
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[i].length; j++) {
				if(grid[i][j] == 1) {
					maxArea = Math.max(maxArea, dfs(grid, i, j));
				}
			}
		}
		return maxArea;
	}
	
	private int dfs(int[][] grid, int i, int j) {
		if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == 0)
			return 0;
		grid[i][j] = 0;
		int count = 1;
		count += dfs(grid, i + 1, j);
		count += dfs(grid, i - 1, j);
		count += dfs(grid, i, j + 1);
		count += dfs(grid, i, j - 1);
		return count;
	}
	
	private void printGrid(int[][] grid) {
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[i].length; j++) {
				System.out.print(grid[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------\n");
	}

}
