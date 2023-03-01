package com.nishat.helloworldprogram;

class Account {
	int acc_no;
	String name;
	float amount;

	void insert(int a, String n, float amt) {
		 acc_no = a;
		 name = n;
		 amount = amt;
	}

	void deposit(float amt) {
		amount = amount + amt;
		System.out.println(amt + " deposited");
	}

	void withdraw(float amt) {
		if (amount < amt) {
			System.out.println("Insufficient Balance");
		} else {
			amount = amount - amt;
			System.out.println(amt + " withdrawn");
		}
	}

	void checkBalance() {
		System.out.println(amount + " Balance ");
	}

	void display() {
		System.out.println("Account Details :- " + acc_no + " " + name + " " + amount);
	}
}

public class TestAcoount {
	public static void main(String[] args) {
		Account a1 = new Account();
		a1.insert(12345, "Nishat", 12000);
		a1.display();
		a1.deposit(10000);
		a1.checkBalance();
		a1.withdraw(2000);
		a1.checkBalance();
	}

}
