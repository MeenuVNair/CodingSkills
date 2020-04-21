package com.meenu.codingskills.leetcode.easy;

import java.util.HashSet;

/*
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:

Input: J = "aA", S = "aAAbbbb"
Output: 3
Example 2:

Input: J = "z", S = "ZZ"
Output: 0
 */

public class JewelsAndStones {

	private int numJewelsInStones(String J, String S) {
        int count = 0;
        
      /********************* First Approach ********************/
        /*HashMap<Character, Integer> map = new HashMap<>();
        for(char c : J.toCharArray()) {
        	map.put(c, 0);
        }
        
        for(int i = 0; i < S.length(); i++) {
        	if(map.containsKey(S.charAt(i))) {
        		map.put(S.charAt(i), map.getOrDefault(S.charAt(i), 0) + 1);
        	}
        }
        
        for(Character key : map.keySet()) {
        	if(map.get(key) != 0) {
        		count += map.get(key);
        	}
        }*/
        
       /******************** Second Approach ******************/
        HashSet<Character> set = new HashSet<>();
        for(char c : J.toCharArray()) {
        	set.add(c);
        }
        for(int i = 0; i < S.length(); i++) {
        	if(set.contains(S.charAt(i)))
        		count++;
        }
        
        return count;
    }
	
	public void findSolution() {
		String J = "aA";
		String S = "aAAbbbb";
		//String J = "z";
		//String S = "ZZ";
		
		int numJewels = numJewelsInStones(J, S);
		System.out.println("Number of jewels among the stones : " + numJewels);
	}
}
