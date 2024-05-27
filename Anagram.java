package com.stringg;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		String s1 = "rrrr";
		String s2 = "rrrc";
		
//		char arr1[] = s1.toCharArray();
//		char arr2[] = s2.toCharArray();
//		
//		Arrays.sort(arr1);
//		Arrays.sort(null);
		
		
		System.out.println(isAnagram(s1, s2));
	}

	private static boolean isAnagram(String s1, String s2) {
		int cnt = 0;
		for(int i=0;i<s1.length();i++) {
			for(int j=0;j<s2.length();j++) {
				if(s1.length() != s2.length()) {
					return false;
				}
				else if(s1.charAt(i) == s2.charAt(j)) {
					cnt++;
					
					break;
				}
			}
		}
		
		if(cnt == s1.length()) {
			return true;
		}
		
		return false;
		
	}

}
