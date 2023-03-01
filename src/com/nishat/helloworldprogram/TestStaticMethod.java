package com.nishat.helloworldprogram;

class Stude {
	int rollno;
	String name;
	static String college = "HPU";

	static void change() {
		college = "CU";
	}

	Stude(int r, String n) {
		rollno = r;
		name = n;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}
}

public class TestStaticMethod {
	public static void main(String[] args) {
		Stude.change();
		Stude s1 = new Stude(111, "Yogesh");
		Stude s2 = new Stude(123, "Nitin");

		s1.display();
		s2.display();
	}
}
