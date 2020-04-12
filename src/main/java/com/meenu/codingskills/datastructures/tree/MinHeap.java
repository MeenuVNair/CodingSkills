package com.meenu.codingskills.datastructures.tree;

import java.util.ArrayList;
import java.util.List;

public class MinHeap {
	List<Integer> items;
	public MinHeap() {
		items = new ArrayList<Integer>();
	}
	
	private void siftUp() {
		int k = items.size() - 1;
		while(k > 0) {
			int p = (k - 1) / 2;
			int parent = items.get(p);
			int item = items.get(k);
			if(parent > item) {
				items.set(p, item);
				items.set(k, parent);
				k = p;
			}
			else
				break;
		}
	}
	
	private void siftDown() {
		int parent = 0;
		int l = 2*parent + 1;
		while(l < items.size()) {
			int min = l;
			int r = l + 1;
			if(r < items.size()) {
				if(items.get(l) > items.get(r)) {
					min = r;
				}
			}
			if(items.get(parent) > items.get(min)) {
				int temp = items.get(parent);
				items.set(parent, items.get(min));
				items.set(min, temp);
				parent = min;
				l = 2*parent + 1;
			}
			else
				break;
		}
	}
	
	public void insert(int value) {
		items.add(value);
		siftUp();
	}
	
	public int delete() {
		if(items.size() == 0) {
			System.err.println("Heap is empty");
			return Integer.MIN_VALUE;
		}
		else if(items.size() == 1) {
			return items.remove(0);
		}
		
		int returnValue = items.get(0);
		int lastItem = items.remove(items.size() - 1);
		items.set(0, lastItem);
		siftDown();
		return returnValue;
	}
	
	public boolean isEmpty() {
		if(items.size() > 0)
			return false;
		return true;
	}
	
	public String toString() {
		return items.toString();
	}
	
	public int getSize() {
		return items.size();
	}
}
