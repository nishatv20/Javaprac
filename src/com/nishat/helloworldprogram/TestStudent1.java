package com.nishat.helloworldprogram;

class Student {
	int id;
	String name;
}

public class TestStudent1 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.id = 123;
		s1.name = "Nishat";
		System.out.println(s1.id + " " + s1.name);
	}
}
