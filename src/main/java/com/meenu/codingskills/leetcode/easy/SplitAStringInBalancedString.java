package com.meenu.codingskills.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/*
 * Balanced strings are those who have equal quantity of 'L' and 'R' characters.

Given a balanced string s split it in the maximum amount of balanced strings.

Return the maximum amount of splitted balanced strings.

Example 1:
--------------
Input: s = "RLRRLLRLRL"
Output: 4
Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.

Example 2:
------------------
Input: s = "RLLLLRRRLR"
Output: 3
Explanation: s can be split into "RL", "LLLRRR", "LR", each substring contains same number of 'L' and 'R'.

Example 3:
---------------------
Input: s = "LLLLRRRR"
Output: 1
Explanation: s can be split into "LLLLRRRR".

Example 4:
-----------------------
Input: s = "RLRRRLLRLL"
Output: 2
Explanation: s can be split into "RL", "RRRLLRLL", since each substring contains an equal number of 'L' and 'R'
 */

/**
 * @author Meenu V Nair
 *
 */
public class SplitAStringInBalancedString {

	private int balancedStringSplit(String s) {        
        int balanced = 0;
        int stringCount = 0;
        
        int i = 0;
        while(i < s.length()) {
        	if(s.charAt(i) == 'R')
        		balanced++;
        	else if(s.charAt(i) == 'L')
        		balanced--;
        	if(balanced == 0)
        		stringCount++;
        	i++;
        }
       
        return stringCount;
    }
	
	public void findSolution() {
		String s = "RLRRLLRLRL";
		//String s = "RLLLLRRRLR";
		//String s = "LLLLRRRR";
		//String s = "RLRRRLLRLL";
		
		System.out.println("Number of balanced substrings : " + balancedStringSplit(s));
				
	}
}
