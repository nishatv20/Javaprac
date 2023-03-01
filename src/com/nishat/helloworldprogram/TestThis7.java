package com.nishat.helloworldprogram;

class Student8 {
	int rollno;
	String name, course;
	float fee;

	Student8(int rollno, String name, String course) {
		this.rollno = rollno;
		this.name = name;
		this.course = course;
	}

	Student8(int rollno, String name, String course, float fee) {
		this(rollno, name, course);
		this.fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + course + " " + fee);
	}
}

public class TestThis7 {
	public static void main(String[] args) {
		Student8 s1 = new Student8(131, "Nishat", "Java");
		Student8 s2 = new Student8(141, "Ankit", "C++", 6000f);
		s1.display();
		s2.display();
	}
}
