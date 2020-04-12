package com.meenu.codingskills.datastructures.tree;

import java.util.ArrayList;
import java.util.List;

public class MaxHeap {
	private List<Integer> items;
	public MaxHeap() {
		items = new ArrayList<Integer>();	
	}
	
	private void siftUp() {
		int k = items.size() - 1;
		while(k > 0) {
			int p = (k - 1) / 2;
			int item = items.get(k);
			int parent = items.get(p);
			if(item > parent) {
				items.set(k, parent);
				items.set(p, item);
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
			int max = l;
			int r = l + 1;
			if(r < items.size()) {
				if(items.get(r) > items.get(l)) {
					max = r;
				}
			}
			if(items.get(parent) < items.get(max)) {
				int temp = items.get(parent);
				items.set(parent, items.get(max));
				items.set(max, temp);
				parent = max;
				l = 2*parent + 1;
			}
			else
				break;
		}
	}
	
	public void insert(int item) {
		items.add(item);
		siftUp();
	}
	
	public int delete() {
		if(items.size() == 0) {
			System.err.println("Heap empty");
			return Integer.MIN_VALUE;
		}
		if(items.size() == 1) {
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
