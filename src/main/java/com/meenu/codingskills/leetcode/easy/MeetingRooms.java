package com.meenu.codingskills.leetcode.easy;

import java.util.Arrays;
import java.util.PriorityQueue;

/*
 * Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (s[i] is strictly less than e[i]), determine if a person could attend all meetings.

Example 1:
Input: [[0,30],[5,10],[15,20]]
Output: false

Example 2:
Input: [[7,10],[2,4]]
Output: true

 */

public class MeetingRooms {

	class Interval{
		int start;
		int end;
		Interval(){
			start = 0;
			end = 0;
		}
		Interval(int s, int e){
			start = s;
			end = e;
		}
	}
	
	private boolean canAttendMeetings(Interval[] intervals) {
		if(intervals == null || intervals.length == 0)
			return false;
		boolean canAttend = true;
		
		Arrays.sort(intervals, (a,b) -> a.start - b.start);
		
		PriorityQueue<Interval> minHeap = new PriorityQueue<>((a,b) -> a.end - b.end);
		for(Interval i : intervals) {
			minHeap.add(i);
		}
		while(!minHeap.isEmpty()) {
			Interval current = minHeap.remove();
			if(minHeap.peek() != null && current.end > minHeap.peek().start) {
				canAttend = false;
				break;
			}
		}
		
		
		return canAttend;
	}
	
	public void findSolution() {
		Interval interval1 = new Interval(0,30);
		Interval interval2 = new Interval(5,10);
		Interval interval3 = new Interval(15,20);
		
		Interval intervals[] = new Interval[] {interval1, interval2, interval3};
		
		/*Interval interval1 = new Interval(7,20);
		Interval interval2 = new Interval(2,4);
		
		Interval intervals[] = new Interval[] {interval1, interval2};*/
		
		boolean canAttend = canAttendMeetings(intervals);
		System.out.println("Can attend all meetings : " + canAttend);
	}
}
