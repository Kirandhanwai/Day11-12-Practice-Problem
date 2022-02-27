package com.blz.java;

import java.util.Scanner;

public class Account {
	static Scanner scanner = new Scanner(System.in);
	private double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	public void debit(double balance) {
		System.out.println("Enter The Withdraw Amount");
		double withdraw = scanner.nextDouble();
		if (withdraw > balance)
			System.out.println("Debit amount exceeded account balance.");
		else
			balance = balance - withdraw;
		System.out.println("Remaining balance is " + balance);

	}

	public static void main(String[] args) {
		System.out.println("Mention The Account Balance");
		Account account = new Account(scanner.nextDouble());
		account.debit(account.balance);
	}


}
