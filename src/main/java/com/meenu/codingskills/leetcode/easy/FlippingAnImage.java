package com.meenu.codingskills.leetcode.easy;

/*
 * Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.  For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].

To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. For example, inverting [0, 1, 1] results in [1, 0, 0].

Example 1:

Input: [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
Example 2:

Input: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 */

public class FlippingAnImage {

	private int[][] flipAndInvertImage(int[][] A) { 
		int reverse[][] = reverse(A);
		print(reverse);
		int flip[][] = flip(reverse);
		return flip;
    }
	
	private int[][] reverse(int[][] A) {
		for(int i = 0; i < A.length; i++) {
			int j = 0;
			int k = A[i].length - 1;
			while(j < k) {
				int temp = A[i][j];
				A[i][j] = A[i][k];
				A[i][k] = temp;
				j++;
				k--;
			}
		}
		return A;
	}
	
	private int[][] flip(int[][] reverse){
		for(int i = 0; i < reverse.length; i++) {
			for(int j = 0; j < reverse[i].length; j++) {
				if(reverse[i][j] == 0)
					reverse[i][j] = 1;
				else
					reverse[i][j] = 0;
			}
		}
		
		return reverse;
	}
	
	public void findSolution() {
		/*int A[][] = new int[][] { {1,1,0},
								  {1,0,1},
								  {0,0,0}
								};*/
		int A[][] = new int[][] { {1,1,0,0},
								  {1,0,0,1},
								  {0,1,1,1},
								  {1,0,1,0}
								};
		print(A);
		int flipped[][] = flipAndInvertImage(A);
		print(flipped);	
	}
	
	private void print(int A[][]) {
		for(int i = 0; i < A.length; i++) {
			for(int j = 0; j < A[i].length; j++) {
				System.out.print(A[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
