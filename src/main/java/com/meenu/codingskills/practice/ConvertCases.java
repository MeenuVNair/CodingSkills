package com.meenu.codingskills.practice;
/**
* @author Meenu V. Nair
*
 * Creation time: Jun 5, 2020 5:56:38 PM
*
*/

public class ConvertCases {
	
	private String convertCase(String s) {
		String converted = "";
		
		for(int i = 0; i < s.length(); i++) {
			int ch = s.charAt(i);
			if(ch >= 65 && ch <= 90) {
				ch += 32;
				converted += (char)ch;
			}
			else if(ch >= 97 && ch <= 122) {
				ch -= 32;
				converted += (char) ch;
			}
			if(ch == 32)
				converted += (char) ch;
		}
		return converted;
	}

	public void findSolution() {
		String s = "Alive is awesome";
		System.out.println("After case conversion : " + convertCase(s));
	}
}
