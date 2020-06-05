package com.meenu.codingskills.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
* @author Meenu V. Nair
*
 * Creation time: Jun 5, 2020 4:29:31 PM
*
*/

public class AllCombinationsOfAString {
	
	private Set<String> findAllCombinations(String s){
		Set<String> allCombinations = new HashSet<>();
		generateCombinations(s.toCharArray(), 0, new HashSet<>(), new StringBuilder(), allCombinations);
		
		return allCombinations;
	}
	
	private void generateCombinations(char[] ch, int start, Set<String> current, StringBuilder sb, Set<String> allCombinations) {
		if(start == ch.length) {
			allCombinations.addAll(current);
			return;
		}
		
		for(int i = start; i < ch.length; i++) {
			sb.append(ch[i]);
			current.add(sb.toString());
			generateCombinations(ch, i + 1, current, sb, allCombinations);
			sb.deleteCharAt(sb.length() - 1);
			current.remove(current.size() - 1);
		}
	}

	public void findSolution() {
		String s = "wxyz";
		Set<String> allCombinations = findAllCombinations(s);
		List<String> list = new ArrayList<>();
		for(String st : allCombinations)
			list.add(st);
		
		for(int i = 0; i < list.size(); i++) {
			/*List combination = allCombinations.get(i);
			for(int j = 0; j < combination.size(); j++) {
				System.out.println(combination.get(j));
			}*/
			System.out.println(list.get(i));
		}
	}
}
