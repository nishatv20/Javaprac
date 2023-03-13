package com.oopss.practice;

class Student9 {
	int id;
	String name;
	
	void insertRecord(int i , String n) {
		id = i;
		name = n;
	}
	
	void displayRecord() {
		System.out.println(id + " " + name);
	}
}
public class TestStudent4 {
public static void main(String[] args) {
	Student9 s1  = new Student9();
	Student9 s2 = new Student9();
	
	s1.insertRecord(112, "Nitin");
	s2.insertRecord(114, "Kartik");
	
	s1.displayRecord();
	s2.displayRecord();
	
}
}
