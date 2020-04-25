package com.meenu.codingskills.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

/*
 * Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following operations: get and put.

get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
put(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity, it should invalidate the least recently used item before inserting a new item.

The cache is initialized with a positive capacity.

Follow up:
Could you do both operations in O(1) time complexity?

Example:

LRUCache cache = new LRUCache( 2 --capacity );

cache.put(1, 1);
cache.put(2, 2);
cache.get(1);       // returns 1
cache.put(3, 3);    // evicts key 2
cache.get(2);       // returns -1 (not found)
cache.put(4, 4);    // evicts key 1
cache.get(1);       // returns -1 (not found)
cache.get(3);       // returns 3
cache.get(4);       // returns 4
 */

/**
* @author Meenu V Nair
*
 * Creation time: Apr 25, 2020 4:59:35 PM
*
*/

public class LRUCache {
	
	class ListNode{
		int key;
		int value;
		ListNode prev;
		ListNode next;
	}
	
	Map<Integer, ListNode> hashTable = new HashMap<>();
	ListNode head;
	ListNode tail;
	
	int maxCapacity;
	int totalItemsInCache;
	
	public LRUCache() {}

	LRUCache(int maxCapacity){
		this.maxCapacity = maxCapacity;
		totalItemsInCache = 0;
		
		head = new ListNode();
		tail = new ListNode();
		
		head.next = tail;
		tail.prev = head;
	}
	
	private int get(int key) {
		ListNode node = hashTable.get(key);
		
		if(node == null) {
			return -1;
		}
		moveToHead(node);
		return node.value;
	}
	
	private void moveToHead(ListNode node) {
		removeNode(node);
		addToFront(node);
	}
	
	private void addToFront(ListNode node) {
		node.prev = head;
		node.next = head.next;
		head.next.prev = node;
		head.next = node;
	}
	
	private void removeNode(ListNode node) {
		ListNode savePrev = node.prev;
		ListNode saveNext = node.next;
		
		savePrev.next = saveNext;
		saveNext.prev = savePrev;
	}
	
	private void put(int key, int value) {
		ListNode node = hashTable.get(key);
		if(node == null) {
			ListNode newNode = new ListNode();
			newNode.key = key;
			newNode.value = value;
			
			hashTable.put(key, newNode);
			addToFront(newNode);
			totalItemsInCache++;
			
			if(totalItemsInCache > maxCapacity) {
				removeLeastUsed();
			}
		}
		else {
			node.value = value;
			moveToHead(node);
		}
    }
	
	private void removeLeastUsed() {
		ListNode tailItem = tail.prev;
		hashTable.remove(tailItem.key);
		totalItemsInCache--;
		removeNode(tailItem);
	}
	
	public void findSolution() {
		LRUCache cache = new LRUCache(2);
		int value;
		cache.put(1, 1);
		cache.put(2, 2);
		value = cache.get(1);       // returns 1
		System.out.println(value);
		//print(head);
		cache.put(3, 3);    // evicts key 2
		value = cache.get(2);       // returns -1 (not found)
		System.out.println(value);
		//print(head);
		cache.put(4, 4);    // evicts key 1
		value = cache.get(1);       // returns -1 (not found)
		System.out.println(value);
		//print(head);
		value = cache.get(3);       // returns 3
		System.out.println(value);
		//print(head);
		value = cache.get(4);       // returns 4
		System.out.println(value);
		//print(head);
		
		//print(head);
	}
	
	private void print(ListNode head) {
		System.out.println("-----------  Cache -----------------");
		while(head != null) {
			System.out.print(head.value + " --> ");
			head = head.next;
		}
	}
}
