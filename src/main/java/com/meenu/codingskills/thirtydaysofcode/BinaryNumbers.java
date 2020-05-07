/*
 * Objective
Today, we're working with binary numbers. Check out the Tutorial tab for learning materials and an instructional video!

Task
Given a base- integer, , convert it to binary (base-). Then find and print the base- integer denoting the maximum number of consecutive 's in 's binary representation.

Input Format

A single integer, .

Constraints

Output Format

Print a single base- integer denoting the maximum number of consecutive 's in the binary representation of .
 */


package com.meenu.codingskills.thirtydaysofcode;
import java.util.*;

/**
 * @author Meenu V Nair
 *
 */
public class BinaryNumbers {
	
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int count = 0;
        int lastRem = 0;
        int initial = 0;
        List<Integer> consecutives = new ArrayList<Integer>();
        while(n > 0){
            int rem = n % 2;
            n = n / 2;
            if(rem == 1 && initial == 0){
                initial = 1;
                count++;
            }
            if(rem == 1 && lastRem == rem){
                count++;
            }
            if(rem == 0){
                consecutives.add(count);
                count = 0;
                initial = 0;
            }
            Collections.sort(consecutives);
            lastRem = rem;
        }
        if(n == 0) {
        	consecutives.add(count);
        }
        Collections.sort(consecutives);
        System.out.println(consecutives.get(consecutives.size() - 1));
        scanner.close();
    }
}
