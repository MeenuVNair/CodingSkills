package com.meenu.codingskills.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/*
 * Given a string, sort it in decreasing order based on the frequency of characters.

Example 1:

Input:
"tree"

Output:
"eert"

Explanation:
'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
Example 2:

Input:
"cccaaa"

Output:
"cccaaa"

Explanation:
Both 'c' and 'a' appear three times, so "aaaccc" is also a valid answer.
Note that "cacaca" is incorrect, as the same characters must be together.
Example 3:

Input:
"Aabb"

Output:
"bbAa"

Explanation:
"bbaA" is also a valid answer, but "Aabb" is incorrect.
Note that 'A' and 'a' are treated as two different characters.
 */

public class SortCharacterByFrequency {

	public void findSolution() {
		String inputString = "Aabb"; //"cccaaa"; //"tree";
		String frequencySortedString = frequencySort(inputString);
		System.out.println("Frequency sorted string : " + frequencySortedString);
	}
	
	//simplyfying the first solution()
	public String frequencySort(String inputString) {
		if(inputString.equals(""))
			return "";
		if(inputString == null || inputString.length() == 0)
			return null;
		String outputString = "";
		
		HashMap<Character, Integer> map = new HashMap<>();
		for(char c : inputString.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		
		PriorityQueue<Character> maxHeap = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
		maxHeap.addAll(map.keySet());
		
		while(!maxHeap.isEmpty()) {
			char character = maxHeap.remove();
			for(int i = 0; i < map.get(character); i++) {
				outputString += character;
			}
		}
		return outputString;
		
	}
	
	//first way
	/*public String frequencySort(String inputString) {
		if(inputString.equals(""))
			return "";
		if(inputString == null || inputString.length() == 0)
			return null;
		String outputString = "";
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < inputString.length(); i++) {
			map.put(inputString.charAt(i), map.getOrDefault(inputString.charAt(i), 0) + 1);
		}
		
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b - a);
		maxHeap.addAll(map.values());
		while(!maxHeap.isEmpty()) {
			Object maxFreq = maxHeap.remove();
			Object character = "";
			for(Map.Entry entry : map.entrySet()) {
				if(maxFreq.equals(entry.getValue())) {
					character = entry.getKey();
					entry.setValue(0);
					break;
				}
			}
			for(int i = 0; i < Integer.valueOf(maxFreq.toString()); i++)
				outputString += character;
		}
		return outputString;
	}*/
}
