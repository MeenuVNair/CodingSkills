package com.meenu.codingskills.algorithms;
/**
* @author Meenu V Nair
*
 * Creation time: Apr 24, 2020 6:04:21 PM
*
*/

public class MergeSort {

	private void mergeSort(int[] arr, int left, int right) {
		if(left < right) {
			int mid = (left + right) / 2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);
			merge(arr, left, mid, right);
		}
	}
	
	private void merge(int[] arr, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;
		
		// create temporary arrays
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		//copy values to temporary arrays
		for(int i = 0; i < n1; i++) {
			L[i] = arr[left + i];
		}
		
		for(int j = 0; j < n2; j++) {
			R[j] = arr[mid + 1 + j];
		}
		
		//merge temp arrays
		
		//index of first two arrays
		int i = 0; int j = 0;
		
		//initial index of merged subarray
		int k = left;
		
		while(i < n1 && j < n2) {
			if(L[i] <= R[j]) {
				arr[k++] = L[i];
				i++;
			}
			else {
				arr[k++] = R[j];
				j++;
			}
		}
		
		//if items are left in any array, copy them
		while(i < n1) {
			arr[k++] = L[i++];
		}
		while(j < n2) {
			arr[k++] = R[j++];
		}
		
	}
	
	public void findSolution() {
		int arr[] = {12, 11, 13, 5, 6, 7}; 
		printArray(arr);
		mergeSort(arr, 0, arr.length - 1);
		printArray(arr);
	}
	
	private void printArray(int[] arr) {
		for(int i : arr) {
			System.out.print(i + "  ");
		}
		System.out.println();
	}
}
