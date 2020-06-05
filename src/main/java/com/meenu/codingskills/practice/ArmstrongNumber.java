package com.meenu.codingskills.practice;
/**
* @author Meenu V. Nair
*
 * Creation time: Jun 5, 2020 3:01:47 PM
*
*/

public class ArmstrongNumber {

	public void findSolution() {
		int num = 9474;
		String s = String.valueOf(num);
		int power = s.length();
		int n = num;
		
		int sum = 0;
		while(n > 0) {
			int digit = n % 10;
			sum += Math.pow(digit, power);
			n = n / 10;
		}
		boolean isArmstrong = (num == sum) ? true : false;
		System.out.println("Is armstrong number : " + isArmstrong);
	}
}
