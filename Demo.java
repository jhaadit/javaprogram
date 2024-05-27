package com.exception;


public class Demo {
	public static void main(String[] args) {
		add(-10, 20);
	}

	private static void add(int i, int j) {
		if(i>0 && j>0) {
			System.out.println(i+j);
		}
		else {
			throw new ArithmeticException();
		}
	}
}
