package com.meenu.codingskills.leetcode.easy;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Given a stream of integers and a window size, calculate the moving average of all integers in the sliding window.

Example:
MovingAverage m = new MovingAverage(3);
m.next(1) = 1
m.next(10) = (1 + 10) / 2
m.next(3) = (1 + 10 + 3) / 3
m.next(5) = (10 + 3 + 5) / 3
 */

public class MovingAverageFromDataStream {
	int size;
	Queue<Integer> window;
	
	public MovingAverageFromDataStream(int size) {
		this.size = size;
		window = new LinkedList<>();
	}
	
	private double next(int value) {
		if(window.size() >= size) {
			window.remove();
		}
		window.add(value);
		double average = 0;
		for(Integer i : window) {
			System.out.print(i + "  ");
			average += i;
		}
		System.out.println();
		return average / window.size();
	}

	public void findSolution() {
		MovingAverageFromDataStream obj = new MovingAverageFromDataStream(3);
		double movingAverage = obj.next(1);
		System.out.println("Moving average : " + movingAverage);
		movingAverage = obj.next(10);
		System.out.println("Moving average : " + movingAverage);
		movingAverage = obj.next(3);
		System.out.println("Moving average : " + movingAverage);
		movingAverage = obj.next(5);
		System.out.println("Moving average : " + movingAverage);
		movingAverage = obj.next(2);
		System.out.println("Moving average : " + movingAverage);
	}
}
