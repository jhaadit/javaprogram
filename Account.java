package com.exception;

class NegativeInputException extends Exception{
	
}
public class Account {
	static int bal;
	
	public static void main(String[] args) {
		try {
			deposite(-200);
		}
		catch(NegativeInputException e) {
			e.printStackTrace();
		}
		
	}

	private static void deposite(int amt) throws NegativeInputException  {
		
		if(amt > 0) {
			bal = bal+amt;
		}
		else
			throw new NegativeInputException();
	}
}
