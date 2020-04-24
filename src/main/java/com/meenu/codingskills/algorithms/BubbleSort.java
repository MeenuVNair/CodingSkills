package com.meenu.codingskills.algorithms;
/**
* @author Meenu V Nair
*
 * Creation time: Apr 24, 2020 9:50:11 PM
*
*/

public class BubbleSort {
	
	private void bubbleSort(int[] arr) {
		
		int n = arr.length;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public void findSolution() {
		int arr[] = {12, 11, 13, 5, 6, 7}; 
		printArray(arr);
		bubbleSort(arr);
		printArray(arr);
	}
	
	private void printArray(int[] arr) {
		for(int i : arr) {
			System.out.print(i + "  ");
		}
		System.out.println();
	}
}
