package com.nishat.helloworldprogram;

class Student1 {
	int rollno;
	String name;
	float fee;

	Student1(int rollno, String name, float fee) {
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}
}

public class TestThis {
	
	public static void main(String[] args) {
		Student1 s1 = new Student1(123, "Shalini", 1000);
		Student1 s2 = new Student1(144, "Rajesh", 2000);
		Student1 s3 = new Student1(156, "Nishat", 4000);
		
		s1.display();
		s2.display();
		s3.display();
	}

}
