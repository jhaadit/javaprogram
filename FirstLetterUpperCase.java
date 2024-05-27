package com.stringg;

public class FirstLetterUpperCase {
	
	public static void main(String[] args) {
		String s = "this is my program";
		String s1 = "";
		if(s.charAt(0) >= 'a' && s.charAt(0)<= 'z') {
			s1 += Character.toString(s.charAt(0) - 32);
		}
		else {
			s1 += s.charAt(0);
		}	
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i-1) == ' ' && (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')) {	
				s1 += Character.toString(s.charAt(i) - 32);	
			}
			else {		
				s1 += s.charAt(i);			
			}	
		}
		System.out.println(s1);
	}
}
