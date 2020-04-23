package com.meenu.codingskills.leetcode.easy;

/*
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".

 

Example 1:

Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
Example 2:

Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"
 */

/**
 * @author Meenu V Nair
 *
 */
public class DefangingAnIPAddress {

	private String defangIPaddr(String address) {
		
/************************  first approach  *******************************/

        //return address.replaceAll("\\.", "[.]");
		
		
/***********************  second approach  ********************************/
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < address.length(); i++) {
			char c = address.charAt(i);
			if(c == '.')
				sb.append("[.]");
			else
				sb.append(c);
		}
		
		return sb.toString();
    }
	
	public void findSolution() {
		//String address = "1.1.1.1";
		String address = "255.100.50.0";
		System.out.println("Defanged IP address : " + defangIPaddr(address));
	}
}
