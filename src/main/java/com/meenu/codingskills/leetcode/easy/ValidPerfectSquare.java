package com.meenu.codingskills.leetcode.easy;

/*
 * Given a positive integer num, write a function which returns True if num is a perfect square else False.

Note: Do not use any built-in library function such as sqrt.

Example 1:

Input: 16
Output: true
Example 2:

Input: 14
Output: false
 */

/**
 * @author Meenu V Nair
 *
 */
public class ValidPerfectSquare {

	private boolean isPerfectSquare(int num) {
        if(num == 1)
            return true;
       int x = num % 10;
        if(x == 2 || x == 3 || x == 7 || x == 8)
            return false;
        
        for(int i = 0; i < num / 2 + 1 ; i++){
            if(i * i == num){
                return true;
            }
        }
        return false;
    }
	
	public void findSolution() {
		int num = 16;
		//int num = 14;
		
		System.out.println("Is calid perfect square ? " + isPerfectSquare(num));
	}
}
