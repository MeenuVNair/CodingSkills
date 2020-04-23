package com.meenu.codingskills.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Given two arrays, write a function to compute their intersection.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Note:

Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.
 */

/**
 * @author Meenu V Nair
 *
 */
public class IntersectionOfTwoArrays2 {

	private int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums1) {
        	map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        int index = 0;
        List<Integer> list = new ArrayList<>();
        
        for(int i : nums2) {
        	if(map.containsKey(i) && map.get(i) >= 1) {
        		list.add(i);
        		map.put(i, map.get(i) - 1);
        	}
        }
        
        int intersection[] = new int[list.size()];
        for(int i : list) {
        	intersection[index++] = i;
        }
        return intersection;
    }
	
	public void findSolution() {
		/*int nums1[] = new int[] {1,2,2,1};
		int nums2[] = new int[] {2,2};*/
		
		int nums1[] = new int[] {4,9,5};
		int nums2[] = new int[] {9,4,9,8,4};
		
		int intersection[] = intersect(nums1, nums2);
		for(int i : intersection) {
			System.out.print(i + "  ");
		}
	}
}
