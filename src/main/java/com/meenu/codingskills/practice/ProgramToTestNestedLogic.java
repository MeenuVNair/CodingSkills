package com.meenu.codingskills.practice;

/*
 * Link to hackerrank problem : https://www.hackerrank.com/challenges/30-nested-logic/problem
 * Objective
Today's challenge puts your understanding of nested conditional statements to the test. You already have the knowledge to complete this challenge, but check out the Tutorial tab for a video on testing!

Task
Your local library needs your help! Given the expected and actual return dates for a library book, create a program that calculates the fine (if any). The fee structure is as follows:

If the book is returned on or before the expected return date, no fine will be charged (i.e.: .
If the book is returned after the expected return day but still within the same calendar month and year as the expected return date, .
If the book is returned after the expected return month but still within the same calendar year as the expected return date, the .
If the book is returned after the calendar year in which it was expected, there is a fixed fine of .
Input Format

The first line contains  space-separated integers denoting the respective , , and  on which the book was actually returned.
The second line contains  space-separated integers denoting the respective , , and  on which the book was expected to be returned (due date).

Constraints

Output Format

Print a single integer denoting the library fine for the book received as input.

Sample Input

9 6 2015
6 6 2015
Sample Output

45
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
* @author Meenu V. Nair
*
 * Creation time: Aug 6, 2020 5:34:53 PM
*
*/

public class ProgramToTestNestedLogic {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aD, aM, aY, eD, eM, eY;
        String[] aDate = null;
        String[] eDate = null;
        boolean first = true;
        for(int i = 0; i < 2; i++) {
        	String line = sc.nextLine();
        	if(first) {
        		aDate = line.split(" ");
        		first = false;
        	}
        	else
        		eDate = line.split(" ");
        }
        aD = Integer.valueOf(aDate[0]); aM = Integer.valueOf(aDate[1]); aY = Integer.valueOf(aDate[2]);
        eD = Integer.valueOf(eDate[0]); eM = Integer.valueOf(eDate[1]); eY = Integer.valueOf(eDate[2]);
        /*System.out.println(aD + "  " + aM + "  " + aY);
        System.out.println(eD + "  " + eM + "  " + eY);*/
        
        System.out.println(computeFine(aD, aM, aY, eD, eM, eY));
	}
	
	private static int computeFine(int aD, int aM, int aY, int eD, int eM, int eY) {
		int fine = 0;
		if(aD == eD && aM == eM && aY == eY) {
			return fine;
		}
		else if(aY == eY && aM == eM && aD < eD) {
			fine = 0;
		}
		else if(aY == eY && aM < eM) {
			fine = 0;
		}
		else if (aY < eY) {
			fine = 0;
		}
		else if(aY == eY) {
			if(aM == eM) {
				fine = 15 * (aD - eD);
			}
			else {
				fine = 500 * (aM - eM);
			}
		}
		else {
			fine = 10000;
		}
		
		return fine;
	}
}
