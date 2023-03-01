package com.nishat.helloworldprogram;

class Employ {
	int id;
	String name;
	float salary;

	void insert(int i, float s, String n) {
		id = i;
		name = n;
		salary = s;
	}

	void display() {
		System.out.println(id + " " + name + " " + salary);
	}
}

public class TestEmployee {
	public static void main(String[] args) {
		Employ e1 = new Employ();
		Employ e2 = new Employ();
		Employ e3 = new Employ();

		e1.insert(123, 2000, "Nishat");
		e2.insert(114, 2500, "Anvi");
		e3.insert(163, 400, "Pixy");

		e1.display();
		e2.display();
		e3.display();
	}
}
