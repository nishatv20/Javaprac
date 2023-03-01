package com.nishat.helloworldprogram;

class Animal1 {
	void eat() {
		System.out.println("Eating...");
	}
}

class Dog1 extends Animal1 {
	void bark() {
		System.out.println("Barking....");
	}
}

class BabyDog extends Dog1 {
	void weep() {
		System.out.println("Weeping.....");
	}
}

public class TestInheritance2 {
	public static void main(String[] args) {
		BabyDog b = new BabyDog();
		b.weep();
		b.bark();
		b.eat();
	}
}
