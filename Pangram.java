package com.stringg;

public class Pangram {
	
	public static void main(String[] args) {
		String s = "qwertyyuioplgfddtgfdfsdsrawwdcyulkbbjjkjhgfdsazxcvbnm56";
		System.out.println(isPangram(s));
	}

	private static boolean isPangram(String s) {
		char ch[] = s.toCharArray();
		int [] arr = new int[26];
		for(int i=0;i<ch.length;i++) {
			if(ch[i] >= 'a' && ch[i] <= 'z') {
				arr[ch[i] - 'a']++;
			}
			
		}
		
		for(int x : arr) {
			if(x == 0) {
				return false;
			}
		}
		
		return true;
	}

}
