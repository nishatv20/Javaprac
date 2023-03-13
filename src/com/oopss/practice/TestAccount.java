package com.oopss.practice;

class Account {
	int acc_no;
	String name;
	float amount;

//	Method to initialize object 
	void insert(int a, String n, float amt) {
		acc_no = a;
		name = n;
		amount = amt;
	}

//	Deposit Method
	void deposit(float amt) {
		amount = amount + amt;
		System.out.println(amt + "deposited");
	}

//	Withdraw Method
	void withdraw(float amt) {
		if (amount < amt) {
			System.out.println("Insufficient Account Balance");
		} else {
			amount = amount - amt;
			System.out.println(amt + "Withdrawn");
		}
	}

//	Method to check Account Balance
	void checkBalance() {
		System.out.println("Balance is:" + amount);
	}

//	Method to display the values of Object
	void display() {
		System.out.println(acc_no + " " + name + " " + amount);
	}
}

public class TestAccount {
	public static void main(String[] args) {
		Account a1 = new Account();
		a1.insert(123654, "Nishat", 10000);
		a1.display();
		a1.checkBalance();
		a1.deposit(5000);
		a1.checkBalance();
		a1.withdraw(2000);
		a1.checkBalance();
	}

}
