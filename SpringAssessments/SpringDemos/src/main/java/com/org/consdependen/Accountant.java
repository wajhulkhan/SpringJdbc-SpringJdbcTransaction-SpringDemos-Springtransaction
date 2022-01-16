package com.org.consdependen;

import org.springframework.stereotype.Component;

@Component
public class Accountant implements Employee{

	public Accountant() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Inside accouuntant constructor");
	}
	
	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		System.out.println("Accountant - Audit the accounts....");
	}



}
