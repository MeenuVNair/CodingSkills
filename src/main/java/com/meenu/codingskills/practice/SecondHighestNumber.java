package com.meenu.codingskills.practice;

import java.util.PriorityQueue;

/**
* @author Meenu V. Nair
*
 * Creation time: Jun 5, 2020 2:57:02 PM
*
*/

public class SecondHighestNumber {
	
	private int findSecondHighest(int[] arr) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for(int i : arr) {
			minHeap.add(i);
			if(minHeap.size() > 2)
				minHeap.remove();
		}
		
		return minHeap.remove();
	}
	
	public void findSolution() {
		int arr[] = { 100, 14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
		System.out.println("Second highest : " + findSecondHighest(arr));
	}

}
