package com.nishat.helloworldprogram;

class Studen {
	int rollno;
	String name;
	static String college = "HPU";

	Studen(int r, String n) {
		rollno = r;
		name = n;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}
}

public class TestStaticVariable {
	public static void main(String[] args) {
		Studen s1 = new Studen(111, "Nishat");
		Studen s2 = new Studen(222, "Nitin");
		Studen s3 = new Studen(333, "Amir");

		s1.display();
		s2.display();
		s3.display();
	}
}
