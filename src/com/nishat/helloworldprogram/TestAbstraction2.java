package com.nishat.helloworldprogram;

abstract class Bike9 {
	Bike9() {
		System.out.println("Bike is Created");
	}

	abstract void run();

	void changeGear() {
		System.out.println("Gear Changed");
	}
}

class Honda extends Bike9 {
	void run() {
		System.out.println("Running Safely");
	}
}

public class TestAbstraction2 {
	public static void main(String[] args) {
		Bike9 obj = new Honda();
		obj.run();
		obj.changeGear();
	}

}
