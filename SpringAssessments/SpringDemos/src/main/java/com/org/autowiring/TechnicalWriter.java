package com.org.autowiring;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.*;
@Component
public class TechnicalWriter implements Writer {
	// autowird with fields
	@Autowired
	private Award a1;
	
	// autowiring through methods
	@Autowired
	public void printWriter(Award a1) {
		this.a1=a1;
	}
	
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("Write technical stuff...");
	}

	
	public void getAward() {
		// TODO Auto-generated method stub
		a1.award();
	}

	
}
