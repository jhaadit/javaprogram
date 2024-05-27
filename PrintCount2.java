package com.stringg;

public class PrintCount2 {
	
	public static void main(String[] args) {
		String s = "2[ABC]3{XYZ}10{PQR}";
		
//		int num = 0;
//		char mychar = '\0';
//		String s1 = "";
//		for(char ch : s.toCharArray()) {
//			if(Character.isDigit(ch)) {
//				num = num * 10 + ch-48;
//			}
//			else if(Character.isAlphabetic(ch)) {
//				s1 += ch;
//			}
//			else if(ch == ']' || ch == '}') {
//				for(int i=0;i<num;i++) {
//					System.out.print(s1);
//				}
//				num = 0;
//				s1 = "";
//			}
//			
//		}
		
		int num = 0;
		
		for(int i=0;i<s.length();i++) {
			while(s.charAt(i) >= '0' && s.charAt(i) >='9') {
				num = num * 10 + s.charAt(i) - 48;			
			}
			
			if(s.charAt(i) >= 'A' && s.charAt(i) >= 'Z') {
				String res = "";
				while(s.charAt(i) >= 'A' && s.charAt(i) >= 'Z') {
					res += s.charAt(i);
					i++;
				}
				for(int j =0;j<num;j++) {
					System.out.println(res);
				}
				
				num = 0;
			}
			
			
		}
	}

}
