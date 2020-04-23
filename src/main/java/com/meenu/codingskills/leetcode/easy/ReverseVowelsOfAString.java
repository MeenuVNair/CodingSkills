package com.meenu.codingskills.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/*
 * Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:

Input: "hello"
Output: "holle"
Example 2:

Input: "leetcode"
Output: "leotcede"
 */

/**
 * @author Meenu V Nair
 *
 */
public class ReverseVowelsOfAString {

	private String reverseVowels(String s) {
		
/*************************************  Second Approach  *******************************************/
		if(s == null || s.length() == 0 || s.equals(""))
        	return "";
		Set<Character> vowels = new HashSet<>();
		vowels.add('a');
		vowels.add('A');
		vowels.add('e');
		vowels.add('E');
		vowels.add('i');
		vowels.add('I');
		vowels.add('o');
		vowels.add('O');
		vowels.add('u');
		vowels.add('U');
		
		char characters[] = s.toCharArray();
		int i = 0; int j = s.length() - 1;
		
		while(i < j) {
			if(vowels.contains(characters[i])) {
				while(i < j) {
					if(vowels.contains(characters[j])) {
						char c= characters[i];
						characters[i] = characters[j];
						characters[j] = c;
						i++;
						j--;
						break;
					}
					else {
						j--;
					}
				}
			}else {
				i++;
			}
		}
		
		return new String(characters);
		
		
/************************************** First Approach *********************************************/
		
		
        /*if(s == null || s.length() == 0 || s.equals(""))
        	return "";
        
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        int j = sb.length() - 1;
        while(i < j) {
        	if(sb.charAt(i) == 'a' || sb.charAt(i) == 'A' || sb.charAt(i) == 'e' || sb.charAt(i) == 'E' || sb.charAt(i) == 'i' || sb.charAt(i) == 'I' || sb.charAt(i) == 'o' || sb.charAt(i) == 'O' || sb.charAt(i) == 'u' || sb.charAt(i) == 'U') {
        		
        		while(j > i) {
        			if(sb.charAt(j) == 'a' || sb.charAt(j) == 'A' || sb.charAt(j) == 'e' || sb.charAt(j) == 'E' || sb.charAt(j) == 'i' || sb.charAt(j) == 'I' || sb.charAt(j) == 'o' || sb.charAt(j) == 'O' || sb.charAt(j) == 'u' || sb.charAt(j) == 'U') {
	                	s = s.substring(0, i) + s.charAt(j) + s.substring(i + 1, j) + s.charAt(i) + s.substring(j + 1);
	                	i++;
	                	j--;
	                	break;
        			}
        			else {
        				j--;
        			}
        		}
        	}
        	else
        		i++;
        }
        
        return s;*/
    }
	
	public void findSolution() {
		String s = "A man, a plan, a canal: Panama";
		//String s = "aA";
		//String s = "hello";
		//String s = "leetcode";
		
		System.out.println("After reversing vowels : " + reverseVowels(s));
	}
}
