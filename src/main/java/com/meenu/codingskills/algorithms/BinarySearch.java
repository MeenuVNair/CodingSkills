package com.meenu.codingskills.algorithms;
/**
* @author Meenu V Nair
*
 * Creation time: Apr 24, 2020 1:01:29 PM
*
*/

public class BinarySearch {
	
	private boolean binarySearch(int[] input, int num) {
		int l = 0;
		int r = input.length - 1;
		while(l < r) {
			int mid = l + ( r - l) / 2;
			if(input[mid] == num)
				return true;
			if(num < input[mid]) {
				r = mid - 1;
			}
			else {
				l = mid + 1;
			}
		}
		return false;
	}

	public void findSolution() {
		int input[] = new int[] {3,6,8,9,11,15,23,29,32,46,55,98};
		int num = 10;
		System.out.println("Is " + num + " present in the given array ? " + binarySearch(input, num));
	}
}
