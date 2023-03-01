package com.nishat.helloworldprogram;

class Adder {
	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}

}

public class TestInheritance1 {
	public static void main(String[] args) {
		System.out.println(Adder.add(11, 10));
		System.out.println(Adder.add(20, 60, 40));
	}
}
