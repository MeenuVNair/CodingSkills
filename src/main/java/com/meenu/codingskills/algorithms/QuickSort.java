package com.meenu.codingskills.algorithms;
/**
* @author Meenu V Nair
*
 * Creation time: Apr 24, 2020 7:12:42 PM
*
*/

public class QuickSort {
	
	private int partition(int[] arr, int low, int high) {
		int i = low - 1;
		int pivot = arr[high];
		
		for(int j = low; j < high; j++) {
			if(arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		int temp = arr[high];
		arr[high] = arr[i + 1];
		arr[i + 1] = temp;
		
		return i + 1;
	}
	
	private void quickSort(int[] arr, int l, int r) {
		
		if(l < r) {
			
			int partitionIndex = partition(arr, l, r);
			quickSort(arr, l, partitionIndex - 1);
			quickSort(arr, partitionIndex + 1, r);
		}
	}

	public void findSolution() {
		int arr[] = {12, 11, 13, 5, 6, 7}; 
		printArray(arr);
		quickSort(arr, 0, arr.length - 1);
		printArray(arr);
	}
	
	private void printArray(int[] arr) {
		for(int i : arr) {
			System.out.print(i + "  ");
		}
		System.out.println();
	}
}
