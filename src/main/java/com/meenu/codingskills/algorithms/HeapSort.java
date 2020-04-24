package com.meenu.codingskills.algorithms;
/**
* @author Meenu V Nair
*
 * Creation time: Apr 24, 2020 4:54:16 PM
*
*/

public class HeapSort {
	
	private void heapSort(int[] arr) {
		int size = arr.length;
		for(int i = size / 2 - 1; i >= 0; i--) {   // build heap
			heapify(arr, size, i);
		}
		
		// remove from heap
		for(int i = size - 1; i >= 0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			heapify(arr, i, 0);
		}
	}

	private void heapify(int[] arr, int size, int i) {
		int largest = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;
		
		if(l < size && arr[l] > arr[largest]) {
			largest = l;
		}
		
		if(r < size && arr[r] > arr[largest])
			largest = r;
		
		if(largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			heapify(arr, size, largest);
		}
	}
	
	public void findSolution() {
		int arr[] = {12, 11, 13, 5, 6, 7}; 
		printArray(arr);
		heapSort(arr);
		printArray(arr);
	}
	
	private void printArray(int[] arr) {
		for(int i : arr) {
			System.out.print(i + "  ");
		}
		System.out.println();
	}
}
