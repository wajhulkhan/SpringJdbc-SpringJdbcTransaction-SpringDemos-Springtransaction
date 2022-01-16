package com.org.consdependen;

import org.springframework.stereotype.Component;

@Component
public class Manager implements Employee{
	Accountant acc;
	Associate aso;
	
	//constructor based dependency
	public Manager(Accountant acc, Associate aso) {
		System.out.println("Manage Constructor");
		this.acc = acc;
		this.aso=aso;
	}

	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		System.out.println("Manager - MAnage the branch office");
	}
	
	public void callMeeting() {
		acc.doWork();
		aso.doWork();
	}

}
