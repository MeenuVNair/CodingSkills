package com.meenu.codingskills.leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*
 * Given a paragraph and a list of banned words, return the most frequent word that is not in the list of banned words.  It is guaranteed there is at least one word that isn't banned, and that the answer is unique.

Words in the list of banned words are given in lowercase, and free of punctuation.  Words in the paragraph are not case sensitive.  The answer is in lowercase.

Example:
--------------
Input: 
paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."
banned = ["hit"]
Output: "ball"
Explanation: 
"hit" occurs 3 times, but it is a banned word.
"ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph. 
Note that words in the paragraph are not case sensitive,
that punctuation is ignored (even if adjacent to words, such as "ball,"), 
and that "hit" isn't the answer even though it occurs more because it is banned.
 */

public class MostCommonWord {

/************************* Re-factoring first approach *********************/
	private String mostCommonWord(String paragraph, String[] banned) {
		HashSet<String> bannedSet = new HashSet<>();
		for(String s : banned) {
			bannedSet.add(s);
		}
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for(String word : paragraph.replaceAll("[^a-zA-Z]", " ").toLowerCase().split(" ")) {
			if(!bannedSet.contains(word))
				map.put(word, map.getOrDefault(word, 0) + 1);
		}
		
		String commonWord = "";
		for(String key : map.keySet()) {
			if(commonWord.equals("") || map.get(key) > map.get(commonWord))
				commonWord = key;
		}
		
		return commonWord;
	}
	
/************************** First approach (very messed up code) **************************/
	/*private String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for(String word : banned) {
        	set.add(word);
        }
        
        String word = "";
        int i = 0;
        paragraph = paragraph.replaceAll("[^a-zA-Z]", " ");

        while(i < paragraph.length()) {
        	word = "";
	        while(i < paragraph.length() && paragraph.charAt(i) != ' ') {
	        	word += Character.toLowerCase(paragraph.charAt(i));
	        	i++;
	        }
	        i++;
	        if(!set.contains(word) && !word.equals(""))
	        	map.put(word, map.getOrDefault(word, 0) + 1);
        }
        int max = 0;
        String common = "";
        for(Map.Entry entry : map.entrySet()) {
        	max = Math.max(max, (int) entry.getValue());
        }
        
        for(Map.Entry entry : map.entrySet()) {
        	if(max == (int) entry.getValue()) {
        		common = (String) entry.getKey();
        		break;
        	}
        }
        return common;
    }*/
	
	public void findSolution() {
		String paragraph = "a, a, a, a, b,b,b,c, c"; //"Bob hit a ball, the hit BALL flew far after it was hit.";
		String banned[] = new String[] {"a"}; //{"hit"};
		
		String mostCommon = mostCommonWord(paragraph, banned);
		System.out.println("Most common word : " + mostCommon);
	}
}
