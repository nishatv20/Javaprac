package com.nishat.helloworldprogram;

interface Bank {
	float rateOfInterest();
}

class SBI implements Bank {
	public float rateOfInterest() {
		return 9.15f;

	}
}

class ICICI implements Bank {
	public float rateOfInterest() {
		return 9.7f;
	}
}

class SBII implements Bank {
	public float rateOfInterest() {
		return 8.8f;
	}
}

public class TestInterface2 {
	public static void main(String[] args) {
		Bank b = new SBI();
		System.out.println("ROI" + " " + b.rateOfInterest());
	}
}
