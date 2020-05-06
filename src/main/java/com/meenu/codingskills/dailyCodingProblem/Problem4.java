package com.meenu.codingskills.dailyCodingProblem;

/*
 * Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.

For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.

You can modify the input array in-place.
 */

/**
* @author Meenu V Nair
*
 * Creation time: May 6, 2020 12:36:55 PM
*
*/

public class Problem4 {

	private int firstMissingPositive(int[] array) {
		int index = groupPositives(array);
		
		for(int i = 0; i < index; i++) {
			int value = Math.abs(array[i]);
			if(value - 1 < array.length && array[value - 1] > 0) {
				array[value - 1] = - array[value - 1];
			}
		} 
		
		for(int i = 0; i < index; i++) {
			if(array[i] > 0) {
				return i + 1;
			}
		}
		
		return index + 1;
	}
	
	private int groupPositives(int[] array) {
		int j = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] > 0) {
				int temp = array[j];
				array[j] = array[i];
				array[i] = temp;
				j++;
			}
		}
		return j;
	}
	
	public void findSolution() {
		int array[] = new int[] {1, 1, 0, -1, -2};
		//int array[] = new int[] {2, 3, 7, 6, 8, -1, -10, 15};
		//int array[] = new int[] {2, 3, -7, 6, 8, 1, -10, 15};
		//int array[] = new int[] {3, 4, -1, 1};
		//int array[] = new int[] {1, 2, 0};
		System.out.println("First missing positive integer : " + firstMissingPositive(array));
	}
}
