package io.meenu.leetcode;

import java.util.HashMap;
import java.util.Map;

/*
 * Program to find first unique character in a given string
 * 
 */
public class FirstUniqueCharacterInString {
	public static Map<Character, Integer> map = new HashMap<>();

	public static void main(String[] args) {
		String inputString = "aaaabbbcdddeeefghffz";
		char nonRepeatingChar = findFirstNonRepeatingChar(inputString);
		System.out.println(nonRepeatingChar);
	}

	
	public static char findFirstNonRepeatingChar(String inputString) {
		int length = inputString.length();
		updateCharacterMap(inputString);
		for(int i = 0; i < length; i++) {
			if(map.get(inputString.charAt(i)) == 1) {
				return inputString.charAt(i);
			}
		}
		throw new IllegalArgumentException("No unique character found");
	}
	
	public static void updateCharacterMap(String inputString) {
		int length = inputString.length();
		for(int i = 0; i < length; i++) {
			if(map.containsKey(inputString.charAt(i))) {
				int count = map.get(inputString.charAt(i));
				map.put(inputString.charAt(i), count + 1);
			}
			else
				map.put(inputString.charAt(i), 1);
		}
	}
}
