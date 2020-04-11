package com.meenu.codingskills.old.leetcode;

import java.util.HashMap;
import java.util.Map;

/*
 * Given a string, find the length of the longest substring without repeating characters.
 * 
 * Example: 
 * 			Input: "abcabcbb"
 * 			Output: 3 
 *			Explanation: The answer is "abc", with the length of 3. 
 *
 *			Input: "bbbbb"
			Output: 1
			Explanation: The answer is "b", with the length of 1.
			
			Input: "pwwkew"
			Output: 3
			Explanation: The answer is "wke", with the length of 3. 
            Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * 
 */
public class LongestSubstringWithoutRepeatingCharacters {
	
	public static void main(String args[]) {
		String input = "pwwkew"; // "bbbbbb"; // "abcabcbb";
		int length = lengthOfLongestSubstring(input);
		System.out.println(length);
		
	}
	
	// best approach ..... optimized sliding window
	
	public static int lengthOfLongestSubstring(String s) {
		int length = s.length();
		int longestSoFar = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int j = 0, i = 0; j < length; j++) {
			if(map.containsKey(s.charAt(j))) {
				i = Math.max(map.get(s.charAt(j)), i);
			}
			longestSoFar = Math.max(longestSoFar, j - i + 1);
			map.put(s.charAt(j), j + 1);
		}
		return longestSoFar;
	}

	// first approach ....... brute force
	/*public static int lengthOfLongestSubstring(String s) {
		int length = s.length();
		int longestSoFar = 0;
		for(int i = 0; i < length; i++) {
			for(int j = i + 1; j <= length; j++) {
				if(allUnique(s, i, j)) {
					longestSoFar = Math.max(longestSoFar, j - i);
				}
			}
		}
		return longestSoFar;
	}
	
	public static boolean allUnique(String s, int start, int end) {
		Set<Character> set = new HashSet<>();
		for(int i = start; i < end; i++) {
			if(set.contains(s.charAt(i))) {
				return false;
			}
			set.add(s.charAt(i));
		}
		return true;
	}*/
}


/////////////////////////////////////////////////////////////

/*
 * 
 * Algorithm (for first approach) Time complexity : O(n^3)

		Suppose we have a function boolean allUnique(String substring) which will return true if the characters in the substring are all unique, otherwise false. 
		We can iterate through all the possible substrings of the given string s and call the function allUnique. 
		If it turns out to be true, then we update our answer of the maximum length of substring without duplicate characters.
		
		Now let's fill the missing parts:
		
		1. To enumerate all substrings of a given string, we enumerate the start and end indices of them. 
			Suppose the start and end indices are ii and jj, respectively. 
			Then we have 0 \leq i \lt j \leq n0≤i<j≤n (here end index jj is exclusive by convention). 
			Thus, using two nested loops with ii from 0 to n - 1n−1 and jj from i+1i+1 to nn, we can enumerate all the substrings of s.
			
		2. To check if one string has duplicate characters, we can use a set. 
			We iterate through all the characters in the string and put them into the set one by one. 
			Before putting one character, we check if the set already contains it. If so, we return false. 
			After the loop, we return true.

*
*
* 
* 	Approach 2: Sliding Window  Time complexity : O(2n) = O(n). In the worst case each character will be visited twice by i and j.

	Algorithm

			The naive approach is very straightforward. But it is too slow. So how can we optimize it?
			
			In the naive approaches, we repeatedly check a substring to see if it has duplicate character. 
			But it is unnecessary. If a substring S_ij from index i to j−1 is already checked to have no duplicate characters. 
			We only need to check if s[j]s[j] is already in the substring s_ij
			
			To check if a character is already in the substring, we can scan the substring, which leads to an O(n^2) algorithm. 
			But we can do better.
			
			By using HashSet as a sliding window, checking if a character in the current can be done in O(1).
			
			A sliding window is an abstract concept commonly used in array/string problems. 
			A window is a range of elements in the array/string which usually defined by the start and end indices, i.e. [i,j) (left-closed, right-open). 
			A sliding window is a window "slides" its two boundaries to the certain direction. For example, if we slide [i,j) to the right by 11 element, then it becomes [i+1,j+1) (left-closed, right-open).
			
			Back to our problem. We use HashSet to store the characters in current window [i,j) (j=i initially). 
			Then we slide the index j to the right. If it is not in the HashSet, we slide j further. Doing so until s[j] is already in the HashSet. 
			At this point, we found the maximum size of substrings without duplicate characters start with index i. If we do this for all i, we get our answer.
* 

*  
*   Approach 3: Sliding Window Optimized
*   
			The above solution requires at most 2n steps. In fact, it could be optimized to require only n steps. 
			Instead of using a set to tell if a character exists or not, we could define a mapping of the characters to its index. 
			Then we can skip the characters immediately when we found a repeated character.
			
			The reason is that if s[j] have a duplicate in the range [i,j) with index j′, we don't need to increase i little by little. 
			We can skip all the elements in the range [i,j ′] and let i to be j' + 1 directly.
			
*/
