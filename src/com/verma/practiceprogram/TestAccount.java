package com.verma.practiceprogram;

public class TestAccount {
	public static void main(String[] args) {
		Account ac = new Account();
		ac.setAcc_no(74516256);
		ac.setName("Nishat");
		ac.setEmail("vera@gamil.com");
		ac.setAmount(5000f);

		System.out.println(ac.getAcc_no() + " " + ac.getName() + " " + ac.getEmail() + " " + ac.getAmount());
	}
}
