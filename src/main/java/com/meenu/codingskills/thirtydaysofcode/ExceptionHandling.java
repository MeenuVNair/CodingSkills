package com.meenu.codingskills.thirtydaysofcode;

/*
 * 
 * Objective
Yesterday's challenge taught you to manage exceptional situations by using try and catch blocks. In today's challenge, you're going to practice throwing and propagating an exception. Check out the Tutorial tab for learning materials and an instructional video!

Task
Write a Calculator class with a single method: int power(int,int). The power method takes two integers,  and , as parameters and returns the integer result of . If either  or  is negative, then the method must throw an exception with the message: n and p should be non-negative.

Note: Do not use an access modifier (e.g.: public) in the declaration for your Calculator class.

Input Format

Input from stdin is handled for you by the locked stub code in your editor. The first line contains an integer, , the number of test cases. Each of the  subsequent lines describes a test case in  space-separated integers denoting  and , respectively.

Constraints

No Test Case will result in overflow for correctly written code.
Output Format

Output to stdout is handled for you by the locked stub code in your editor. There are  lines of output, where each line contains the result of  as calculated by your Calculator class' power method.

Sample Input:
4
3 5
2 4
-1 -2
-1 3

Sample Output:
243
16
n and p should be non-negative
n and p should be non-negative
 */

import java.util.Scanner;

/**
 * @author Meenu V Nair
 *
 */
public class ExceptionHandling {
	
	public static void main(String[] args) {
	    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}

class Calculator{
	   
    public int power(int n, int p) throws Exception{
        int value = 1;
        if(n < 0 || p < 0)
            throw new Exception("n and p should be non-negative");
        else{
            for(int i = 0; i < p ; i++){
                value = value * n;
            }
            return value;
        }
    }
}
