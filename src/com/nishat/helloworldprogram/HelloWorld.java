package com.nishat.helloworldprogram;

public class HelloWorld {
	public static void main(String[] args) {
		int year = 3;
		int marks = 80;
		switch (year) {

		case 1:
			System.out.println("First year students");
			break;

		case 2:
			System.out.println("Second year students");
			break;

		case 3:
			switch (marks) {

			case 50:
				System.out.println("You\'re not eligible for Scholorship");
				break;

			case 80:
				System.out.println("Congrats you\'re eligible for Scholorship");
				break;

			}
			break;

		default:
			System.out.println("Please enter valid year");
		}
	}
}
