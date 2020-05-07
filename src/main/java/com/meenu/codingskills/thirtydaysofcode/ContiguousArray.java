package com.meenu.codingskills.thirtydaysofcode;

import java.util.HashMap;
import java.util.Map;

/*
 * Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.

Example 1:
Input: [0,1]
Output: 2
Explanation: [0, 1] is the longest contiguous subarray with equal number of 0 and 1.
Example 2:
Input: [0,1,0]
Output: 2
Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.
 */

/**
* @author Meenu V. Nair
*
 * Creation time: May 7, 2020 1:12:57 PM
*
*/

public class ContiguousArray {

	private int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int count = 0;
        int longest = 0;
        
        for(int i = 0; i < nums.length; i++) {
        	if(nums[i] == 0)
        		count = count - 1;
        	else
        		count = count + 1;
        	
        	if(map.containsKey(count)) {
        		longest = Math.max(longest, i - map.get(count));
        	}
        	else
        		map.put(count, i);
        }
        
        return longest;
    }
	
	public void findSolution() {
		int nums[] = new int[] {0,1};
		//int nums[] = new int[] {0,1,0};
		
		System.out.println("Maximum length of a contiguous subarray with equal number of 0 and 1 : " + findMaxLength(nums));
	}
}
