package com.meenu.codingskills.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepeatedDNASequences {

	private List<String> findRepeatedDnaSequences(String s) {
        List<String> repeatedSequence = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        boolean lastIteration = false;
        for(int i = 0; i < s.length(); i++) {
        	String subSequence = "";
        	if(i + 10 > s.length() - 1) {
        		subSequence = s.substring(i);
        		lastIteration = true;
        	}
        	else
        		subSequence = s.substring(i, i + 10);
        	if(map.containsKey(subSequence)) {
        		if(!repeatedSequence.contains(subSequence))
        			repeatedSequence.add(subSequence);
        		map.put(subSequence, map.getOrDefault(subSequence, 0) + 1);
        	}
        	else
        		map.put(subSequence, 0);
        	
        	if(lastIteration)
        		break;
        }
        
        return repeatedSequence;
    }
	
	public void findSolution() {
		String input = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"; //"AAAAAAAAAAAA";
		List<String> repeatedSequence = findRepeatedDnaSequences(input);
		for(String s : repeatedSequence) {
			System.out.print(s + " ");
		}
	}
}
