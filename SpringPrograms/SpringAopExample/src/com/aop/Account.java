package com.aop;

public class Account implements Bank{

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Withdraw Code");
		
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposit Code");
	}

}
