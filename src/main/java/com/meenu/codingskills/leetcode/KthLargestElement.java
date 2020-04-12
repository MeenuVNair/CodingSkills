package com.meenu.codingskills.leetcode;

import com.meenu.codingskills.datastructures.tree.MinHeap;

public class KthLargestElement {
	private int findKthLargest(int[] array, int k) {
		MinHeap minHeap = new MinHeap();
		for(int i : array) {
			minHeap.insert(i);
			if(minHeap.getSize() > k)
				minHeap.delete();
		}
		return minHeap.delete();
	}
	
	public void findSolution() {
		int array[] = new int[] {1,2,3,4,5,6,7,8,9,10};
		int k = 3;
		int kthLargest = findKthLargest(array, k);
		if(k > array.length) {
			System.out.println("Array contains only " + array.length + " elements.\nThe value of 'k' entered by you is " + k + " which is outside the array limit.");
			return;
		}
		System.out.println("Kth largest element is : " + kthLargest);
	}
}
