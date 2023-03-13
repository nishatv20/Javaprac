package com.oopss.practice;

class Vehicle {
	void run() {
		System.out.println("Vehicle is running");
	}
}

public class Bike extends Vehicle {
	void run() {
		System.out.println("Bike is Running Safely");
	}

	public static void main(String[] args) {
		Bike pulsar = new Bike();
		pulsar.run();
	}
}
