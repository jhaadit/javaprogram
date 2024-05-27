package com.stringg;

public class ReverseSentence {
	
	public static void main(String[] args) {
		
		String s = "This is my program";
		String arr[] = s.split(" ");
		
		String res = "";
		for(int i=arr.length-1;i>=0;i--) {
			res = res + ' ' + arr[i];
		}
		
		
		
		System.out.println(res);
		
	}

}
