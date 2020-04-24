package com.meenu.codingskills.algorithms;
/**
* @author Meenu V Nair
*
 * Creation time: Apr 24, 2020 8:32:27 PM
*
*/

public class InsertionSort {

	private void insertionSort(int[] arr, int n) {
		
		for(int i = 1; i < n; i++) {
			int value = arr[i];
			int pos = i;
			
			while(pos > 0 && arr[pos - 1] > value) {
				int temp = arr[pos - 1];
				arr[pos - 1] = arr[pos];
				arr[pos] = temp;
				pos = pos - 1;
			}
			arr[pos] = value;
		}
		
	}
	
	public void findSolution() {
		int arr[] = {12, 11, 13, 5, 6, 7}; 
		printArray(arr);
		insertionSort(arr, arr.length);
		printArray(arr);
	}
	
	private void printArray(int[] arr) {
		for(int i : arr) {
			System.out.print(i + "  ");
		}
		System.out.println();
	}
}
