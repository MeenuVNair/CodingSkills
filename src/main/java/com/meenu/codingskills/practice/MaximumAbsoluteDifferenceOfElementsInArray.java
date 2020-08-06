package com.meenu.codingskills.practice;

/*
 * Link to hackerrank problem : https://www.hackerrank.com/challenges/30-scope/problem
 * Objective
Today we're discussing scope. Check out the Tutorial tab for learning materials and an instructional video!

The absolute difference between two integers,  and , is written as . The maximum absolute difference between two integers in a set of positive integers, , is the largest absolute difference between any two integers in .

The Difference class is started for you in the editor. It has a private integer array () for storing  non-negative integers, and a public integer () for storing the maximum absolute difference.

Task
Complete the Difference class by writing the following:

A class constructor that takes an array of integers as a parameter and saves it to the  instance variable.
A computeDifference method that finds the maximum absolute difference between any  numbers in  and stores it in the  instance variable.
Input Format

You are not responsible for reading any input from stdin. The locked Solution class in your editor reads in  lines of input; the first line contains , and the second line describes the  array.

Constraints

, where 
Output Format

You are not responsible for printing any output; the Solution class will print the value of the  instance variable.

Sample Input

3
1 2 5
Sample Output

4
Explanation

The scope of the  array and  integer is the entire class instance. The class constructor saves the argument passed to the constructor as the  instance variable (where the computeDifference method can access it).

To find the maximum difference, computeDifference checks each element in the array and finds the maximum difference between any  elements: 


The maximum of these differences is , so it saves the value  as the  instance variable. The locked stub code in the editor then prints the value stored as , which is .
 */

import java.util.Scanner;

/**
* @author Meenu V. Nair
*
 * Creation time: Aug 6, 2020 5:22:33 PM
*
*/

public class MaximumAbsoluteDifferenceOfElementsInArray {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}

class Difference {
  	private int[] elements;
  	public int maximumDifference = -1;

	public Difference(int[] a){
		elements = a;
    }

	public int computeDifference() {
		for(int i = 0; i < elements.length; i++) {
			for(int j = i + 1; j < elements.length; j++) {
				maximumDifference = Math.max(maximumDifference, Math.abs(elements[i] - elements[j]));
			}
		}
		return maximumDifference;
	}
}
