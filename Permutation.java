package com.stringg;

public class Permutation {
	
	public static void main(String[] args) {
		String s = "abc";
		permute(s, "");
	}

	private static void permute(String s, String res) {
		if(s.length() == 0) {
			System.out.println(res);
		}
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			String temp = s.substring(0, i) + s.substring(i+1);
			permute(temp, ch+res);
		}
		
	}

}
