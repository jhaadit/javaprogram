package com.stringg;

public class PrintCountt {
	
public static void main(String[] args) {
		
		String s1 = "A2B3C15 ";
		int num = 0;
		char mychar = '\0';
		for(char ch : s1.toCharArray()) {
			if(Character.isDigit(ch)) {
				num = num * 10 + ch - 48;
			}
			else{
				for(int i =0;i<num;i++) {
					System.out.print(mychar);
				}
				num = 0;
				mychar = ch;
				
			}
		}
	}

}
