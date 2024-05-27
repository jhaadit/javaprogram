package com.array;

import java.util.Arrays;

public class SubString {
	
	public static void main(String[] args) {
		String s = "12345";
		int size = s.length();
		int n = (size*(size+1) + 1)/2;
		int count = 0;
		String arr[] = new String[n];
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				String s1 = s.substring(i, j);
				//System.out.println(s1);
				arr[count++] = s1;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
