package com.meenu.codingskills.leetcode;

import java.util.HashSet;

/*
 * Given a time represented in the format "HH:MM", form the next closest time by reusing the current digits. There is no limit on how many times a digit can be reused.
You may assume the given input string is always valid. For example, "01:34", "12:09" are all valid. "1:34", "12:9" are all invalid.
Example 1:
Input: "19:34"
Output: "19:39"
Explanation: The next closest time choosing from digits 1, 9, 3, 4, is 19:39, 
    which occurs 5 minutes later.  It is not 19:33, because this occurs 23 hours and 59 minutes later.
    
 Example 2:
Input: "23:59"
Output: "22:22"
Explanation: The next closest time choosing from digits 2, 3, 5, 9, is 22:22. 
    It may be assumed that the returned time is next day's time since it is smaller than the input time numerically.
 */

public class NextClosestTime {

	private String nextCLosestTime(String time) {
		int minutes = Integer.parseInt(time.substring(0,2)) * 60;
		minutes += Integer.parseInt(time.substring(3));
		
		HashSet<Integer> digits = new HashSet<>();
		for(char c : time.toCharArray()) {
			digits.add(c - '0');
		}
		
		while(true) {
			minutes = (minutes + 1) % (60 * 24);
			int[] nextTime = {minutes / 60 / 10, minutes / 60 % 10, minutes % 60 / 10, minutes % 60 % 10};
			
			boolean isValid = true;
			for(int digit : nextTime) {
				if(!digits.contains(digit))
						isValid = false;
			}
			
			if(isValid)
				return String.format("%02d:%02d", minutes / 60, minutes % 60);
		}
	}
	
	public void findSolution() {
		String time = "19:34"; //"23:59";
		String nextClosestTime = nextCLosestTime(time);
		System.out.println("Next closest time : " + nextClosestTime);
	}
}
