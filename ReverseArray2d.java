package com.twoDarray;

import java.util.Arrays;

public class ReverseArray2d {
	
	public static void main(String[] args) {
		int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
		reverseArr(arr);
		

		int i = 0;
		int j = arr.length;
		
		while(j>i) {
			int [] temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		System.out.println(Arrays.deepToString(arr));
	}
	
	private static void reverseArr(int[][] arr) {
	
		for(int i=0;i<arr.length;i++) {
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

	

}
