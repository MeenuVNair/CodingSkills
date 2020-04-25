package com.meenu.codingskills.dynamicProgramming;

import java.util.ArrayList;
import java.util.List;

/**
* @author Meenu V Nair
*
 * Creation time: Apr 25, 2020 1:56:43 PM
*
*/

public class NQueensProblem {

	private List<List<String>> solve(int n){
		List<List<String>> result = new ArrayList<>();
		
		solveNQueens(0, n, new ArrayList<>(), result);
		return result;
	}
	
	private void solveNQueens(int row, int n, List<Integer> colPlacements, List<List<String>> result) {
		if(row == n) {
			result.add(generateBoardFromPlacements(colPlacements, n));
			return;
		}
		
		for(int col = 0; col < n; col++) {
			colPlacements.add(col);
			if(isValidPlacement(colPlacements)) {
				solveNQueens(row + 1, n, colPlacements, result);
			}
			colPlacements.remove(colPlacements.size() - 1);
		}
	}
	
	private boolean isValidPlacement(List<Integer> colPlacements) {
		int rowWeAreValidatingOn = colPlacements.size() - 1;
		for (int ithQueenRow = 0; ithQueenRow < rowWeAreValidatingOn; ithQueenRow++) {
			int absoluteColumnDistance = Math.abs(colPlacements.get(ithQueenRow) - colPlacements.get(rowWeAreValidatingOn));
			int rowDistance = rowWeAreValidatingOn - ithQueenRow;
		      if (absoluteColumnDistance == 0 || absoluteColumnDistance == rowDistance) {
		        return false;
		      }
		}
		
		return true;
	}
	
	private List<String> generateBoardFromPlacements(List<Integer> colPlacements, int n) {
	    List<String> board = new ArrayList<>();
	    int totalItemsPlaced = colPlacements.size();

	    for (int row = 0; row < totalItemsPlaced; row++) {

	      StringBuilder sb = new StringBuilder();

	      /*
	        Go through all columns in the row and populate the string.
	        If the column has a queen in it place a 'Q', otherwise place
	        a '.'
	      */
	      for (int col = 0; col < n; col++) {
	        if (col == colPlacements.get(row)) {
	          sb.append(" Q   ");
	        } else {
	          sb.append(" -   ");
	        }
	      }

	      // Add the row to the board
	      board.add(sb.toString());
	    }

	    return board;
	  }
	
	public void findSolution() {
		List<List<String>> result = solve(4);
		
		for(int i = 0; i < result.size(); i++) {
			List list = result.get(i);
			for(Object s : list) {
				System.out.println(s);
			}
			System.out.println("---------------------------------");
			
		}
	}
}
