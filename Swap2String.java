package com.stringg;

public class Swap2String {
	
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "hii";
		
		System.out.println("before swapping s1: " + s1);
		System.out.println("before swapping s2: " + s2);
		
		s1 = s1 + s2;
		
		s2 = s1.substring(0, s1.length()-s2.length());
		s1 = s1.substring(s2.length(), s1.length());
		
		System.out.println("------------------------------------");
		
		System.out.println("after swapping s1: " + s1);
		System.out.println("after swapping s2: " + s2);
	}

}
