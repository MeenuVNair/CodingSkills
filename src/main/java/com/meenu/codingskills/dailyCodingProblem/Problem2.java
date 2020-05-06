package com.meenu.codingskills.dailyCodingProblem;

/*
 * Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division?
 */

/**
* @author Meenu V Nair
*
 * Creation time: May 6, 2020 12:03:53 PM
*
*/

public class Problem2 {
	
/******************************** With division ****************************************/
	
	private int[] findProductArray(int[] inputArray) {
		int totalProduct = 1;
		for(Integer i : inputArray) {
			totalProduct *= i;
		}
		
		int productArray[] = new int[inputArray.length];
		for(int i = 0; i < inputArray.length; i++) {
			productArray[i] = totalProduct / inputArray[i];
		}
		
		return productArray;
	}
	
	public void findSolution() {
		int inputArray[] = new int[] {1, 2, 3, 4, 5};
		//int inputArray[] = new int[] {3, 2, 1};
		
		int productArray[] = findProductArray(inputArray);
		for(Integer i : productArray) {
			System.out.print(i + "  ");
		}
	}
}
