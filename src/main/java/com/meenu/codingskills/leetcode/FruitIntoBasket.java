package com.meenu.codingskills.leetcode;

import java.util.HashMap;
import java.util.Map;

/*
 * In a row of trees, the i-th tree produces fruit with type tree[i].

You start at any tree of your choice, then repeatedly perform the following steps:

Add one piece of fruit from this tree to your baskets.  If you cannot, stop.
Move to the next tree to the right of the current tree.  If there is no tree to the right, stop.
Note that you do not have any choice after the initial choice of starting tree: you must perform step 1, then step 2, then back to step 1, then step 2, and so on until you stop.

You have two baskets, and each basket can carry any quantity of fruit, but you want each basket to only carry one type of fruit each.
Input: [1,2,1]
Output: 3
Explanation: We can collect [1,2,1].

Input: [0,1,2,2]
Output: 3
Explanation: We can collect [1,2,2].
If we started at the first tree, we would only collect [0, 1].

Input: [1,2,3,2,2]
Output: 4
Explanation: We can collect [2,3,2,2].
If we started at the first tree, we would only collect [1, 2].

Input: [3,3,3,1,2,1,1,2,3,3,4]
Output: 5
Explanation: We can collect [1,2,1,1,2].
If we started at the first tree or the eighth tree, we would only collect 4 fruits.

 */


// THIS IS BASICALLY A PROBLEM TO FIND LONGEST SUBSTRING WITH ONLY TWO DIFFERENT CHARACTERS


public class FruitIntoBasket {
	private int totalFruit(int[] tree) {
		if(tree == null || tree.length == 0)
			return -1;
		
		int total = 0;
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		int i = 0;
		int j = 0;
		while(j < tree.length) {
			if(map.size() <=2 ) {
				map.put(tree[j], j++);
			}
			if(map.size() > 2) {
				int min = tree.length - 1;
				for(int value : map.values()) {
					min = Math.min(min, value);
				}
				i = min + 1;
				map.remove(tree[min]);
			}
			total = Math.max(total, j - i);
		}
		
		return total;
	}
	
	public void findSolution() {
		int tree[] = new int[] {3,3,3,1,2,1,1,2,3,3,4};
		int total = totalFruit(tree);
		System.out.println("Total fruits : " + total);
	}

}
