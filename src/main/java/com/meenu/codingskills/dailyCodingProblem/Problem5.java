package com.meenu.codingskills.dailyCodingProblem;

/*
 * cons(a, b) constructs a pair, and car(pair) and cdr(pair) returns the first and last element of that pair. For example, car(cons(3, 4)) returns 3, and cdr(cons(3, 4)) returns 4.

Given this implementation of cons:

def cons(a, b):
    def pair(f):
        return f(a, b)
    return pair
Implement car and cdr.
 */

/**
* @author Meenu V Nair
*
 * Creation time: May 6, 2020 2:18:54 PM
*
*/

public class Problem5 {
	Pair pair;

	private Pair cons(int a, int b) {
		pair = new Pair(a,b);
		return pair;
	}
	
	private int car(Pair pair) {
		return pair.first;
	}
	
	private int cdr(Pair pair) {
		return pair.last;
	}
	
	public void findSolution() {
		Pair pair = cons(3, 4);
		System.out.println(car(pair));
		System.out.println(cdr(pair));
	}
	
	class Pair{
		int first;
		int last;
		
		Pair(int a, int b){
			first = a;
			last = b;
		}
	}
}
