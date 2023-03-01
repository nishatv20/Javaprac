package com.nishat.helloworldprogram;

public class ParametrConstructor {
	int id;
	String name;

	ParametrConstructor(int i, String n) {
		id = i;
		name = n;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		ParametrConstructor p1 = new ParametrConstructor(111, "Nishat");
		p1.display();
	}
}
