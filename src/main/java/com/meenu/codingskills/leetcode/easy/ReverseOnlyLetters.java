package com.meenu.codingskills.leetcode.easy;

/*
 * Given a string S, return the "reversed" string where all characters that are not a letter stay in the same place, and all letters reverse their positions.

Example 1:

Input: "ab-cd"
Output: "dc-ba"
Example 2:

Input: "a-bC-dEf-ghIj"
Output: "j-Ih-gfE-dCba"
Example 3:

Input: "Test1ng-Leet=code-Q!"
Output: "Qedo1ct-eeLg=ntse-T!"
 */

/**
 * @author Meenu V Nair
 *
 */
public class ReverseOnlyLetters {

	private String reverseOnlyLetters(String S) {
        char ch[] = new char[S.length()];
        int i = 0;
        int j = S.length() - 1;
        
        while(i < j) {
        	if(Character.isLetter(S.charAt(i)) && Character.isLetter(S.charAt(j))) {
        		ch[j] = S.charAt(i);
        		ch[i] = S.charAt(j);
        		i++;
        		j--;
        	}
        	else if(!Character.isLetter(S.charAt(i))) {
        		ch[i] = S.charAt(i);
        		i++;
        	}
        	else if(!Character.isLetter(S.charAt(j))) {
        		ch[j] = S.charAt(j);
        		j--;
        	}
        }
        if(i == j)
        	ch[i] = S.charAt(i);
        
        return new String(ch);
    }
	
	public void findSolution() {
		//String S = "ab-cd";
		//String S = "a-bC-dEf-ghIj";
		String S = "Test1ng-Leet=code-Q!";
		
		System.out.println("Reversed string : " + reverseOnlyLetters(S));
	}
}
