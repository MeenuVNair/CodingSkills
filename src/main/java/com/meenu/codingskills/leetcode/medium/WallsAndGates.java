package com.meenu.codingskills.leetcode.medium;

/*
 * You are given a m x n 2D grid initialized with these three possible values.

-1 - A wall or an obstacle.
0 - A gate.
INF - Infinity means an empty room. We use the value 231 - 1 = 2147483647 to represent INF as you may assume that the distance to a gate is less than 2147483647. Fill each empty room with the distance to its nearest gate. If it is impossible to reach a gate, it should be filled with INF.
For example, given the 2D grid:

INF  -1  0  INF
INF INF INF  -1
INF  -1 INF  -1
  0  -1 INF INF
After running your function, the 2D grid should be:

 3  -1   0   1
 2   2   1  -1
 1  -1   2  -1
 0  -1   3   4
 */

public class WallsAndGates {
	public int INF = 2147483647;
	
	private void wallsAndGates(int[][] rooms) {
		for(int i = 0; i < rooms.length; i++) {
			for(int j = 0; j < rooms[i].length; j++) {
				if(rooms[i][j] == 0)
					dfs(i, j, 0, rooms);
			}
		}
		
	}
	
	private void dfs(int i, int j, int count, int[][] rooms) {
		if(i < 0 || i >= rooms.length || j < 0 || j >= rooms[i].length || rooms[i][j] < count) {
			return;
		}
		rooms[i][j] = count;
		dfs(i + 1, j, count + 1, rooms);
		dfs(i - 1, j, count + 1, rooms);
		dfs(i, j + 1, count + 1, rooms);
		dfs(i, j - 1, count + 1, rooms);
	}

	public void findSolution() {
		int rooms[][] = new int[][] {{INF, -1, 0, INF},
									{INF, INF, INF, -1},
									{INF, -1, INF, -1},
									{0, -1, INF, INF}
									};
		wallsAndGates(rooms);
		print(rooms);
	}
	
	private void print(int[][] rooms) {
		for(int i = 0; i < rooms.length; i++) {
			for(int j = 0; j < rooms[i].length; j++) {
				String s = String.valueOf(rooms[i][j]);
				if(s.equals("2147483647"))
					s = "INF";
				System.out.print(s + "\t");
			}
			System.out.println();
		}
		System.out.println("\n-------------------------\n");
	}
}
