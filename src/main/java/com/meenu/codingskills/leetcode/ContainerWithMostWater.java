package com.meenu.codingskills.leetcode;

/*
 * Problem description: Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container and n is at least 2.
 */

public class ContainerWithMostWater {

	public static void main(String[] args) {
		
		ContainerWithMostWater obj = new ContainerWithMostWater();
		 int a[] = {1, 5, 4, 3}; 
	     int b[] = {3, 1, 2, 4, 5}; 
	    
	     int maxArea = obj.maxArea(a);
	     System.out.println("Max area : " + maxArea);
	     
	     maxArea = obj.maxAreaSecondApproach(b);
	     System.out.println("Max area : " + maxArea);
	     
	}

	// first approach
	public int maxArea(int[] height) {
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < height.length; i++) {
			for(int j = i + 1; j < height.length; j++) {
				int min = Math.min(height[i], height[j]);
				max = Math.max(max, min * ( j - i));
			}
		}
		return max;
	}
	
	//second approach
	public int maxAreaSecondApproach(int[] height) {
		int l = 0;
		int r = height.length - 1;
		int max = Integer.MIN_VALUE;
		while(l < r) {
			int min = Math.min(height[l], height[r]);
			max = Math.max(max, min * (r - l));
			if(height[l] < height[r])
				l++;
			else
				r--;
		}
		return max;
	}
}
