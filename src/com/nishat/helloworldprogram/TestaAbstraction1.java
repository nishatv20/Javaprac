package com.nishat.helloworldprogram;

abstract class Shape {
	abstract void draw();
}

class Rectangle7 extends Shape {
	void draw() {
		System.out.println("Drawing Rectangle");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("Drawing circle");
	}
}

public class TestaAbstraction1 {
	public static void main(String[] args) {
		Shape s = new Circle();
		s.draw();
		Shape r = new Rectangle7();
		r.draw();
	}
}
