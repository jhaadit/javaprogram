package com.twoDarray;

import java.util.Arrays;

public class SnakePattern {
	
	public static void main(String[] args) {
		int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}};
		
		for(int i=0;i<arr.length;i++) {
			if(i % 2 != 0) {
				int j = 0;
				int k = arr[i].length-1;
				
				while(j < k) {
					int temp = arr[i][j];
					arr[i][j] = arr[i][k];
					arr[i][k] = temp;
					j++;
					k--;
				}
			}
		}
		
		System.out.println(Arrays.deepToString(arr));
	}

}
