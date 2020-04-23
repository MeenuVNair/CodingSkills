package com.meenu.codingskills.leetcode.easy;

/*
 * An array is monotonic if it is either monotone increasing or monotone decreasing.

An array A is monotone increasing if for all i <= j, A[i] <= A[j].  An array A is monotone decreasing if for all i <= j, A[i] >= A[j].

Return true if and only if the given array A is monotonic.

Example 1:

Input: [1,2,2,3]
Output: true
Example 2:

Input: [6,5,4,4]
Output: true
Example 3:

Input: [1,3,2]
Output: false
Example 4:

Input: [1,2,4,5]
Output: true
Example 5:

Input: [1,1,1]
Output: true
 */

/**
 * @author Meenu V Nair
 *
 */
public class MonotonicArray {

	private boolean isMonotonic(int[] A) {
        boolean increasing = true;
        boolean decreasing = true;
        
        for(int i = 0; i < A.length - 1; i++) {
        	if(A[i] > A[i + 1])
        		increasing = false;
        	
        	if(A[i] < A[i + 1])
        		decreasing = false;
        }
        
        return increasing || decreasing;
    }
	
	public void findSolution() {
		int A[] = new int[] {1,1,0};
		//int A[] = new int[] {1,2,2,3};
		//int A[] = new int[] {6,5,4,4};
		//int A[] = new int[] {1,3,2};
		//int A[] = new int[] {1,2,4,5};
		//int A[] = new int[] {1,1,1};
		//int A[] = new int[] {1,3,2,4};
		
		System.out.println("Is the given array monototnic ? " + isMonotonic(A));
	}
}
