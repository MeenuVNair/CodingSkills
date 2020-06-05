package com.meenu.codingskills.practice;

import java.util.ArrayList;
import java.util.List;

/**
* @author Meenu V. Nair
*
 * Creation time: Jun 5, 2020 3:25:42 PM
*
*/

public class CountNumberOfWords {

	private int countNumberOfWords(String sentence) {
		
		return sentence.trim().split(" ").length;
		
		//OR 
		
		/*List<String> words = new ArrayList<>();
		for(int i = 0; i < sentence.length(); i++) {
			if(sentence.charAt(i) != ' ') {
				String word = "";
				while(sentence.charAt(i) != ' ') {
					word += sentence.charAt(i); 
					i++;
				}
				words.add(word);
			}
		}
		return words.size();*/
	}
	
	public void findSolution() {
		String sentence = "   manchester united is also known as red devil ";
		System.out.println("Number of words in the given sentence : " + countNumberOfWords(sentence));
	}
}
