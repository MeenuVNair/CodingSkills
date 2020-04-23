package com.meenu.codingskills.leetcode.medium;

/*
 * Given an 2D board, count how many battleships are in it. The battleships are represented with 'X's, empty slots are represented with '.'s. You may assume the following rules:
You receive a valid board, made of only battleships or empty slots.
Battleships can only be placed horizontally or vertically. In other words, they can only be made of the shape 1xN (1 row, N columns) or Nx1 (N rows, 1 column), where N can be of any size.
At least one horizontal or vertical cell separates between two battleships - there are no adjacent battleships.
 * 
 * Input :  X..X
			...X
			...X
	Output : 2

Invalid input	Input : ...X 
						XXXX
						...X
This is an invalid board that you will not receive - as battleships will always have a cell separating between them.
 */

/**
 * @author Meenu V Nair
 *
 */
public class BattleshipsInABoard {
	private int countBattleShips(char[][] board) {
		if(board.length == 0)
			return -1;
		int ships = 0;
		for(int i = 0; i < board.length; i++) {
			for(int j= 0; j < board[i].length; j++) {
				if(board[i][j] == 'X') {
					ships += dfs(board, i, j);
				}
			}
		}
		return ships;
	}
	
	private int countBattleShipsSolution2(char[][] board) {
		if(board.length == 0)
			return -1;
		int ships = 0;
		for(int i = 0; i < board.length; i++) {
			for(int j= 0; j < board[i].length; j++) {
				if(board[i][j] == '.') {
					continue;
				}
				if(i > 0 && board[i - 1][j] == 'X') {
					continue;
				}
				if(j > 0 && board[i][j - 1] == 'X') {
					continue;
				}
				ships++;
			}
		}
		return ships;
	}
	
	private int dfs(char[][] board, int i, int j) {
		if(i < 0 || i >= board.length || j < 0 || j >= board[i].length || board[i][j] == '.') {
			return 0;
		}
		board[i][j] = '.';
		dfs(board, i + 1, j);
		dfs(board, i - 1, j);
		dfs(board, i, j + 1);
		dfs(board, i, j - 1);
		return 1;
	}
	
	public void findSolution() {
		char board1[][] = new char[][] {{'X','.','.','X'},
										{'.','.','.','X'},
										{'.','.','.','X'}
									};
		char board2[][] = new char[][] {{'X','.','.','X'},
										{'.','.','.','X'},
										{'.','.','.','X'}
									};
		printGrid(board1);
		int battleShips = countBattleShips(board1);
		System.out.println("Number of battleShips : " + battleShips + "\n");
		
		printGrid(board2);
		battleShips = countBattleShipsSolution2(board2);
		System.out.println("Number of battleShips with second solution : " + battleShips + "\n");
	}
	
	private void printGrid(char[][] board) {
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------\n");
	}
}
