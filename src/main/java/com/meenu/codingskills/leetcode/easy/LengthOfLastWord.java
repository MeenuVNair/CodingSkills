package com.meenu.codingskills.leetcode.easy;

/*
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word (last word means the last appearing word if we loop from left to right) in the string.

If the last word does not exist, return 0.

Note: A word is defined as a maximal substring consisting of non-space characters only.

Example:

Input: "Hello World"
Output: 5
 */

/**
 * @author Meenu V Nair
 *
 */
public class LengthOfLastWord {

	private int lengthOfLastWord(String s) {
		if(s == null || s.length() == 0 || s.equals("") || s.equals(" "))
            return 0;
        String array[] = s.replaceAll("[^a-zA-Z]", "!").split("!");
        return array.length == 0 ? 0 : array[array.length - 1].length();
    }
	
	public void findSolution() {
		String s = "      ";
		//String s = "Hello World";
		System.out.println("Length of last word : " + lengthOfLastWord(s));
	}
}
