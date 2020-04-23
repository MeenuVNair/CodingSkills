package com.meenu.codingskills.old.thirtydaysofcode;

import java.util.Scanner;

/*
 * 
 * Objective
Today, we're getting started with Exceptions by learning how to parse an integer from a string and print a custom error message. Check out the Tutorial tab for learning materials and an instructional video!

Task
Read a string, , and print its integer value; if  cannot be converted to an integer, print Bad String.

Note: You must use the String-to-Integer and exception handling constructs built into your submission language. If you attempt to use loops/conditional statements, you will get a  score.

Input Format

A single string, 

Output Format

Print the parsed integer value of , or Bad String if  cannot be converted to an integer.

 */


/**
 * @author Meenu V Nair
 *
 */
public class Exceptions_StringToInteger {
	 public static void main(String[] args) {
	      Scanner in = new Scanner(System.in);
	      String S = in.next();
	      try{
	          int convertedValue = Integer.parseInt(S);
	          System.out.println(convertedValue);
	      }
	      catch(Exception e){
	          System.out.println("Bad String");
	      }
	      in.close();
	    }
	}
