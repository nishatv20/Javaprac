package com.nishat.helloworldprogram;

class Stud {
	int rollno;
	String name;

	void insertRecord(int r, String n) {
		rollno = r;
		name = n;
	}

	void displayInformation() {
		System.out.println(rollno + " " + name);
	}

}

public class ClassnObj {
	public static void main(String[] args) {
		Stud s1 = new Stud();
		Stud s2 = new Stud();
		s1.insertRecord(111, "Anvi");
		s2.insertRecord(123, "Pixy");
		s1.displayInformation();
		s2.displayInformation();
	}
}
