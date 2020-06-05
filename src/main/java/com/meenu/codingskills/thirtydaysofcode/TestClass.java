package com.meenu.codingskills.thirtydaysofcode;
/**
* @author Meenu V. Nair
*
 * Creation time: Jun 4, 2020 11:37:59 AM
*
*/

class ParentClass {
	public static void print() {
		System.out.println("Print method of Parent class");
	}
}

class ChildClass extends ParentClass{
	public static void print() {
		System.out.println("Print method of Child class");
	}
}

public class TestClass{
	public static void main(String args[]) {
		ParentClass pobj = new ChildClass();
		pobj.print();
	}
}
