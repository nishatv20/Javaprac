package com.verma.practiceprogram;

public class TestMethod1 extends Thread {
	public void run() {
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		TestMethod1 t1 = new TestMethod1();
		TestMethod1 t2 = new TestMethod1();
		TestMethod1 t3 = new TestMethod1();

		t1.start();
		try {
			t1.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		t2.start();
		t3.start();
	}
}
