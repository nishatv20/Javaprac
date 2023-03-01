package com.nishat.helloworldprogram;

public class ConstOverload {
int id;
String name;
int age;

ConstOverload(int i, String n) {
	id = i;
	name = n;
}

ConstOverload(int i, String n, int a) {
	id = i;
	name = n;
	age = a;
}

void display() {
	System.out.println(id + " " + name + " " + age);
}

public static void main(String[] args) {
	ConstOverload c1 = new ConstOverload(123, "Nishat");
	ConstOverload c2 = new ConstOverload(1234, "Anvi", 8);
	c1.display();
	c2.display();
}
}
