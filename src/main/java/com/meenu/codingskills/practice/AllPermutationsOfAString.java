package com.meenu.codingskills.practice;

import java.util.ArrayList;
import java.util.List;

/**
* @author Meenu V. Nair
*
 * Creation time: Jun 5, 2020 3:51:21 PM
*
*/

public class AllPermutationsOfAString {

	private List<List<String>> findAllPermutations(String s){
		List<List<String>> allPermutations = new ArrayList<>();
		generatePermutations(s.toCharArray(), 0, allPermutations);
		
		return allPermutations;
	}
	
	private void generatePermutations(char[] cArray, int start, List<List<String>> allPermutations) {
		if(start == cArray.length) {
			List<String> list = new ArrayList<>();
			list.add(new String(cArray));
			allPermutations.add(new ArrayList<>(list));
			return;
		}
		for(int i = start; i < cArray.length; i++) {
			swap(cArray, i, start);
			generatePermutations(cArray, start + 1, allPermutations);
			swap(cArray, i, start);
		}
	}
	
	private void swap(char[] cArray, int i, int j) {
		char c= cArray[i];
		cArray[i] = cArray[j];
		cArray[j] = c;
	}
	
	public void findSolution() {
		String s = "abs";
		List<List<String>> permutations = findAllPermutations(s);
		for(int i = 0; i < permutations.size(); i++) {
			List list = permutations.get(i);
			for(int j = 0; j < list.size(); j++) {
				System.out.println(list.get(j));
			}
		}
	}
}
