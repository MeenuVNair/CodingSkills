package com.meenu.codingskills.practice;
/**
* @author Meenu V. Nair
*
 * Creation time: Jun 5, 2020 3:38:30 PM
*
*/

public class RemoveAllWhiteSpaces {

	private String removeAllWhiteSpaces(String sentence) {
		
		//return sentence.trim().replaceAll(" ", "");
		
		//OR 
		
		String whiteSpaceRemoved = "";
		for(int i = 0; i < sentence.length(); i++) {
			if(sentence.charAt(i) != ' ') {
				whiteSpaceRemoved += sentence.charAt(i); 
			}
		}
		return whiteSpaceRemoved;
	}
	
	public void findSolution() {
		String sentence = "   manchester united is also known as red devil ";
		System.out.println("After removing white spaces : " + removeAllWhiteSpaces(sentence));
	}
}
