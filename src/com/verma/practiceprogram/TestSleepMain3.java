package com.verma.practiceprogram;

public class TestSleepMain3 {
	public static void main(String[] args) {
		try {
			for (int j = 1; j < 5; j++) {
				Thread.sleep(100);
				System.out.println(j);
			}
		}

		catch (Exception expn) {
			System.out.println(expn);
		}
	}
}
