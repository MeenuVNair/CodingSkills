package com.meenu.codingskills.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/*
 * Given a string s, remove vowels from it , and return the new string.
  Example
  Input: "leetcodeisacommunityforcoders"
  Output : "ltcdscmmntyfrcdrs"
  
 */

/**
 * @author Meenu V Nair
 *
 */
public class RemoveVowelsFromAString {

	private String removeVowels(String s) {
		StringBuilder sb = new StringBuilder();
		
/***********************  second approach  **************************************/
		
		Set<Character> vowels = new HashSet<Character>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		
		for(char c : s.toCharArray()) {
			if(!vowels.contains(c))
				sb.append(c);
		}
		
		return sb.toString();

/***********************  first approach  **************************************/
				
		/*StringBuilder sb = new StringBuilder(s);
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'a' || s.charAt(i) == 'A' || s.charAt(i) == 'e' || s.charAt(i) == 'E' || s.charAt(i) == 'i' || s.charAt(i) == 'I' || s.charAt(i) == 'o' || s.charAt(i) == 'O' || s.charAt(i) == 'u' || s.charAt(i) == 'U') {
				int index = sb.indexOf(""+s.charAt(i), 0);
				sb.deleteCharAt(index);
			}
		}
		
		return sb.toString().replaceAll("!",""); */
	}
	
	public void findSolution() {
		String s = "leetcodeisacommunityforcoders";
		System.out.println("After removing vowels : " + removeVowels(s));
	}
}
