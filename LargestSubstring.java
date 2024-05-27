package com.array;

public class LargestSubstring {
	
	public static void main(String[] args) {
//		double d = 0.1;
//		double c = 0.7;
//		
//		System.out.println();
		String s = "abcabcef";
		
		String res = "";
		
		for(int i=0;i<s.length();i++) {
			String out = "" + s.charAt(i);
			
			for(int j = i+1;j<s.length();j++) {
				String ch = "" + s.charAt(j);
				
				if(out.contains(ch)) {
					if(out.length()>res.length()) {
						res = out;
					}
					break;
				}
				else {
					out = out + ch;
				}
			}
			if(out.length()>res.length()) {
				res = out;
			}
		}
		
		System.out.println(res);
	}

}
