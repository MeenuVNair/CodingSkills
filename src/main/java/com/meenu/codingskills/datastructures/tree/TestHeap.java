package com.meenu.codingskills.datastructures.tree;

public class TestHeap {

	public void findSolution() {
		// test MaxHeap
		MaxHeap heap = new MaxHeap();
		heap.insert(10);
		heap.insert(15);
		heap.insert(7);
		heap.insert(25);
		heap.insert(20);
		heap.insert(9);
		heap.insert(17);
		
		System.out.println("-----------MaxHeap-----------------------");
		while(!heap.isEmpty()) {
			int max = heap.delete();
			System.out.println(max + " " + heap);
		}
		
		//test MinHeap
		System.out.println("\n-----------MinHeap-----------------------");
		MinHeap minHeap = new MinHeap();
		minHeap.insert(10);
		minHeap.insert(15);
		minHeap.insert(7);
		minHeap.insert(25);
		minHeap.insert(20);
		minHeap.insert(9);
		minHeap.insert(17);
		
		while(!minHeap.isEmpty()) {
			int min = minHeap.delete();
			System.out.println(min + " " + minHeap);
		}
	}
}
