package com.meenu.codingskills.datastructures.tree;

public class TestHeap {

	public void findSolution() {
		Heap heap = new Heap();
		heap.insert(10);
		heap.insert(15);
		heap.insert(7);
		heap.insert(25);
		heap.insert(20);
		heap.insert(9);
		heap.insert(17);
		
		while(!heap.isEmpty()) {
			int max = heap.delete();
			System.out.println(max + " " + heap);
		}
	}
}
