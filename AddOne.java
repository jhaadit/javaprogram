package com.array;

import java.util.Arrays;

public class AddOne {
	
	public static void main(String[] args) {
		int arr[] = {9,9,9,9};
		
		int carry = 1;
		
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i] + carry == 10) {
				arr[i] = 0;
				carry = 1;
			}
			else {
				arr[i] += carry;
				carry = 0;
			}
		}
		if(carry == 1) {
			arr = new int[arr.length+1];
			arr[0] = 1;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
