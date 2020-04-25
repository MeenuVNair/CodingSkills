package com.meenu.codingskills.dynamicProgramming;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
* @author Meenu V Nair
*
 * Creation time: Apr 25, 2020 11:03:41 PM
*
*/

public class GenerateAllPermutationsOfAString {
	
	private List<List<String>> permute(String s){
		List<List<String>> allPermutations = new ArrayList<>();
		generatePermutations(0, s.toCharArray(), allPermutations);
		return allPermutations;
	}
	
	private void generatePermutations(int start, char[] input, List<List<String>> result) {
		if(start == input.length) {
			List<String> list = new ArrayList<>();
			list.add(new String(input));
			result.add(new ArrayList<>(list));
			return;
		}
		HashSet<Character> set = new HashSet<>();
		for(int i = start; i < input.length; i++) {
			if(!set.contains(input[i])) {
				set.add(input[i]);
				swap(input, start, i);
				generatePermutations(start + 1, input, result);
				swap(input, start, i);
			}
		}
	}
	
	private void swap(char[] input, int i, int j) {
		char temp = input[i];
		input[i] = input[j];
		input[j] = temp;
	}

	public void findSolution() {
		//String s = "ab";
		String s = "abc";
		
		List<List<String>> result = new ArrayList<>();
		result = permute(s);
		
		for(int i = 0; i < result.size(); i++) {
			List permutation = result.get(i);
			for(int j = 0; j < permutation.size(); j++)
				System.out.println(permutation.get(j));
		}
	}
}
