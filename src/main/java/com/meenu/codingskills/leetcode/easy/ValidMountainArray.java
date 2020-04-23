package com.meenu.codingskills.leetcode.easy;

/*
 * Given an array A of integers, return true if and only if it is a valid mountain array.

Recall that A is a mountain array if and only if:

A.length >= 3
There exists some i with 0 < i < A.length - 1 such that:
A[0] < A[1] < ... A[i-1] < A[i]
A[i] > A[i+1] > ... > A[A.length - 1]

Example 1:

Input: [2,1]
Output: false
Example 2:

Input: [3,5,5]
Output: false
Example 3:

Input: [0,3,2,1]
Output: true

 */

/**
 * @author Meenu V Nair
 *
 */
public class ValidMountainArray {

	private boolean validMountainArray(int[] A) {
        if(A.length < 3)
        	return false;
        
/******************* second approach **************************************/            
        
        int i = 0;
        while(i < A.length && i + 1 < A.length && A[i] < A[i + 1]) {
        	i++;
        }
        
        if(i == 0 || i + 1 >= A.length) {
        	return false;
        }
        
        while(i < A.length && i + 1 < A.length) {
        	if(A[i] <= A[i + 1])
        		return false;
        	i++;
        }
        
        return true;

/******************* first approach **************************************/        
        
		/*int i = 0;
		int j = 1;
		int increase = 1;
		
		while(j < A.length) {
			if(j != A.length - 1 && A[i] < A[j]) {
				if(increase == 1) {
					i++;
					j++;
				}
				else
					return false;
			}else {
				increase = 0;
				if(i != 0 && A[j] < A[i]) {
					i++;
					j++;
				}
				else
					return false;
			}
		}
		return true;*/
    }
	
	public void findSolution() {
		int A[] = new int[] {3,7,6,4,3,0,1,0};
		//int A[] = new int[] {0,1,2,3,4,5,6,7,8,9};
		//int A[] = new int[] {2,1};
		//int A[] = new int[] {3,5,5};
		//int A[] = new int[] {0,3,2,1};
		
		System.out.println("Is valid mountain array ? " + validMountainArray(A));
	}
}
