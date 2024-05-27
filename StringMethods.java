package com.stringg;

import java.util.Arrays;

public class StringMethods {
	public static void main(String[] args) {
	String s = "Java Programming   ";
		
		System.out.println(s.length());
		System.out.println(s.charAt(3));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.contains("pro"));
		System.out.println(s.trim());
		System.out.println(s.startsWith("ja"));
		System.out.println(s.endsWith("ing"));
		System.out.println(s.concat("j2ee"));
		char c[] = s.toCharArray();
		System.out.println(Arrays.toString(c));
		
		String[] arr = s.split(" ");
		System.out.println(Arrays.toString(arr));
	}
}
