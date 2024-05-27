package com.stringg;

public class ReverseWordInString {
	
public static void main(String[] args) {
		
		String s = "This is my 123 program";
		String arr[] = s.split(" ");
		
		String rev = "";
		String res = "";
		for(int i=arr.length-1;i>=0;i--) {
			rev = rev + ' ' + arr[i];
		}
		for(int i=rev.length()-1;i>=0;i--) {
			res += rev.charAt(i);
		}
		
		System.out.println(res);
		
	}

}
