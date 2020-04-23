package com.meenu.codingskills.leetcode.easy;

/*
 * An image is represented by a 2-D array of integers, each integer representing the pixel value of the image (from 0 to 65535).

Given a coordinate (sr, sc) representing the starting pixel (row and column) of the flood fill, and a pixel value newColor, "flood fill" the image.

To perform a "flood fill", consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color as the starting pixel), and so on. Replace the color of all of the aforementioned pixels with the newColor.

At the end, return the modified image.

Example 1:
Input: 
image = [[1,1,1],[1,1,0],[1,0,1]]
sr = 1, sc = 1, newColor = 2
Output: [[2,2,2],[2,2,0],[2,0,1]]
Explanation: 
From the center of the image (with position (sr, sc) = (1, 1)), all pixels connected 
by a path of the same color as the starting pixel are colored with the new color.
Note the bottom corner is not colored 2, because it is not 4-directionally connected
to the starting pixel.
 */

/**
 * @author Meenu V Nair
 *
 */
public class FloodFill {

	private int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image == null || image.length == 0) {
        	return null;
        }
        if(image[sr][sc] == newColor)
        	return image;
        fill(image, sr, sc, newColor, image[sr][sc]);
        return image;
    }
	
	private void fill(int[][] image, int i, int j, int newColor, int oldColor) {
		if(i < 0 || i >= image.length || j < 0 || j >= image[i].length || image[i][j] != oldColor) {
			return;	
		}
		image[i][j] = newColor;
		fill(image, i + 1, j, newColor, oldColor);
		fill(image, i - 1, j, newColor, oldColor);
		fill(image, i, j + 1, newColor, oldColor);
		fill(image, i, j - 1, newColor, oldColor);	
	}
	
	public void findSolution() {
		int image[][] = new int[][] { {1,1,1},
									  {1,1,0},
									  {1,0,1}
									};
		int sr = 1;
		int sc = 1;
		int newColor = 2;
		
		for(int i = 0; i < image.length; i++) {
			for(int j = 0; j < image[i].length; j++) {
				System.out.print(image[i][j] + "  ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int updated[][] = floodFill(image, sr, sc, newColor);
		
		for(int i = 0; i < updated.length; i++) {
			for(int j = 0; j < updated[i].length; j++) {
				System.out.print(updated[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
