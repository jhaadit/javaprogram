package com.array;

import java.util.Arrays;

public class RotateArray {
	
	public static void main(String[] args) {
		int arr[] = {5, 1, 8, 6, 3, 8, 1};
		int k = 4;
		
		rotateArray(arr, k);
		
		System.out.println(Arrays.toString(arr));
	}

	private static void rotateArray(int[] arr, int k) {
		int n = arr.length;
//		int temp[] = new int[n];
//		int count = 0;
//		for(int i=k;i<arr.length;i++) {
//			temp[count++] = arr[i];
//			
//		}
//		for(int i=0;i<k;i++) {
//			temp[count++] = arr[i];
//			
//		}
//		
//		for(int i=0;i<n;i++) {
//			arr[i] = temp[i];
//			
//		}
		
		for(int i=0;i<k;i++) {
			int temp = arr[0];
			int pos = 0;
			
			while(pos < n-1) {
				arr[pos] = arr[pos+1];
				pos++;
			}
			
			arr[n-1] = temp;
		}
		
		
	}

}
