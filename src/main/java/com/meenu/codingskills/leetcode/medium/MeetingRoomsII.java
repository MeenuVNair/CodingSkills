package com.meenu.codingskills.leetcode.medium;

import java.util.Arrays;
import java.util.PriorityQueue;

/*
 * Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] 
 * find the minimum number of conference rooms required.
 */

public class MeetingRoomsII {
	
	private int minMeetingRooms(Interval[] intervals) {
		if(intervals == null || intervals.length == 0)
			return 0;
		
		Arrays.sort(intervals, (a,b) -> a.start - b.start);
		PriorityQueue<Interval> minHeap = new PriorityQueue<>((a,b) -> a.end - b.end);
		minHeap.add(intervals[0]);
		for(int i = 0; i < intervals.length; i++) {
			Interval currentInterval = intervals[i];
			Interval earliest = minHeap.remove();
			if(currentInterval.start >= earliest.end) {
				earliest.end = currentInterval.end;
			}
			else if(currentInterval != earliest){
				minHeap.add(currentInterval);
			}
			minHeap.add(earliest);
		}
		return minHeap.size();
	}
	
	public void findSolution() {
		Interval interval1 = new Interval(0,30);
		Interval interval2 = new Interval(5,10);
		Interval interval3 = new Interval(15,20);
		
		Interval intervals[] = new Interval[] {interval1, interval2, interval3};
		
		int minMeetingRooms = minMeetingRooms(intervals);
		System.out.println("Meeting rooms required : " + minMeetingRooms);
	}
}

class Interval{
	int start;
	int end;
	Interval(){
		start = 0; end = 0;
	}
	Interval(int s, int e){
		start = s;
		end = e;
	}
}
