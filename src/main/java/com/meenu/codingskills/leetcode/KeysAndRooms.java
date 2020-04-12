package com.meenu.codingskills.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

/*
 * There are N rooms and you start in room 0.  Each room has a distinct number in 0, 1, 2, ..., N-1, and each room may have some keys to access the next room. 

Formally, each room i has a list of keys rooms[i], and each key rooms[i][j] is an integer in [0, 1, ..., N-1] where N = rooms.length.  A key rooms[i][j] = v opens the room with number v.

Initially, all the rooms start locked (except for room 0). 

You can walk back and forth between rooms freely.

Return true if and only if you can enter every room.

Input: [[1],[2],[3],[]]
Output: true
Explanation:  
We start in room 0, and pick up key 1.
We then go to room 1, and pick up key 2.
We then go to room 2, and pick up key 3.
We then go to room 3.  Since we were able to go to every room, we return true.

Input: [[1,3],[3,0,1],[2],[0]]
Output: false
Explanation: We can't enter the room with number 2.
 */

public class KeysAndRooms {

	private boolean canVisitAllRooms(List<List<Integer>> rooms) {
		HashSet<Integer> visited = new HashSet<Integer>();
		visited.add(0);
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(0);
		
		while(!stack.isEmpty()) {
			List<Integer> keys = rooms.get(stack.pop());
			for(Integer i : keys) {
				if(!visited.contains(i)) {
					visited.add(i);
					stack.add(i);
				}
			}
		}
		return visited.size() == rooms.size();
	}
	
	public void findSolution() {
		List<List<Integer>> rooms = new ArrayList<List<Integer>>();
		// input 1
		List<Integer> keys1 = new ArrayList<Integer>();
		keys1.add(1);
		rooms.add(keys1);
		
		List<Integer> keys2 = new ArrayList<Integer>();
		keys2.add(2);
		rooms.add(keys2);
		
		List<Integer> keys3 = new ArrayList<Integer>();
		keys3.add(3);
		rooms.add(keys3);
		
		List<Integer> keys4 = new ArrayList<Integer>();
		rooms.add(keys4);
		
		//input 2
		/*List<Integer> keys1 = new ArrayList<Integer>();
		keys1.add(1); keys1.add(3);
		rooms.add(keys1);
		
		List<Integer> keys2 = new ArrayList<Integer>();
		keys2.add(3); keys2.add(0); keys2.add(1);
		rooms.add(keys2);
		
		List<Integer> keys3 = new ArrayList<Integer>();
		keys3.add(2);
		rooms.add(keys3);
		
		List<Integer> keys4 = new ArrayList<Integer>();
		keys4.add(0);
		rooms.add(keys4);*/
				
		System.out.println("can visit all rooms ? " + canVisitAllRooms(rooms));
	}

}
