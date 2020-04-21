package com.meenu.codingskills.leetcode.easy;

/*
 * Count the number of prime numbers less than a non-negative number, n.

Example:
Input: 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 */

public class CountPrimes {

	private int countPrimes(int n) {
		int primeCount = 0;
		boolean primes[] = new boolean[n];
		
		for(int i = 2; i * i < primes.length; i++) {
			if(!primes[i]) {
				for(int j = i; j * i < primes.length; j++) {
					primes[j * i] = true;
				}
			}
		}
		
		for(int i = 2; i < primes.length; i++) {
			if(!primes[i])
				primeCount++;
		}
		
		return primeCount;
	}
	
	public void findSolution() {
		int n = 10;
		int primeCount = countPrimes(n);
		System.out.println("Number of primes : " + primeCount);
	}
	
/*********** Typical solution - But this usually exceeds time limit for larger inputs  **********************/
	
	/*private int countPrimes(int n) {
		int primeCount = 0;
		if(n == 0 || n == 1) {
			return 0;
		}
        for(int i = 2 ; i < n ; i++) {
        	boolean isPrime = true;
        	for(int j = 2; j <= i / 2; j++) {
        		if(i % j == 0) {
        			isPrime = false;
        			break;
        		}
        	}
        	if(isPrime)
        		primeCount++;
        }
        return primeCount;
    }*/
}
