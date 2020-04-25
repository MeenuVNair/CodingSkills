package com.meenu.codingskills.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/*
 * Given a string containing only digits, restore it by returning all possible valid IP address combinations.

A valid IP address consists of exactly four integers (each integer is between 0 and 255) separated by single points.

Example:

Input: "25525511135"
Output: ["255.255.11.135", "255.255.111.35"]
 */

/**
* @author Meenu V Nair
*
 * Creation time: Apr 25, 2020 7:38:38 PM
*
*/

public class RestoreIPAddresses {
	
	private List<String> restoreIpAddresses(String s) {
	     List<String> restoredIps = new ArrayList<>();
	     restoreIps(0, 0, new ArrayList<>(), s, restoredIps);
	     return restoredIps;
    }

	private void restoreIps(int progressIndex, int currentSegment, List<String> ipAddressSegment, String inputIpString, List<String> restoredIps) {
		
		if(progressIndex == inputIpString.length() && currentSegment == 4) {
			restoredIps.add(buildIpStringFromSegments(ipAddressSegment));
		}
		
		else if(currentSegment == 4) {
			return;
		}
		
		for(int i = 1; i <= 3 && progressIndex + i <= inputIpString.length(); i++) {
			String segmentAsString = inputIpString.substring(progressIndex, (progressIndex + i));
			int segmentAsInt = Integer.parseInt(segmentAsString);
			
			if((i > 1 && segmentAsString.charAt(0) == '0') || segmentAsInt > 255) {
				break;
			}
			
			ipAddressSegment.add("" + segmentAsInt);
			restoreIps(progressIndex + i, currentSegment + 1, ipAddressSegment, inputIpString, restoredIps);
			ipAddressSegment.remove(ipAddressSegment.size() - 1);
		}
		
	}
	
	private String buildIpStringFromSegments(List<String> ipAddressSegments) {
		return ipAddressSegments.get(0) + "." + ipAddressSegments.get(1) + "."+ ipAddressSegments.get(2) + "." + ipAddressSegments.get(3);
		//return ipAddressSegments[0] + "." + ipAddressSegments[1] + "."+ ipAddressSegments[2] + "." + ipAddressSegments[3];
	  }
	
	public void findSolution() {
		//String inputIpString = "25525511135";
		String inputIpString = "0000";
		List<String> restoredIps = restoreIpAddresses(inputIpString);
		for(String s : restoredIps) {
			System.out.println(s);
		}
	}
}
