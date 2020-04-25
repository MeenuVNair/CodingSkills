package com.meenu.codingskills.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Problem description: Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

Example:
Input: "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 */

/**
 * @author Meenu V Nair
 *
 */
public class LetterCombinationOfPhoneNumber {
	

/***********************  Second solution from BackToBackSWE  **********************************************/
	
	private List<String> letterCombination(String digits){
		if(digits.length() == 0)
			return new ArrayList<>();
		
		List<String> allCombinations = new ArrayList<>();
		exploreCombinations(0, new StringBuilder(), digits, allCombinations);
		
		return allCombinations;
	}
	
	private void exploreCombinations(int currentDigit, StringBuilder partialCombination, String digits, List<String> allCombinations) {
		
		if(currentDigit == digits.length()) {
			allCombinations.add(partialCombination.toString());
			return;
		}
		
		char digitCharacter = digits.charAt(currentDigit);
		int digitIntValue = digitCharacter - '0';
		
		String letters = digitToLetterMapping.get(digitIntValue);
		
		for(char possibleLetter : letters.toCharArray()) {
			partialCombination.append(possibleLetter);
			exploreCombinations(currentDigit + 1, partialCombination, digits, allCombinations);
			partialCombination.deleteCharAt(partialCombination.length() - 1);
		}
	}
	
	public void findSolution() {
		String input = "23";
		List<String> combinationList = letterCombination(input);
		
		System.out.println("combinations : ");
		for(int i = 0; i < combinationList.size(); i++) {
			System.out.print(combinationList.get(i) + " ");
		}
	}
	
	private List<String> digitToLetterMapping = Arrays.asList(
			"",		// no combinations for 0 and 1
			"",
			"abc",
			"def",
			"ghi",
			"jkl",
			"mno",
			"pqrs",
			"tuv",
			"wxyz"
			);
	
/************************ First solution from Kevin Naughton Jr.  *******************************************/
	
	/*
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
	*/
}
