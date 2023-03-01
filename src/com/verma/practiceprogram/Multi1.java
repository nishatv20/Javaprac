package com.verma.practiceprogram;

public class Multi1 implements Runnable {
	public void run() {
		System.out.println("Thread is running yaar !!!!");
	}

	public static void main(String[] args) {
		Multi1 m1 = new Multi1();
		Thread t1 = new Thread(m1);
		t1.start();
	}
}
