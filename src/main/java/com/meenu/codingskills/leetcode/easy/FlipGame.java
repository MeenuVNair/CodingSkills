package com.meenu.codingskills.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/*
 * You are playing the following Flip Game with your friend: Given a string that contains only these two characters: + and -, you and your friend take turns to flip two consecutive "++" into "--". The game ends when a person can no longer make a move and therefore the other person will be the winner.
 * Write a function to compute all possible states of the string after one valid move.
 * 
 * Example
 * Input : s = "++++"
 * Output:
 * 		[
 * 			"--++"
 * 			"+--+"
 * 			"++--"
 * 		]
 * 
 * Note : If no valid move, return an empty list [].
 */

/**
 * @author Meenu V Nair
 *
 */
public class FlipGame {
	
	private List<String> generatePossibleNextMoves(String s){
		
		List<String> possibleMoves = new ArrayList<>();
		int i = 0;
		while(i < s.length()) {
			int nextMove;
			if(i == 0)
				nextMove = s.indexOf("++");
			else
				nextMove = s.indexOf("++", i);
			
			if(nextMove == -1)
				return possibleMoves;
			
			String nextString = s.substring(0, nextMove) + "--" + s.substring(nextMove + 2);
			possibleMoves.add(nextString);
			
			i = nextMove + 1;
		}
		return possibleMoves;
	}
	
	public void findSolution() {
		String s = "++++";
		List<String> possibleMoves = generatePossibleNextMoves(s);
		for(String moves : possibleMoves) {
			System.out.println(moves);
		}
	} 
}
