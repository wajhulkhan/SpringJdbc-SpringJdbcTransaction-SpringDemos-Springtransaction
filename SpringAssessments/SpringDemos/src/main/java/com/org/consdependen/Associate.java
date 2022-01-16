package com.org.consdependen;

import org.springframework.stereotype.Component;

@Component
public class Associate implements Employee{

	
	public Associate() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doWork() {
		System.out.println("Associate - Working");
		
	}

}
