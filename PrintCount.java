package com.stringg;

public class PrintCount {
	
	public static void main(String[] args) {
		
		String s1 = "2A3B15C";
		int num = 0;
		char mychar = '\0';
		for(char ch : s1.toCharArray()) {
			mychar = ch;
			if(Character.isDigit(ch)) {
				num = num * 10 + ch - 48;
			}
			else if(Character.isAlphabetic(ch)){
				for(int i =0;i<num;i++) {
					System.out.print(ch);
				}
				num = 0;
			}
		}
	}

}
