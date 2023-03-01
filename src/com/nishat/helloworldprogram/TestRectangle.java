package com.nishat.helloworldprogram;

class Rectangle {
	int length;
	int width;

	void insert(int l, int w) {
		length = l;
		width = w;
	}

	void area() {
		System.out.println("Area of Rectangle is :" + (length * width));
	}
}

public class TestRectangle {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		r1.insert(10, 15);
		r2.insert(11, 10);

		r1.area();
		r2.area();
	}

}
