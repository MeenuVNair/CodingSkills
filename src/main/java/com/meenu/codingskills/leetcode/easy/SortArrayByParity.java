package com.meenu.codingskills.leetcode.easy;

/*
 * Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.

You may return any answer array that satisfies this condition.
Example 1:

Input: [3,1,2,4]
Output: [2,4,3,1]
The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 */

public class SortArrayByParity {
	
/***************** Second approach **********************/
	
	private int[] sortArrayByParity(int[] A) {
		int evenIndex = 0;
		for(int i = 0; i < A.length; i++) {
			if(A[i] % 2 == 0) {
				int temp = A[evenIndex];
				A[evenIndex] = A[i];
				A[i] = temp;
				evenIndex++;
			}
		}
		return A;
	}

/***************** First approach **********************/
	
	/*private int[] sortArrayByParity(int[] A) {
        int sortedArray[] = new int[A.length];
        int j = 0;
        for(int i = 0; i < A.length; i ++) {
        	if(A[i] % 2 == 0) {
        		sortedArray[j++] = A[i];
        		A[i] = -1;
        	}
        }
        
        for(int i = 0; i < A.length; i++) {
        	if(A[i] != -1) {
        		sortedArray[j++] = A[i];
        	}
        }
        
        return sortedArray;
    }*/
	
	public void findSolution() {
		int A[] = new int[] {3,1,2,4,5,8};
		int sorted[] = sortArrayByParity(A);
		for(int i = 0; i < sorted.length ; i++) {
			System.out.print(sorted[i] + " ");
		}
	}
}
