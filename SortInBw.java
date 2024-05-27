package com.stringg;

import java.util.Arrays;

public class SortInBw {
	
	public static void main(String[] args) {
		int[] arr = {2, 5, 1, 3, 8, 9, 6, 4, 7,10};
		
		sortInBw(arr);
		
		System.out.println(Arrays.toString(arr));
	}

	private static void sortInBw(int[] arr) {
		
		int mid = arr.length/2;
		
		for(int i=0;i<mid;i++) {
			for(int j=i+1;j<mid;j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				} 
			}
		}
		
		for(int i=mid;i< arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				} 
			}
		}
		
	}

}
