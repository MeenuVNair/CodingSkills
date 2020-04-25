package com.meenu.codingskills.leetcode.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
* @author Meenu V Nair
*
 * Creation time: Apr 25, 2020 9:33:51 PM
*
*/

public class PermutationInString {

	boolean flag = false;
	private boolean checkInclusion(String s1, String s2) {
        generatePermutaions(0, s1, s2);
        return flag;
    }
	
	private void generatePermutaions(int start, String s1, String s2) {
		if(start == s1.length()) {
			if(s2.indexOf(s1) >= 0)
				flag = true;
		}
		else {		
			for(int i = start; i < s1.length(); i++) {
				s1 = swap(s1, start , i);
				generatePermutaions(start + 1, s1, s2);
				s1 = swap(s1, start , i);
			}
		}
	}
	
	private String swap(String s, int i0, int i1) {
        if (i0 == i1)
            return s;
        String s1 = s.substring(0, i0);
        String s2 = s.substring(i0 + 1, i1);
        String s3 = s.substring(i1 + 1);
        return s1 + s.charAt(i1) + s2 + s.charAt(i0) + s3;
    }
	
	public void findSolution() {
		/*String s1 = "ab";
		String s2 = "eidbaooo";*/
		
		String s1 = "a";
		String s2 = "ab";
		
		/*String s1= "ab";
		String s2 = "eidboaoo";*/
		
		System.out.println("Is first string a permutation of second string ? " + checkInclusion(s1, s2));
	}
	
}
