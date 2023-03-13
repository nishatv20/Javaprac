package com.oopss.practice;
class Student4 {
	int id;
	String name;
	static String college ="PU";


static void change() {
	college = "CU";
}
//Constructor to initialize the variable
Student4(int i,String n) {
	id = i ;
	name = n;
}

//Method to display Values
void display() {
	System.out.println(id + " " + name + " " + college);
}
}
public class TestStaticMethod {
public static void main(String[] args) {
	Student4.change();
//	Creating Objects
	Student4 s1 = new Student4(1257 , "Nishat");
	Student4 s2 = new Student4(1256, "Aarya");
	Student4 s3 = new Student4(1258, "Pixy");
	
	s1.display();
	s2.display();
	s3.display();
}
}
