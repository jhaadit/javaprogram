package com.array;

import employee.main;

class B{
	public B m1(int x, int y) {
		return new B();
	}
}

public class extra extends B {
	public B m1(int x, int y) {
		return new B();
	}
	
	public static void main(String[] args) {
		B b = new B();
		b.m1(3, 4);
	}
}

