package com.array;

import java.util.Arrays;

public class ZeroToLast {
	
	public static void main(String[] args) {
		int arr[] = {5, 0, 8, 0, 9, 0, 5, 0, 1};
		System.out.println(Arrays.toString(arr));
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != 0) {
				arr[count++] = arr[i];
				
			}
		}
		
		for(int j= count;j<arr.length;j++) {
			arr[j] = 0;
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	

}
