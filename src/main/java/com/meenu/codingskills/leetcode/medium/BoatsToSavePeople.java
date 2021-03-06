package com.meenu.codingskills.leetcode.medium;

import java.util.Arrays;
import java.util.PriorityQueue;

/*
 * The i-th person has weight people[i], and each boat can carry a maximum weight of limit.

Each boat carries at most 2 people at the same time, provided the sum of the weight of those people is at most limit.

Return the minimum number of boats to carry every given person.  (It is guaranteed each person can be carried by a boat.)

 

Example 1:

Input: people = [1,2], limit = 3
Output: 1
Explanation: 1 boat (1, 2)
Example 2:

Input: people = [3,2,2,1], limit = 3
Output: 3
Explanation: 3 boats (1, 2), (2) and (3)
Example 3:

Input: people = [3,5,3,4], limit = 5
Output: 4
Explanation: 4 boats (3), (3), (4), (5)
 */

/**
 * @author Meenu V Nair
 *
 */
public class BoatsToSavePeople {
	
	private int numRescueBoats(int[] people, int limit) {
		Arrays.sort(people);
        int numOfBoats = 0;
        int i = 0; int j = people.length - 1;
        while(i <= j) {
        	if(people[i] + people[j] <= limit) {
        		i++;
        		j--;
        	}
        	else {
        		j--;
        	}
        	numOfBoats++;
        }
        
        return numOfBoats;
    }
	
	public void findSolution() {
		int people[] = new int[] {3,2,2,1};
		int limit = 3;
		
		int numOfBoats = numRescueBoats(people, limit);
		System.out.println("Number of boats : " + numOfBoats);
	}
}
