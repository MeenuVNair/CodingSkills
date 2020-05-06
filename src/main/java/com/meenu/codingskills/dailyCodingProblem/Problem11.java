package com.meenu.codingskills.dailyCodingProblem;

import java.util.ArrayList;
import java.util.List;

/**
* @author Meenu V Nair
*
 * Creation time: May 6, 2020 11:37:49 AM
*
*/

public class Problem11 {

	private List<String> autoComplete(String[] strings, String s){
		List<String> autoComplete = new ArrayList<>();
		if(strings.length == 0 || strings == null) {
			return autoComplete;
		}
		
		for(String str : strings) {
			if(str.startsWith(s)) {
				autoComplete.add(str);
			}
		}
		
		return autoComplete;
	}
	
	public void findSolution() {
		String strings[] = new String[] {"dog", "deer", "deal"};
		String s = "de";
		
		List<String> autoComplete = autoComplete(strings, s);
		
		for(String str : autoComplete) {
			System.out.println(str);
		}
	}
}
