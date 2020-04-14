package com.meenu.codingskills.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Problem description: Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

Example:
Input: "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 */

public class LetterCombinationOfPhoneNumber {
	@SuppressWarnings("serial")
	Map<String , String> phone = new HashMap<String, String>(){{
											put("2", "abc");
											put("3", "def");
											put("4", "ghi");
											put("5", "jkl");
											put("6", "mno");
											put("7", "pqrs");
											put("8", "tuv");
											put("9", "wxyz"); 
											}};
	
	static List<String> combinationList = new ArrayList<String>();

	public void findSolution() {
		String input = "23";
		letterCombination(input);
		
		System.out.println("combinations : ");
		for(int i = 0; i < combinationList.size(); i++) {
			System.out.print(combinationList.get(i) + " ");
		}
	}
	
	private void backtrack(String combination, String next_digits) {
		if(next_digits.length() == 0) {
			combinationList.add(combination);
		}
		else {
			String digit = next_digits.substring(0,1);
			String letters = phone.get(digit);
			for(int i = 0; i < letters.length() ; i++) {
				String letter = phone.get(digit).substring(i, i+1);
				backtrack(combination+letter, next_digits.substring(1));
			}
		}
	}

	@SuppressWarnings("null")
	private List<String> letterCombination(String digits){
		if(digits.equals(""))
			return combinationList;
		if(digits != null || digits.length() != 0)
			backtrack("", digits);
		return combinationList;
	}
}
