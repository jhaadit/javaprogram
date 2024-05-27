package com.stringg;

public class PrintCount1 {
	
	String s1 = "A2B3C15";
	int num = 0;
	char mychar = '\0';
	for(char ch : s1.toCharArray()) {
		
		if(Character.isDigit(ch)) {
			num = num * 10 + ch - 48;
		}
		else if(Character.isAlphabetic(ch)){
			for(int i =0;i<num;i++) {h
				System.out.print(mychar);
			}
			
			mychar = ch;
			num = 0;
		}
	}
}

}
