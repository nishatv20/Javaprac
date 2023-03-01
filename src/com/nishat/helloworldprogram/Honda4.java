package com.nishat.helloworldprogram;

abstract class Bike {
	abstract void run();
}

public class Honda4 extends Bike {

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("running safely");
	}

	public static void main(String[] args) {
		Bike obj = new Honda4();
		obj.run();
	}

}
