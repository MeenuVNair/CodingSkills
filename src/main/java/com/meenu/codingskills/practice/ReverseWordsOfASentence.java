package com.meenu.codingskills.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
* @author Meenu V. Nair
*
 * Creation time: Jun 5, 2020 6:35:39 PM
*
*/

public class ReverseWordsOfASentence {

	public void findSolution() {
		String sen = "Java is Great";
		System.out.println(sen);
		
		List<String> words = Arrays.asList(sen.split("\\s"));
		//Collections.reverse(words);
		StringBuilder sb = new StringBuilder();
		
		for(int i = words.size() - 1; i >= 0; i--) {
			sb.append(words.get(i));
			sb.append(' ');
		}
		
		System.out.println(sb.toString());
	}
}
